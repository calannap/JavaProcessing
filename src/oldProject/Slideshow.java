/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oldProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lee
 */
public class Slideshow  extends javax.swing.JFrame {
     public Slideshow(Image [] imgs,int w,int h) {
        initComponents();
        SetPhotos(imgs,w,h);
  
    }
     private void initComponents() {
         jPanel1 = new JPanel();
         jLabel1 = new JLabel(null,null,JLabel.CENTER);
         add(jPanel1);
         jPanel1.add(jLabel1);
     }
        private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:

        if(evt.getKeyCode()==27)
            this.dispose();
        
    }                               

    public void SetPhotos(final Image[] imags,final int w, final int h)
    {

 
        jPanel1.setBackground(Color.black);
        
        
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
           
            BufferedImage img = JavaImaging.createBufferedImage(imags[n++], jPanel1);
            final ImageIcon temp = JavaImaging.rescaleImage(img, h, w);
            jLabel1.setIcon(temp);
            
            if(n==imags.length)
                n=1;
          
                  
        }
        }, 0, 2, TimeUnit.SECONDS);
    
                   
  
        
      
    
}
    int n=1;
    private javax.swing.JLabel jLabel1;
    // Variables declaration - do not modify
    private javax.swing.JPanel jPanel1;
}
