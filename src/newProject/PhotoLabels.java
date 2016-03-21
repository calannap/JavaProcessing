/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author lee
 */
public class PhotoLabels extends RotatedJLabel implements MouseListener,Colleague  {
    private int angle;
    private Mediator med = Mediator.getMediator();
    private int i;
    private ImgReader reader = ImgReader.getSingle();
    private boolean wasDoubleClick;
    private Timer timer;
    private int x,y;
    
    public PhotoLabels(int gridnum){
        super("",null, JLabel.CENTER);
        if(gridnum!=1)
        addMouseListener(this);
    }

    @Override
    public void setSize(int a,int b){
        super.setSize(a,b);
        if(x==0 && y==0){
        x=b;
        y=a;
        }
    }
        
    public void resetAngle(){
        angle=0;
        setRotation(angle);
    }
    @Override
    public void setRotation(double a){
        angle += a;
        super.setRotation(angle);
    }
    
    
   public void setI(int n){
        i = n;
    }
    
   public int getI(){
       return i;
   }
            
            

    public void setIndex(int n){
        i = n;
    }
    
    public int getIndex(){
       return i;
    }
    
    
    public void setIcon(Image img){
        super.setIcon(rescaleImage(createBI(img),x,y));
    }
    
    public BufferedImage getBI(){
        return createBI(((ImageIcon)getIcon()).getImage());
    }
    
    

    
    
    public void unblurImg(int a) throws IOException{
                // Create a buffered image from the source image with a format that's compatible with the screen

        ImageIcon icon = (ImageIcon) this.getIcon();
        Image image;     
        BufferedImage unblurImage = new BufferedImage(icon.getIconWidth() , icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        
        Image img = reader.getPhoto(i);

        BufferedImage copyOfImage = 
           new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_INT_RGB);
        Graphics2D gtmp = copyOfImage.createGraphics();
        gtmp.drawImage(img, 0, 0, null);        
        gtmp.dispose();
        

        Kernel K = new Kernel(5,5,new float[]{1,4,7,4,1,
                                              4,16,26,16,4,
                                              7,26,41,26,7,
                                              4,16,26,16,4,
                                              1,4,7,4,1});



        RichardsonLucyFilter rlf = new RichardsonLucyFilter(K, med.getIterations());
        
       // unblurImage = rlf.apply(unblurImage);
        
        copyOfImage = rlf.apply(copyOfImage);
        
        
        Graphics2D g = unblurImage.createGraphics();
        g.drawImage(copyOfImage, 0, 0,icon.getIconWidth()  ,icon.getIconHeight()  , null);
        //g.drawImage(reader.getPhoto(i), 0, 0,icon.getIconWidth()  ,icon.getIconHeight()  , null);
        g.dispose();
        
        
        image = (unblurImage);
        icon=new ImageIcon(image);
        setIcon(icon);
        validate();
        

    }
            
    public void resizeImg(double a) throws IOException{
        ImageIcon icon = (ImageIcon) this.getIcon();
        Image image;
        int newImageWidth = (int) (icon.getImage().getWidth(this) * a);
        int newImageHeight = (int) (icon.getImage().getHeight(this) * a);
        x = newImageWidth; y= newImageHeight;
        setSize(new Dimension(newImageWidth,newImageHeight));
        BufferedImage resizedImage = new BufferedImage(newImageWidth , newImageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(reader.getPhoto(i), 0, 0, newImageWidth , newImageHeight , null);
        g.dispose();
                
        image = (resizedImage.getScaledInstance(newImageWidth, newImageHeight, 0));
        icon=new ImageIcon(image);
        setIcon(icon);
        validate();        

    }

    public BufferedImage createBI(Image img){
        Image source = img;
        int w = source.getWidth(null);
        int h = source.getHeight(null);
        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D)image.getGraphics();
        g2d.drawImage(source, 0, 0, null);
        g2d.dispose();
        return image;
    }
    
    static public ImageIcon rescaleImage(BufferedImage image,int maxHeight, int maxWidth){
         
        int newHeight = 0, newWidth = 0;        // Variables for the new height and width
        int priorHeight = 0, priorWidth = 0;

        ImageIcon sizeImage;
        sizeImage = new ImageIcon(image);

        if(sizeImage != null)
        {
            priorHeight = sizeImage.getIconHeight(); 
            priorWidth = sizeImage.getIconWidth();
        }

        // Calculate the correct new height and width
        if((float)priorHeight/(float)priorWidth > (float)maxHeight/(float)maxWidth)
        {
            newHeight = maxHeight;
            newWidth = (int)(((float)priorWidth/(float)priorHeight)*(float)newHeight);
        }
        else 
        {
            newWidth = maxWidth;
            newHeight = (int)(((float)priorHeight/(float)priorWidth)*(float)newWidth);
        }

        // Resize the image
        // 1. Create a new Buffered Image and Graphic2D object
        BufferedImage resizedImg = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();

        // 2. Use the Graphic object to draw a new image to the image in the buffer
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2.drawImage(image, 0, 0, newWidth, newHeight, null);
        g2.dispose();
        // 3. Convert the buffered image into an ImageIcon for return
        
        return (new ImageIcon(resizedImg));
}

    @Override
    public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                try { 
                    med.setPhoto(i);
                } catch (IOException ex) {
                    Logger.getLogger(PhotoLabels.class.getName()).log(Level.SEVERE, null, ex);
                }
                wasDoubleClick = true;
            } else {

                timer = new Timer(500, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        if (wasDoubleClick) {
                            wasDoubleClick = false; // reset flag
                        } else {
                                  reader.setSelected(i);
      
                                if(reader.getSelected()[i])
                                    setBorder(BorderFactory.createLineBorder(Color.red));
                                else
                                    setBorder(null);
                        }
                    }
                });
                timer.setRepeats(false);

                timer.start();
            }

        }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void sendInput(Mediator m) {
        m.nextPhoto(i);
    }

    @Override
    public void receiveInput(int n) {
    }


}

