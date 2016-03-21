/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
/**
 *
 * @author lee
 */
      
    interface Colleague   {
    

    public void sendInput(Mediator m);

    public void receiveInput(int n);
    

}
