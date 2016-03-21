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
public class Paneldisp16 extends PanelInterface {

    public Paneldisp16()
    {
        super(4);
    }
    
    @Override
    void setgrid(int n) {
        this.setLayout(new GridLayout(n,n));
    }


}
