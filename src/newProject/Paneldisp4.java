/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author lee
 */
public class Paneldisp4 extends PanelInterface {

    public Paneldisp4()
    {
        super(2);
    }
    
    @Override
    void setgrid(int n) {
        this.setLayout(new GridLayout(n,n));
    }

    
    
}
