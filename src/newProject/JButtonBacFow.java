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
 * @author lee
 */
public class JButtonBacFow extends JButton implements Colleague,MouseListener {

    private Mediator med = Mediator.getMediator();
    private int x;
    
    public JButtonBacFow(int n)
    {
        x=n;
        addMouseListener(this);
    }
    
    @Override
    public void sendInput(Mediator m) {
        med.nextPhoto(x);
    }

    @Override
    public void receiveInput(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
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
    
}
