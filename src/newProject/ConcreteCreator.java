/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lee
 */
interface Creator {
    public PanelInterface getPaneldisp(int n);
}

public class ConcreteCreator implements Creator {

    public PanelInterface getPaneldisp(int n) {

                if (n==1)
                    return new Paneldisp1();
                if (n==4)
                    return new Paneldisp4();
                if (n==9)
                    return new Paneldisp9();
                if (n==16)
                    return new Paneldisp16();

        return null;
    }
    
}