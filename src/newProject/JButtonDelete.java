/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Lee
 */
public class JButtonDelete extends JButton implements Colleague,MouseListener {
    
    private Mediator med = Mediator.getMediator();
    
    public JButtonDelete(){
        addMouseListener(this);
    }

    @Override
    public void sendInput(Mediator m) {
        m.deletePhoto();
    }

    @Override
    public void receiveInput(int n) {}

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
    
}
