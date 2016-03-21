/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;

/**
 *
 * @author Lee
 */
public class JMenuItemUndo extends JMenuItem implements MouseListener {

    
    public JMenuItemUndo(){
        addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) { ImgReader.getSingle().undo();  }

    @Override
    public void mouseReleased(MouseEvent e) {  }

    @Override
    public void mouseEntered(MouseEvent e) {   }

    @Override
    public void mouseExited(MouseEvent e) { }
    
}
