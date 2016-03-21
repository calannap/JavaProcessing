/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ryudo
 */
public class JSliderColor extends JSlider implements Colleague,ChangeListener {

    private Mediator med = Mediator.getMediator();
    private String color;
    
    public JSliderColor(String c){
        color = c;
        addChangeListener(this);
    }
    @Override
    public void sendInput(Mediator m) {
        med.modifyColors(this.getValue(),color);
    }

    @Override
    public void receiveInput(int n) {
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        sendInput(med);
    }
    
}
