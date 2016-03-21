/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author lee
 */
 abstract class PanelInterface extends JPanel  {
    
    /**
     * PanelInterface definisce la classe astratta per la composizione dei vari jPanel
     */
    
    protected int index;
    protected int rows,gridnum; // Indice scorrimento foto,numero di righe(o colonne) e numero di foto in un frame
    protected JLabel [] dispPhotos; // labels contenenti le foto
    protected Dimension dim;
    protected ImgReader reader = ImgReader.getSingle();
    
    // Inizializza il panel
    public PanelInterface(int x){    
            rows = x;
            gridnum = rows*rows;
            dim = new Dimension(772, 576);
            this.setSize(dim);
            this.setBackground(Color.black);
            setgrid(rows);
            initLabels();
            setPhotos();
            }
    
    abstract void setgrid(int n);
    
    public void setPhotos(){
        
            resetLabels();
            
            for (int i=0;i<gridnum && index+i<reader.numPhotos();i++){        
                // Imposto l'immagine nella label
                ((PhotoLabels)dispPhotos[i]).setIcon(reader.getImages().get(index+i)); 
                // Dico alla label l'indice dell'immagine che contiene
                ((PhotoLabels)dispPhotos[i]).setIndex(index+i); 
                
                if(reader.getSelected()[index+i]){
                    dispPhotos[i].setBorder(BorderFactory.createLineBorder(Color.red));
                    
                        }
                    }   
                }
    
    private void initLabels(){
            dispPhotos = new PhotoLabels[gridnum];
            for (int i=0;i<gridnum;i++){  
                    dispPhotos[i] = new PhotoLabels(gridnum);
                    dispPhotos[i].setSize(dim.width/rows,dim.height/rows);
                    this.add(dispPhotos[i]);
                    }
                }
    
    protected void resetLabels(){
            for (int i=0;i<gridnum;i++){ // ciclo per resettare le label
                dispPhotos[i].setIcon(null);
                dispPhotos[i].setBorder(null);
            }
    }
    
    public void nextPhoto(int a){
            /* Controllo che l'indice sia maggiore del numero di label ( per poter andare indietro )
             * oppure che a sia maggiore di 0,ovvero che bisogna scorrere le foto in avanti.
             * Allo stesso tempo l'indice sommato al numero di label non deve sforare la grandezza 
             * del'array di immagini,condizione non necessaria nel caso a sia minore di 0 ( ovvero stiamo 
             * andanto indietro con l'array)    
             */
            if( (index >= gridnum || a>0) && (index+gridnum < reader.numPhotos() || a<0) ){            
                index+= gridnum*a;
                for (int i=0;i<rows*rows;i++)
                    dispPhotos[i].setSize(dim.width/rows,dim.height/rows);
                setPhotos();
                }
              }
    
  
}
