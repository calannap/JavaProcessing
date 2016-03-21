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
public class JButtonRotate extends JButton implements MouseListener,Colleague {
    private int angle;
    private Mediator med = Mediator.getMediator();
    
    public JButtonRotate(int a){
        addMouseListener(this);
        angle = a;
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
        med.rotateLabel(angle);
    }

    @Override
    public void receiveInput(int n) {}
}
