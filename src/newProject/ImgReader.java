/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author lee
 */
public class ImgReader extends Thread implements Colleague {
    
    private static ImgReader reader = new ImgReader(); // Instanziazzione singleton di imgreader
    private String path; //path da dove leggere le immagini
    private static File dir; 
    private static final String[] EXTENSIONS = new String[]{"gif", "png", "bmp","jpg","JPG"}; //estensioni
    private List<BufferedImage> images = new ArrayList<BufferedImage>();
    private List<File> files = new ArrayList<File>();
    private boolean [] selected;
    private Memento memento;
    
    private Mediator med = Mediator.getMediator();
    
     public void setPath(String s) throws IOException
        {
            path = s;
        }
     
     public void run(){

            int a=0; // indice dell'array
            dir = new File(path);

            if (dir.isDirectory()) { // controlla se è una directory
                for (File f : dir.listFiles(IMAGE_FILTER)) { // scorre i file e li inizializza nell'array
                    try {
                        if(ImageIO.read(f)!=null){
                            images.add(rescaleImage((ImageIO.read(f)),400,300));
                            files.add(f);
                            selected = new boolean[images.size()];
                        }
                    } catch (final IOException e) {
                        System.err.println("Foto non letta");
                    }
                } 
            }
            
            reader.interrupt();
            
     }
     private void setImages() 
         {

         }
     
     public BufferedImage getPhoto(int n) throws IOException{
         return ImageIO.read(files.get(n));
     }
        
     public void deleteFile(int i)
     {
         files.get(i).delete();
         files.remove(i);
         images.remove(i);
     }
    static public BufferedImage rescaleImage(BufferedImage image,int maxHeight, int maxWidth){
         
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
        return resizedImg;
}
        public List<BufferedImage> getImages(){
            return images;
        }
     
     public static ImgReader getSingle(){
            return reader;
        }
     
     public boolean [] getSelected(){
            return selected;
        }
     
     public void setSelected(int n){
            selected[n] = !selected[n];
        }
     
     public int numPhotos (){
            return images.size();
     }
     
     public void skewPhotos(){
            
            memento = new Memento(files,images);
         
            int count=0;
            BufferedImage [] temp;
            File [] tempfi;
            for (int i=0;i<selected.length;i++)
                if(selected[i]) count++;
            
            temp = new BufferedImage[count];
            tempfi= new File[count];
            count=0;
            
            for (int i=0;i<images.size();i++){
                if(selected[i]){
                    temp[count] = images.get(i);
                    tempfi[count] = files.get(i);
                    count++;
                }
            }
            images = new <BufferedImage>ArrayList();
            files = new <File>ArrayList();
            
            for(int i=0;i<temp.length;i++){
                images.add(temp[i]);
                files.add(tempfi[i]);
            }
            selected = new boolean[images.size()];
            sendInput(med);
     }
     
     public void undo(){
         if(memento.getSavedFiles()!=null){
         files = memento.getSavedFiles();
         images = memento.getSavedImages();
         selected = new boolean[images.size()];
         sendInput(med);
         }
     }
     
     // Filtro per selezionare soltanto i file con i formati prescelti
      private static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {
        @Override
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };
      
      

    @Override
    public void sendInput(Mediator m) {
        m.repaintPanel();
    }

    @Override
    public void receiveInput(int n) {
        skewPhotos();
    }


}
