/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christmas;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author jodisloan
 */
public class ChristmasUI 
{
    protected ChristmasApplet parent;
    protected Christmas xmas; // <- a reference to the model
    protected ArrayList<PImage> images; // <- images for each ornament
    protected PImage starImage; // 
    protected PImage treeImage;
    
    public ChristmasUI(ChristmasApplet newParent, Christmas newScene)
    {
        parent = newParent;
        xmas = newScene;
        
        images = new ArrayList<PImage>();
        
        treeImage = parent.loadImage(xmas.getTree().getImageName());
        starImage = parent.loadImage(xmas.getStar().getImageName());
        
        images.add(parent.loadImage("redornament.png"));
        images.add(parent.loadImage("goldornament.png"));
        images.add(parent.loadImage("blueornament.png"));
        parent.imageMode(PApplet.CENTER);
    }
    
    public void drawChristmas()
    {    
        parent.image(treeImage, xmas.getTree().getX(), xmas.getTree().getY(),
                xmas.getTree().getWidth(), xmas.getTree().getHeight());
        
        for (int i=0; i<xmas.getOrnaments().size(); i++)
        {
            Ornament ornament = xmas.getOrnaments().get(i);
            if(ornament instanceof RedOrnament)
                parent.image(images.get(0), ornament.getX(), ornament.getY(),
                        ornament.getWidth(), ornament.getHeight());
            else if (ornament instanceof GoldOrnament)
                parent.image(images.get(1), ornament.getX(), ornament.getY(),
                        ornament.getWidth(), ornament.getHeight());
            else if (ornament instanceof BlueOrnament)
                parent.image(images.get(2), ornament.getX(), ornament.getY(),
                        ornament.getWidth(), ornament.getHeight());
                
        }
        
        parent.image(starImage, xmas.getStar().getX(), xmas.getStar().getY(),
                     xmas.getStar().getWidth(), xmas.getStar().getHeight());
        
    }
    
}
