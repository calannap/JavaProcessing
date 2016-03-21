/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author lee
 */

interface IMediator {
    public void changeView(int n);
    public void nextPhoto(int n);
    public void skewPhoto();
}


public class Mediator implements IMediator  {
    
    private static Mediator med = new Mediator();
    private MainPanel p;
    private JSliderdisp s;
    private JSliderColor s1;
    private Paneldisp1 p1;
    private JButtonBacFow b1;
    private JButtonSkew b2;
    private JButtonPrint b3;
    private JButtonZoom b4;
    private JButtonUnblur b5;
    private JTextField txt1;
    private ImgReader imgr = ImgReader.getSingle();
    
    private Mediator(){}

    public static Mediator getMediator()
    {
        return med;
    }
    
    public void setPanel(JPanel pan){
        p = (MainPanel)pan;     
    }
    
    public void setPanel1(JPanel pan){
        p1 = (Paneldisp1)pan;     
    }
    public void setSlider(JSlider sli){
        s = (JSliderdisp) sli;
    }
    public void setSlider1(JSlider sli){
        s1 = (JSliderColor) sli;
    }
    public void setButton1(JButton but){
        b1 = (JButtonBacFow) but;
    }
    public void setButton2(JButton but){
        b2 = (JButtonSkew) but;
    }
    
     public void setButton3(JButton but){
        b3 = (JButtonPrint) but;
    }
     
     public void setButton4(JButton but){
        b4 = (JButtonZoom) but;
    }
     
    public void setButton5(JButton but){
        b5 = (JButtonUnblur) but;
    }
    
    public void setText(JTextField text){
        txt1 = text;
    }
    
    
    public int getIterations()
    {
        return Integer.parseInt(txt1.getText());
    }
    public void modifyColors(int value,String color){
        try{p1.modifyColors(value,color);}
        catch (Exception e){}
        
    }
    public void zoom(double a) throws IOException{ 
        ((PhotoLabels)p1.dispPhotos[0]).resizeImg(a);
        
    }
    
    public void unblurPhoto() throws IOException{
         ((PhotoLabels)p1.dispPhotos[0]).unblurImg(Integer.parseInt(txt1.getText()));
    }
    
    
    public void deletePhoto(){
        if(p.getComponent(0) instanceof Paneldisp1){
        imgr = ImgReader.getSingle();
        imgr.deleteFile(((PhotoLabels)p1.dispPhotos[0]).getI());
        }
    }
    public void changeView(int n) {  
        p.receiveInput(n);
    }

    public void nextPhoto(int n) {
        p.nextPhoto(n);
    }
    public void setPhoto(int n) throws IOException{
        changeView(1);
        s.setValue(1);
        p1 =  (Paneldisp1) p.getComponent(0);
        p1.setPhoto(n);
    }
    
    public void printImg(){
        if(p.getComponent(0) instanceof Paneldisp1)
        b3.printComponent(p1);
    }
    
    public void rotateLabel(int angle){
        ((PhotoLabels)p1.dispPhotos[0]).setRotation(angle);
        
    }
    public void repaintPanel(){
        p.receiveInput(p.a);
    }

    @Override
    public void skewPhoto() {
        ImgReader.getSingle().receiveInput(0);
    }




    
}
