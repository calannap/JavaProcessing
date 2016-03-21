/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Lee
 */
public class JButtonZoom extends JButton implements MouseListener,Colleague {
    private double val;
    private Mediator med = Mediator.getMediator();
    public JButtonZoom(double a){
        val = a;
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
        try {
            med.zoom(val);
        } catch (IOException ex) {
            Logger.getLogger(JButtonZoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void receiveInput(int n) {}
    
}
