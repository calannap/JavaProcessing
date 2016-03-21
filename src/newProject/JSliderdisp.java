/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author lee
 */
public class JSliderdisp extends JSlider implements Colleague,ChangeListener {
    
    Mediator med = Mediator.getMediator();
    public JSliderdisp()
    {
        addChangeListener(this);
    }
    


    public void sendInput(Mediator m) {
        try{
            med.changeView(this.getValue());
            } 
        
        catch (Exception e){}
    }
    
    public void receiveInput(int n) {
        
    }
    
    public void stateChanged(ChangeEvent e) {
       sendInput(med);
    }
    
}
