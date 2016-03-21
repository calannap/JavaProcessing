package newProject;


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author salvatorecalanna
 */
public class ChooseProject extends javax.swing.JFrame {


    public ChooseProject() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Annulla");

        jButton2.setText("Apri Album");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click(evt);
            }
        });

        jButton3.setText("Nuovo Album");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Scegli un opzione");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(98, 98, 98)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 96, Short.MAX_VALUE)
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
        
        
        JFileChooser fc;
        fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);         
        fc.setAcceptAllFileFilterUsed(false);
         
        
       if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
            { 
                System.out.println("getCurrentDirectory(): " + fc.getCurrentDirectory());
                System.out.println("getSelectedFile() : " +  fc.getSelectedFile());
            }
       
      else 
            System.out.println("No Selection ");
      
       
     if(fc.getSelectedFile()!=null)
            {
            try {
                ImgReader.getSingle().setPath(fc.getSelectedFile().getPath());
            } catch (IOException ex) {
                Logger.getLogger(ChooseProject.class.getName()).log(Level.SEVERE, null, ex);
            }
            Thread t1 = new Thread(ImgReader.getSingle());
            Thread t2 = new Thread(new GUI());
            t1.start();
            t2.start();
                this.dispose();

                 
            }
    }//GEN-LAST:event_click

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    
        String directory = (String) JOptionPane.showInputDialog(null, "Inserisci il nome dell'album", "Crea Album", JOptionPane.INFORMATION_MESSAGE, null, null, "");

        if(directory!=null){
        JFileChooser fc;
         fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);         
        fc.setAcceptAllFileFilterUsed(false);
         
        
            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  fc.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  fc.getSelectedFile());
      }
    else {
      System.out.println("No Selection ");
      }
            
            
    boolean success = (new File(fc.getSelectedFile()+"/"+directory)).mkdir();
 
if (success) {
    System.out.println("Ho creato: " + directory);
} else {
    System.out.println("Impossibile creare: " + directory);
}
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
