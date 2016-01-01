package eandd.tungbt94.control;

import eandd.tungbt94.model.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.*;
import javax.swing.ImageIcon;

public class SnowControl {
    private ArrayList<Snow> arrSnow = new ArrayList<Snow>();
    private int numSnow = 100;
    
    public SnowControl() {
        Random rand = new Random();
        for(int i = 0; i < numSnow; i++){
            Snow snow = new Snow(rand);
            arrSnow.add(snow);
        }
    }

    public void fall(){
        for(Snow snow: arrSnow)
            snow.fall();
    }
    
    public void draw(Graphics2D g2d) {
         for(Snow snow: arrSnow)
            snow.draw(g2d);
    }
    
}