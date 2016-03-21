

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 *
 * @author lee
 */
public class Paneldisp1 extends PanelInterface implements MouseMotionListener,MouseListener,Colleague{
    private Mediator med = Mediator.getMediator();
    private BufferedImage image;
    private int transX,transY,clickX,clickY,releaseX,releaseY;
    int r=0,g=0,b=0,lum;
    public Paneldisp1()
    {
        super(1);
        med.setPanel1(this);
        addMouseMotionListener(this);
        addMouseListener(this);
        dispPhotos[0].removeMouseListener(this);
    }
    
    @Override
    void setgrid(int n) {
        return;
    }

    @Override
    public void setPhotos(){
        super.resetLabels();
            
        if ( index<reader.numPhotos()){   
                    ((PhotoLabels)dispPhotos[0]).resetAngle();
             try {
                    // Imposto l'immagine nella label
                    image = reader.getPhoto(index);
                    ((PhotoLabels)dispPhotos[0]).setIcon(image);
                } catch (IOException ex) {
                    Logger.getLogger(Paneldisp1.class.getName()).log(Level.SEVERE, null, ex);
                }
             // Imposto sulla Jlabel l'indice dell'immagine
             ((PhotoLabels)dispPhotos[0]).setIndex(index); 
                
             if(reader.getSelected()[index]){
                 dispPhotos[0].setBorder(BorderFactory.createLineBorder(Color.red));
                        }
                    }   
     }
    public void setPhoto(int n) throws IOException{
        index = n;
        setPhotos();
    }
    
   public void setRGB(int a,int c,int d)
    {
       BufferedImage img = new BufferedImage(image.getWidth(),image.getHeight(),BufferedImage.TYPE_INT_RGB);
       for(int i=0;i<image.getWidth();i++)
        {
            for (int j=0;j<image.getHeight();j++)
            {
                int r = (printPixelARGB(image.getRGB(i, j))[0])+a;
                if(r<0)r=0;
                if(r>255)r=255;
                
                int g = (printPixelARGB(image.getRGB(i, j))[1])+c;
                if(g<0)g=0;
                if(g>255)g=255;
                
                int b = (printPixelARGB(image.getRGB(i, j))[2])+d;
                if(b<0)b=0;
                if(b>255) b=255;
                
                img.setRGB(i, j,new Color(r, g, b).getRGB() );
                
            }
        }

       ((PhotoLabels)dispPhotos[0]).setIcon(img);
       
    }
   
  public int [] printPixelARGB(int pixel) {
         int alpha = (pixel >> 24) & 0xff;
         int [] rgb = new int [3];
         rgb[0] = (pixel >> 16) & 0xff;
         rgb[1] = (pixel >> 8) & 0xff;
         rgb[2] = (pixel) & 0xff;
         return rgb;
  }
  
    public void mouseDragged(MouseEvent e) {
        transX = e.getX()-clickX+releaseX;
        transY = e.getY()-clickY+releaseY;
        this.dispPhotos[0].setLocation(transX,transY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        clickX = e.getX();
        clickY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        releaseX=transX;
        releaseY=transY;
    }
    
    public void modifyColors(int value,String color){
  
        switch(color){
            case "red":
                r=value;
                setRGB(r+lum,g+lum,b+lum);
                break;
            case "green":
                g=value;
                setRGB(r+lum,g+lum,b+lum);
                break;
            case "blue":
                b=value;
                setRGB(r+lum,g+lum,b+lum);
                break;
            case "lum":
                lum=value;
                setRGB(r+lum,g+lum,b+lum);
                break;
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

      int i = ((PhotoLabels)dispPhotos[0]).getI();
      reader.setSelected(i);
      
      if(reader.getSelected()[i])
          dispPhotos[0].setBorder(BorderFactory.createLineBorder(Color.red));
      else
          dispPhotos[0].setBorder(null);
      
    }

    public void mouseMoved(MouseEvent e) {}
    public void sendInput(Mediator m) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void receiveInput(int n) {}


    
}
