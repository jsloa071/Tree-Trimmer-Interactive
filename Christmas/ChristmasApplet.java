/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christmas;

import java.util.ArrayList;
import processing.core.PApplet;

/**
 *
 * @author jodisloan
 */
public class ChristmasApplet extends PApplet
{
    // Attributes
    Christmas xmas; // <- model
    ChristmasUI xmasUI; // <- view
    
    
    // Runs before anything else
    public void settings()
    {
        // Set the size of the drawing's window
        size(800,800);
    }
    
    
    // Called once when the program starts
    @Override
    public void setup()
    {
        xmas = new Christmas();
        xmasUI = new ChristmasUI(this, xmas);
    }
    
    
    // Called once every frame
    @Override
    public void draw()
    {
        background(200, 230, 240);
        
        //draw skirt of tree
        fill(255);
        ellipse(400,700,400,200);
        fill(255,33,43);
        ellipse(400,700,330,150);
        
        //draw christmas elements
        xmasUI.drawChristmas();
        fill(255,255,255,225);
        ArrayList<Snowflake> flakes = xmas.getSnowflakes();
        for (Snowflake flake : flakes)
        {
            flake.fall();
            ellipse(flake.x, flake.y, flake.d, flake.d);
        }
        
        //print instructions to user at top layer
        fill(0);
        textSize(18);
        text("Please trim the Christmas tree!", 50, 50);
        textSize(14);
        text("Use the mouse to place an ornament on the tree.", 50, 70);
        text("Press 'r', 'g', and 'b' to toggle the ornament colour." +
                "\nr = red \nb = blue \ng=gold", 
                50, 90, 250, 300);
        text("Press the space key to place the star on top, et voila!",
                50, 200, 250, 200);
        
//        for (int i=0; i<10; i++)
//        {
            xmas.addSnowflakes();
//        }
    }
    
    public void keyPressed()
    {
        //press keys to change colour of ornament drawn next
        switch(key)
        {
            case 'r':
                Christmas.currentKey = 1;
                break;
            case'g':
                Christmas.currentKey = 2;
                break;
            case 'b':
                Christmas.currentKey = 3;
                break;
            //space bar adds the star to the top of the tree
            case ' ':
                xmas.addStar();
                break;
        }
            
    }
    
    public void mouseClicked()
    {
        // Add an ornament at the click point
        xmas.addOrnament(mouseX, mouseY);
    }   
    
    
    public static void main(String[] args)
    {
        PApplet.main(ChristmasApplet.class.getCanonicalName());
    }
    
}
