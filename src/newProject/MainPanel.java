/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import javax.swing.JPanel;

/**
 *
 * @author lee
 */
public class MainPanel extends JPanel implements Colleague {

    Creator crt = new ConcreteCreator();
    Mediator med = Mediator.getMediator();
    int a;
    @Override
    public void sendInput(Mediator m) {
        
    }

    
    @Override
    public void receiveInput(int n) {
        a=n;
        removeAll();
        
        add(crt.getPaneldisp(n*n));
        repaint();
        revalidate();
    }
    
    public void nextPhoto(int n)
    {
        PanelInterface p;
        p = (PanelInterface)this.getComponent(0);
        p.nextPhoto(n);
    }


    
}
