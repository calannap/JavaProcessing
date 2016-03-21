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
public class JButtonUnblur extends JButton implements MouseListener,Colleague {
    private int magnitudo;
    private Mediator med = Mediator.getMediator();
    
    public JButtonUnblur(){
        addMouseListener(this);
     
    }

  
    @Override
    public void mouseClicked(MouseEvent e) {
        sendInput(med);
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
        try {
            med.unblurPhoto();
        } catch (IOException ex) {
            Logger.getLogger(JButtonUnblur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void receiveInput(int n) {}
}
