/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

/**
 *
 * @author lee
 */
public class Paneldisp9 extends PanelInterface {

    public Paneldisp9()
    {
        super(3);
    }
    
    @Override
    void setgrid(int n) {
        this.setLayout(new GridLayout(n,n));
    }

    
}
