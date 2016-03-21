/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lee
 */
public class JButtonPrint extends JButton implements MouseListener,Colleague {

    private Mediator med = Mediator.getMediator();
    public JButtonPrint(){
        addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        sendInput(med);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    @Override
    public void sendInput(Mediator m) {
        med.printImg();
    }

    public void receiveInput(int n) {
     
    }
    public void printComponent(final JPanel p1){

              p1.setBackground(Color.white);
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
}
