/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

/**
 *
 * @author Lee
 */
public class Memento {
    private final List<File> undofile;
    private final List<BufferedImage> undoimgs ;
    
    public Memento(List<File> file, List<BufferedImage> images){
        undofile = file;
        undoimgs = images;
    }
    
    public List<BufferedImage> getSavedImages(){
        return undoimgs;
    }
    
    public List<File> getSavedFiles(){
        return undofile;
    }
}
