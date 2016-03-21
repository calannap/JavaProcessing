
package oldProject;

import java.io.File;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.WritableRaster;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;



/**
 *
 * @author salvatorecalanna
 */
public class JavaImaging extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static String album,album2;
       public Image images[];
    public JavaImaging(String path,String path2)
    {
        super(path);
        album = path;
        album2 = path2;
        initComponents();
        initlabels();
        LoadPhoto(0);
        
    }
    public JavaImaging() {
        initComponents();
    }

    
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSlider4 = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSlider5 = new javax.swing.JSlider();
        jButton20 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("16");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("9");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/148300.gif"))); // NOI18N
        jButton5.setText("Stampa");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/149276.gif"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145451.gif"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/148890.gif"))); // NOI18N
        jButton9.setText("Presentazione");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145011-2.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145388.gif"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14501ew1-2.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setText("Filtri");

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/146821.gif"))); // NOI18N
        jButton21.setText("Cestino");

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145187.gif"))); // NOI18N
        jButton24.setText("Importa");

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/146771.gif"))); // NOI18N
        jButton25.setText("Esporta");

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/149407.gif"))); // NOI18N
        jButton26.setText("Archivio");

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/144925.gif"))); // NOI18N
        jButton12.setText("Scremare");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/147878.gif"))); // NOI18N
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton32MouseClicked(evt);
            }
        });
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/144795.gif"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145165.gif"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/145431.gif"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/147659.gif"))); // NOI18N
        jButton1.setText("Formatta");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/147654.gif"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/149282.gif"))); // NOI18N

        jLabel1.setText("N. 0 Foto Selezionate");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 772, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 576, Short.MAX_VALUE)
        );

        jSlider1.setMaximum(127);
        jSlider1.setMinimum(-127);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setMaximum(127);
        jSlider2.setMinimum(-127);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jSlider3.setMaximum(127);
        jSlider3.setMinimum(-127);
        jSlider3.setValue(0);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("C");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("R");

        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("G");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("B");

        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("M");

        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Y");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel6)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel7))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSlider3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .add(jSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSlider2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSlider1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSlider2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel5))
                    .add(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSlider3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Colori", jPanel5);

        jSlider4.setMinimum(-100);
        jSlider4.setValue(0);
        jSlider4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider4StateChanged(evt);
            }
        });

        jLabel8.setText("Luminosità");

        jLabel9.setText("Contrasto");

        jSlider5.setMaximum(255);
        jSlider5.setMinimum(-255);
        jSlider5.setValue(0);
        jSlider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider5StateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSlider4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .add(jSlider5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSlider5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSlider4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bilanciamento", jPanel6);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/147844.gif"))); // NOI18N
        jButton20.setText("Seleziona ");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 534, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/149240.gif"))); // NOI18N
        jMenuItem1.setText("Crea nuovo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apri(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/147021.gif"))); // NOI18N
        jMenuItem5.setText("Apri");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/146794.gif"))); // NOI18N
        jMenuItem6.setText("Salva");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/149278.gif"))); // NOI18N
        jMenuItem7.setText("Salva con nome");
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator1);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jMenuItem8.setText("Uscita");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modifica");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Strumenti");

        jMenu5.setText("Filtri");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        jMenuItem2.setText("Seppia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMenuItem3.setText("Bianco e nero");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0));
        jMenuItem4.setText("Scala di Grigi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aiuto");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 267, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jButton14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, Short.MAX_VALUE)
                                .add(jButton17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jButton10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTabbedPane1)
                    .add(jButton26, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jButton34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jButton32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButton33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton21, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .add(jButton8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .add(jButton20, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButton12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(jButton24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(new java.awt.Component[] {jButton10, jButton11, jButton13, jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton31}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jButton9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jButton26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton2)
                            .add(jButton6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE, false)
                            .add(jButton8)
                            .add(jButton7))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jButton20, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .add(jButton12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton31, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton19, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton17, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jButton16, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .add(jButton18, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .add(jButton13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                    .add(jButton4)
                    .add(jButton21, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(0, 0, 0))
        );

        layout.linkSize(new java.awt.Component[] {jButton10, jButton11, jButton13, jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton31}, org.jdesktop.layout.GroupLayout.VERTICAL);

        layout.linkSize(new java.awt.Component[] {jButton24, jButton25}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void Apri(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apri
        // TODO add your handling code here:
        
     
         
    }//GEN-LAST:event_Apri

    private void jButton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseClicked
        // TODO add your handling code here:
        
    
        
      
    }//GEN-LAST:event_jButton32MouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        angle-=90;
        loadphoto.setRotation(angle);
        loadphoto.repaint();
   
            
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        angle+=90;
        loadphoto.setRotation(angle);
        loadphoto.repaint();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(grid==1){
    
        int newImageWidth = (int) (icon.getImage().getWidth(this) * 1.1);
        int newImageHeight = (int) (icon.getImage().getHeight(this) * 1.1);
        loadphoto.setSize(new Dimension(newImageWidth,newImageHeight));
        loadphoto.validate();
        BufferedImage resizedImage = new BufferedImage(newImageWidth , newImageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(images[dx+1], 0, 0, newImageWidth , newImageHeight , null);
        g.dispose();
        
         image = resizedImage.getScaledInstance(newImageWidth, newImageHeight, 0);
        icon=new ImageIcon(resizedImage.getScaledInstance(newImageWidth, newImageHeight, 0));
        loadphoto.setIcon(icon);
        loadphoto.validate();

        
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        //j+=5;
        if(grid==1){
        
        int newImageWidth = (int) (icon.getImage().getWidth(this) * 0.9);
        int newImageHeight = (int) (icon.getImage().getHeight(this) * 0.9);
        loadphoto.setSize(new Dimension(newImageWidth,newImageHeight));
        loadphoto.validate();
        BufferedImage resizedImage = new BufferedImage(newImageWidth , newImageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(images[dx+1], 0, 0, newImageWidth , newImageHeight , null);
        g.dispose();
        
        image = (resizedImage.getScaledInstance(newImageWidth, newImageHeight, 0));
        icon=new ImageIcon(image);
        loadphoto.setIcon(icon);
        loadphoto.validate();

      
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        
        transX = evt.getX()-MouseX+X;
        transY = evt.getY()-MouseY+Y;


        if(grid==1){
            for (Component comp : getComponents())
                if(selection==1)
            loadphoto.setLocation(transX, transY);
                else text.setLocation(transX,transY);
        }

      
        repaint();
        revalidate();

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:      
        X=transX;
        Y=transY;
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        if( jPanel1.getComponentCount()>1 && text.getBounds().x < evt.getX() && text.getBounds().y < evt.getY() && (text.getBounds().x+text.getBounds().width) > evt.getX() && (text.getBounds().y+text.getBounds().height) > evt.getY() ) {
          selection =0;
       
        }        
        else if(loadphoto.getBounds().x < evt.getX() && loadphoto.getBounds().y < evt.getY() && (loadphoto.getBounds().x+loadphoto.getBounds().width) > evt.getX() && (loadphoto.getBounds().y+loadphoto.getBounds().height) > evt.getY() )
            selection =1;
        
        
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        
         
    if(grid==1 && inar+3 <= dir.listFiles().length ) 
        {
            inar+=1;
            if(dx==16) {
            ReadImgs(dir,images,inar);
            dx=0;
            }
            SetPhoto(dx++);
        }
         
    if(grid==4 && dx4 < images.length)
    {
        resetBorder();
        v=0;
        paintx4(dx4,images);
        dx4+=4;
        
        setBorder(dx4,4);
    }
    
     if(grid==9 && dx9 < images.length)
     {
        resetBorder();
        paintx9(dx9);
        dx9+=9;
        v=0;
        setBorder(dx9,9);
    }
     
      if(grid==16 && dx16 < images.length)
      {
        resetBorder();
        paintx16(dx16);
        dx16+=16;
        v=0;
        setBorder(dx16,16);
    }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        if(grid==1 && inar>0) {
            System.out.println(inar+"  "+dx);
            inar-=1;
            dx--;
            if(dx==0) {
                ReadImgs(dir,images,inar);
                dx=16;
            }
            
            SetPhoto(--dx);
        }

        if(grid==4 && dx4>4)
        {
            resetBorder();
            v=0;
            dx4-=4;
            paintx4(dx4-4,images);
            setBorder(dx4,4);
        }
            
       if(grid==9 && dx9>9)
       {
           resetBorder();
           dx9-=9;
           paintx9(dx9-9);
           v=0;
           setBorder(dx9,9);
        }
                
        if(grid==16 && dx16>16)
        {
            resetBorder();
            dx16-=16;
            v=0;
            paintx16(dx16-16);
            setBorder(dx16,16);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(grid!=4){
            resetAll(jPanel1);
            grid=4;
            jPanel2 = new JPanel(new GridLayout(2,2));
            jPanel2.setSize(jPanel1.getSize());
         
            for(int i=0;i<4;i++)
                jLabel[i].setSize(jPanel1.getSize().height/2,jPanel1.getSize().width/2);
            
            paintx4(0,images);
            
            for(int i=0;i<4;i++)
                jPanel2.add(jLabel[i]);
            
            jPanel2.setBackground(Color.black);
            jPanel1.add(jPanel2);
            jPanel1.repaint();
            jPanel1.revalidate();
         }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     if(grid!=1){
        grid=1;
        resetAll(jPanel1);
        SetPhoto(0);
        dx=0;
     }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(grid!=9){
         resetAll(jPanel1);
         grid=9;
        
        jPanel3 = new JPanel(new GridLayout(3,3));
        jPanel3.setSize(jPanel1.getSize());
        
        for (int i=0;i<9;i++)
        jLabel[i].setSize(jPanel1.getSize().height/3,jPanel1.getSize().width/3);
        
        paintx9(0); 
        
        for (int i=0;i<9;i++)
           jPanel3.add(jLabel[i]);

        jPanel3.setBackground(Color.black);
        jPanel1.add(jPanel3);
        jPanel1.repaint();
        jPanel1.revalidate();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        if(grid!=16){
        resetAll(jPanel1);
        grid=16;
        jPanel4 = new JPanel(new GridLayout(4,4));
        jPanel4.setSize(jPanel1.getSize());
        
        
        
        jLabel[0].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[1].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[2].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[3].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[4].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[5].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[6].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[7].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[8].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[9].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[10].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[11].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[12].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[13].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[14].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
        jLabel[15].setSize(jPanel1.getSize().height/4,jPanel1.getSize().width/4);
     


        paintx16(0);
        
   
        jPanel4.add(jLabel[0]);
        jPanel4.add(jLabel[1]);
        jPanel4.add(jLabel[2]);
        jPanel4.add(jLabel[3]);
        jPanel4.add(jLabel[4]);
        jPanel4.add(jLabel[5]);
        jPanel4.add(jLabel[6]);
        jPanel4.add(jLabel[7]);
        jPanel4.add(jLabel[8]);
        jPanel4.add(jLabel[9]);
        jPanel4.add(jLabel[10]);
        jPanel4.add(jLabel[11]);
        jPanel4.add(jLabel[12]);
        jPanel4.add(jLabel[13]);
        jPanel4.add(jLabel[14]);
        jPanel4.add(jLabel[15]);

   
      
        jPanel4.setBackground(Color.black);
        jPanel1.add(jPanel4);
        jPanel1.repaint();
        jPanel1.revalidate();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
            int a = selectedImgs();
            Image[] images2 = new Image[a];
            
            a=0;
            for (int i=0;i<vals.length;i++)
                if(vals[i])
                    images2[a++]=images[i+1];
            
            images = new Image[images2.length+1];
            
            for (int i=0;i<images2.length;i++)
                images[i+1] = images2[i];
            
        if(grid==4)
        {
            dx4=4;
            paintx4(0,images);
        }
         if(grid==9)
        {
            dx9=9;
            paintx9(0);
        }
          if(grid==16)
        {
            dx16=16;
            paintx16(0);
        }
          
          for (int i=0;i<vals.length;i++)
             vals[i]=false;
          
          jLabel1.setText("N. "+(selectedImgs())+" Foto Selezionate");;
          resetBorder();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        try
        {
            BufferedImage imgtrf = createBufferedImage(image,loadphoto);
            setRGB(jSlider1.getValue(),jSlider2.getValue(),jSlider3.getValue(),imgtrf);
            loadphoto.setIcon(new ImageIcon (imgtrf));
            loadphoto.repaint();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        // TODO add your handling code here:  
        try
        {
            BufferedImage imgtrf = createBufferedImage(image,loadphoto);
            setRGB(jSlider1.getValue(),jSlider2.getValue(),jSlider3.getValue(),imgtrf);
            loadphoto.setIcon(new ImageIcon (imgtrf));
            loadphoto.repaint();  
            
        }      
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
        // TODO add your handling code here:   
        try
        {
            BufferedImage imgtrf = createBufferedImage(image,loadphoto);
            setRGB(jSlider1.getValue(),jSlider2.getValue(),jSlider3.getValue(),imgtrf);
            loadphoto.setIcon(new ImageIcon (imgtrf));
            loadphoto.repaint();       
        }      
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jSlider3StateChanged

    private void jSlider5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider5StateChanged
        // TODO add your handling code here:
         try
        {
            BufferedImage imgtrf = createBufferedImage(image,loadphoto);
            setRGB(jSlider5.getValue(),jSlider5.getValue(),jSlider5.getValue(),imgtrf);
            loadphoto.setIcon(new ImageIcon (imgtrf));
            loadphoto.repaint();     
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jSlider5StateChanged

    private void jSlider4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider4StateChanged
        // TODO add your handling code here:
        double asd = jSlider4.getValue() + 255;
        double asd2 = 259 - jSlider4.getValue();
        
        double factor = (259*asd)/(255*asd2);
            try
        {
            BufferedImage imgtrf = createBufferedImage(image,loadphoto);
        for(int i=0;i<image.getWidth(this);i++)
        {
            for (int j=0;j<image.getHeight(this);j++)
            {
              
                
              
             int r = printPixelARGB(imgtrf.getRGB(i, j))[0]-128;
             r= (int) (r*factor);
             r+=128;
             
                if(r<0)
                    r=0;
                if(r>255)
                    r=255;
                
               
               int g = printPixelARGB(imgtrf.getRGB(i, j))[1]-128;
             g= (int) (g*factor);
             g+=128;
                
                if(g<0)
                    g=0;
                if(g>255)
                    g=255;
                
                
          
            int b = printPixelARGB(imgtrf.getRGB(i, j))[2]-128;
             b= (int) (b*factor);
             b+=128;
                
                
                if(b<0)
                    b=0;
                if(b>255)
                    b=255;
                
                imgtrf.setRGB(i, j,new Color(r, g, b).getRGB() );
            }
        }
        loadphoto.setIcon(new ImageIcon (imgtrf));
        loadphoto.repaint();
        
        }
        
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
         
        repaint();
        validate();
        revalidate();
        
        
    }//GEN-LAST:event_jSlider4StateChanged

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
                angle+=10;
                loadphoto.setRotation(angle);
      
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        angle-=10;
         loadphoto.setRotation(angle);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jPanel1.setBackground(Color.white);
        printComponent(jPanel1);
        jPanel1.setBackground(Color.black);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        BufferedImage imgtrf = createBufferedImage(image,loadphoto);
        applySepiaFilter(imgtrf,30);
        loadphoto.setIcon(new ImageIcon (imgtrf));
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
      
      
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        BufferedImage imgtrf = createBufferedImage(image,loadphoto);
        RGBtoGray(imgtrf);
        loadphoto.setIcon(new ImageIcon(imgtrf));
        loadphoto.repaint();
        loadphoto.validate();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          BufferedImage imgtrf = createBufferedImage(image,loadphoto);
        GraytoBW(imgtrf);
        loadphoto.setIcon(new ImageIcon(imgtrf));
        loadphoto.repaint();
        loadphoto.validate();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
               GraphicsDevice[] gs = ge.getScreenDevices();

               GraphicsDevice gd;
 
            if(gs.length==1)
            gd = gs[0];
            else 
                gd=gs[1];
      
               
            GraphicsConfiguration[] gc = gd.getConfigurations();
 
            
            
         Rectangle gcBounds = gc[0].getBounds();
         int xoffs = gcBounds.x;
         int yoffs = gcBounds.y;
         
         Slideshow fpresentazione = new Slideshow(images,gd.getDisplayMode().getWidth(),gd.getDisplayMode().getHeight());

         fpresentazione.setLocation((1*50)+xoffs, (1*60)+yoffs);
         fpresentazione.setSize(new Dimension(gd.getDisplayMode().getWidth(),gd.getDisplayMode().getHeight()));
         fpresentazione.setVisible(true);
        
           
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:      
        selectAll();     
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
                
                String labeltext = (String) JOptionPane.showInputDialog(null, "Inserisci il testo", "Inserisci testo", JOptionPane.INFORMATION_MESSAGE, null, null, "");
                text = new RotatedJLabel(labeltext);
                text.setForeground(Color.red);
                text.setFont(new Font(text.getFont().getFontName(),Font.BOLD,30));
                resetAll(jPanel1);
                jPanel1.add(text);
                jPanel1.add(loadphoto);
                
              //  jScrollPane1.add(text);
              //  jScrollPane1.add(loadphoto);
                
    }//GEN-LAST:event_jButton13ActionPerformed

    public void selectAll()
    {
        int selectdx=0;
        
        switch(grid){
            case 4:
                selectdx=dx4-4;
                break;
            case 9:
                selectdx=dx9-9;
                break;
            case 16:
                selectdx=dx16-16;
                break;
        }
        for (int i=0;i<grid;i++){
            jLabel[i].setBorder(BorderFactory.createLineBorder(Color.red));
            vals[i+selectdx]=true;
        }
        
       
    }
    public void GraytoBW(BufferedImage img)
    {
        int w = img.getWidth();
    int h = img.getHeight();

    // Process 3 ints at a time for each pixel.
    // Each pixel has 3 RGB colors in array
    for (int i=0;i<w; i++) {
        for (int j=0;j<h;j++){
        int r = (printPixelARGB(img.getRGB(i, j))[0]);
        int g = (printPixelARGB(img.getRGB(i, j))[1]);
        int b = (printPixelARGB(img.getRGB(i, j))[2]);

        int gray = (r + g + b) / 3;
  
        if(gray<127)
            gray=0;
        else
            gray=255;

        img.setRGB(i, j,new Color(gray, gray, gray).getRGB() );
       
        }
    }
    }
    
    
    public void applySepiaFilter(BufferedImage img, int sepiaIntensity) {
    // Play around with this. 20 works well and was recommended
    // by another developer. 0 produces black/white image
    int sepiaDepth = 20;

    int w = img.getWidth();
    int h = img.getHeight();

    // Process 3 ints at a time for each pixel.
    // Each pixel has 3 RGB colors in array
    for (int i=0;i<w; i++) {
        for (int j=0;j<h;j++){
        int r = (printPixelARGB(img.getRGB(i, j))[0]);
        int g = (printPixelARGB(img.getRGB(i, j))[1]);
        int b = (printPixelARGB(img.getRGB(i, j))[2]);

        int gry = (r + g + b) / 3;
        r = g = b = gry;
        r = r + (sepiaDepth * 2);
        g = g + sepiaDepth;

        if (r>255) r=255;
        if (g>255) g=255;
        if (b>255) b=255;

        // Darken blue color to increase sepia effect
        b-= sepiaIntensity;

        // normalize if out of bounds
        if (b<0) b=0;
        if (b>255) b=255;

        img.setRGB(i, j,new Color(r, g, b).getRGB() );
       
        }
    }
    
}
    
private  void RGBtoGray(BufferedImage original) {
 
    int alpha, red, green, blue,gray;
  
 
 
    for(int i=0; i<original.getWidth(); i++) {
        for(int j=0; j<original.getHeight(); j++) {
 
            // Get pixels by R, G, B
            alpha = new Color(original.getRGB(i, j)).getAlpha();
            red = new Color(original.getRGB(i, j)).getRed();
            green = new Color(original.getRGB(i, j)).getGreen();
            blue = new Color(original.getRGB(i, j)).getBlue();
 
            gray = (int) (0.21 * red + 0.71 * green + 0.07 * blue);
            // Return back to original format
         
 
            // Write pixels into image
            original.setRGB(i, j, new Color(gray,gray,gray).getRGB());
            
 
        }
    }
 
  
 
}
  
    public int [] printPixelARGB(int pixel) {
            int alpha = (pixel >> 24) & 0xff;
            int [] rgb = new int [3];
            rgb[0] = (pixel >> 16) & 0xff;
            rgb[1] = (pixel >> 8) & 0xff;
            rgb[2] = (pixel) & 0xff;
            
            
            return rgb;
  }
  
    public void paintx4(int ind,Image[] img)
    {
        int i = setImages(4,ind);
        skimImages(4,ind,i);
      }
    
    public void paintx9(int ind)
    {
        int i = setImages(9,ind);
        skimImages(9,ind,i);
    }

    public void paintx16(int ind)
    {
        int i = setImages(16,ind);
        skimImages(16,ind,i);
    }
    
    public int setImages(int gr,int ind)
    {
         for( i=0;i<images.length && i<gr && i+1+ind < images.length;i++ )
        {
            icon = new ImageIcon(images[i+1]);
            jLabel[i].setIcon(rescaleImage(createBufferedImage(images[i+1+ind],jLabel[i]),jLabel[i].getHeight(),jLabel[i].getWidth()));
        }
         return i;
    }
    public void skimImages(int gr,int ind,int i0)
    {
      if(ind+gr+1 > images.length){
        for(int j=i0%gr; j<gr;j++){
           jLabel[j].setIcon(null);
      }
      }
    }
    
    public void setRGB(int a,int c,int d,BufferedImage img)
    {
                for(int i=0;i<image.getWidth(this);i++)
        {
            for (int j=0;j<image.getHeight(this);j++)
            {
                
                int r = (printPixelARGB(img.getRGB(i, j))[0])+a;
                if(r<0)
                    r=0;
                if(r>255)
                    r=255;
                
                int g = (printPixelARGB(img.getRGB(i, j))[1])+c;
                if(g<0)
                    g=0;
                if(g>255)
                    g=255;
                
                int b = (printPixelARGB(img.getRGB(i, j))[2])+d;
                if(b<0)
                    b=0;
                if(b>255)
                    b=255;
                
                img.setRGB(i, j,new Color(r, g, b).getRGB() );
            }
        }
    }
    public void LoadPhoto(int p)
    {

            loadphoto = new RotatedJLabel();
            loadphoto.setSize(jPanel1.getSize());
            jPanel1.add(loadphoto);
             dir = new File(album);
            
            //final File dir2 = new File(album2);
            int i=0;
            final String[] EXTENSIONS = new String[]{"gif", "png", "bmp","jpg"};
            //image2 = new Image[dir2.listFiles().length];
            images = new Image[17];
            vals = new boolean[(int)dir.length()];
            ReadImgs(dir,images,0);
          //  ReadImgs(dir2,image2);
            SetPhoto(0);

          /*  loghi = new JLabel[image2.length];
            for (int a=0;a<image2.length;a++)
            {
                loghi[a] = new JLabel();
                loghi[a].setSize(jPanel7.getWidth()/3,jPanel7.getHeight());
            }*/
          //  jPanel7.setSize(jPanel1.getWidth(),jButton3.getHeight());
          //  jPanel7.setLayout(new GridLayout(image2.length,1));
            
       /*   for(int j=2;j<image2.length;j++)
           {
               System.out.println(image2.length+"  "+j);
               loghi[j].setIcon((rescaleImage(createBufferedImage(image2[j],loghi[j]),195,534/3)));
               jPanel7.add(loghi[j]);
           }*/
    }
    public void ReadImgs(File fi,Image[] vet,int index)
    {
        int asd=index+16;
      
     if (fi.isDirectory()) {
         i=0;
            for (int j=index;j<fi.listFiles().length && j<asd ;j++) {
                try 
                {
                    vet[i++] = ImageIO.read(fi.listFiles()[j]);
                    
                } 
               
                catch (final IOException e) {}
                      
                
            }
            
        }
    }
    
    public void SetPhoto(int indice){

        System.err.println("Indice= "+indice);
        icon = (rescaleImage(createBufferedImage(images[indice+1],jPanel1),jPanel1.getHeight(),jPanel1.getWidth()));    
        loadphoto = new RotatedJLabel(dx+"",icon,(int)JLabel.CENTER_ALIGNMENT);
        loadphoto.setSize(jPanel1.getSize());
        image = icon.getImage();
        resetAll(jPanel1);
        jPanel1.add(loadphoto);
        jPanel1.repaint();
        jPanel1.validate();
    }
    
    public void resetBorder()
    {
         for(int o=0;o<jLabel.length;o++)
        jLabel[o].setBorder(null);
    }
    
    public void setBorder(int a,int b)
    {
         for(int j=(a-b);j<a && j<images.length;j++) 
            if(vals[j])            
                 jLabel[j%b].setBorder(BorderFactory.createLineBorder(Color.red));   
    }
   
  public int selectedImgs()
  {
      int k=0;
      for (int i=0;i<vals.length;i++)
          if(vals[i])
              k++;
      return k;
  }
  public void initlabels(){
        
                selection=0;
           jLabel = new JLabel[16];
           
        for(int i=0;i<16;i++){
            jLabel[i] = new JLabel(null,null,JLabel.CENTER);
            jLabel[i].setBorder(null);
            jLabel[i].addMouseListener(new java.awt.event.MouseListener() {

            
          
           public void mouseClicked(MouseEvent e) {
                    
           
            for(click=0;click<jLabel.length;click++)
               if (e.getSource()== jLabel[click])
               {
                   
                   
                   if(l==click)
                       v++;
                   else
                       v=0;
                   
                   l=click;
                   
                   if(jLabel[click].getBorder()==null)
                   {
                        jLabel[click].setBorder(BorderFactory.createLineBorder(Color.red));
                        jLabel1.setText("N. "+(selectedImgs()+1)+" Foto Selezionate");
                        if(grid==4)
                        vals[click+(dx4-4)] = true;
                        if(grid==9)
                        vals[click+(dx9-9)] = true;
                        if(grid==16)
                        vals[click+(dx16-16)] = true;
                   }
                    
                   else{
                        jLabel[click].setBorder(null);
                        jLabel1.setText("N. "+(selectedImgs()-1)+" Foto Selezionate");
                        if(grid==4)
                        vals[click+(dx4-4)] = false;
                        if(grid==9)
                        vals[click+(dx9-9)] = false;
                        if(grid==16)
                        vals[click+(dx16-16)] = false;
                        
                   }
                   
                   if (v==2) {
                       
                   jLabel[click].setBorder(null);

                    jPanel1.removeAll();
                    jPanel1.repaint();
                    jPanel1.validate();

                    switch(grid){
                        case 4:
                            dx=l+(dx4-4)+1;
                            SetPhoto(dx-1);
                            grid=1;       

                            break;
                        case 9:
                            dx=l+(dx9-9)+1;
                            SetPhoto(dx-1);
                            grid=1;
                            break;
                        case 16:
                            dx=l+(dx16-16)+1;
                            SetPhoto(dx-1);
                            grid=1;
                            break;
                    }

                   }
              

                   
                }
            
                }

                @Override
                public void mousePressed(MouseEvent e) {
                
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                   
                }

                @Override
                public void mouseEntered(MouseEvent e) {
           
                }

                @Override
                public void mouseExited(MouseEvent e) {
           
                }
                
        });
        }
    }
 
  public void printComponent(final JPanel p1){

  PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum){
      if (pageNum > 0){
      return Printable.NO_SUCH_PAGE;
      }

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      p1.setBackground(Color.white);
        p1.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });
  if (pj.printDialog() == false)
  return;

  try {
        pj.print();
  } catch (PrinterException ex) {
        // handle exception
  }
}
  
  public void resetAll(JPanel p){
      
        angle=0;
        jSlider1.setValue(0);
        jSlider2.setValue(0);
        jSlider3.setValue(0);
        p.removeAll();
        initlabels();
        p.repaint();
        p.validate();
        for (int i=0;i<vals.length;i++)
             vals[i]=false;
        
        
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
  
  public ImageIcon moveImage(ImageIcon imageI,int transx, int transy){
  
    ImageIcon sizeImage;


    sizeImage = new ImageIcon(image);


   

    // 1. Create a new Buffered Image and Graphic2D object
    BufferedImage resizedImg = new BufferedImage(sizeImage.getIconWidth(), sizeImage.getIconHeight(), BufferedImage.TYPE_INT_RGB);
    Graphics2D g2 = resizedImg.createGraphics();

    // 2. Use the Graphic object to draw a new image to the image in the buffer
    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    g2.drawImage(image, transx, transy, sizeImage.getIconWidth(), sizeImage.getIconHeight(), null);
    g2.dispose();

    // 3. Convert the buffered image into an ImageIcon for return
    return (new ImageIcon(resizedImg));
}
  
  static public BufferedImage createBufferedImage(Image imageIn,Component comp) {
    return createBufferedImage(imageIn, BufferedImage.TYPE_INT_ARGB, comp);
  }

  static public BufferedImage createBufferedImage(Image imageIn,int imageType, Component comp) {
    MediaTracker mt = new MediaTracker(comp);
    mt.addImage(imageIn, 0);
    try {
      mt.waitForID(0);
    } catch (InterruptedException ie) {
    }
    BufferedImage bufferedImageOut = new BufferedImage(imageIn
        .getWidth(null), imageIn.getHeight(null), imageType);
    Graphics g = bufferedImageOut.getGraphics();
    g.drawImage(imageIn, 0, 0, null);

    return bufferedImageOut;
  }
  
  int selection;
  int angle;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   boolean vals[];
  int i,j,l,v;
  int click;
  int grid=1;
   File dir=null;
   static int X;
   static int Y;
    private int MouseX;
    private int MouseY;
    int transX=0;
    int transY=0;
    private java.awt.Image image,image2[];
    private ImageIcon icon;
    private File file;
    private javax.swing.JLabel jLabel[],loghi[];
  private RotatedJLabel loadphoto,text;
    int inar;
    int dx=0;
    int dx4=4;
    int dx9=9;
    int dx16=16;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
