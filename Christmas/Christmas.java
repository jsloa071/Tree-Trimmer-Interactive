/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christmas;

import java.util.ArrayList;

/**
 *
 * @author jodisloan
 */
public class Christmas 
{
    //Model: 1 Christmas tree that can be decorated with
    //various coloured ornaments, and topped with a star
    ArrayList<Ornament> ornaments;
    ArrayList<Snowflake> snowflakes;
    Tree xmasTree;
    Star xmasStar;
    static int currentKey; //tracks which colour ornament to place next
                             // 1=red / 2=gold / 3=blue 
    
    public Christmas()
    {
        xmasTree = new Tree();        
        ornaments = new ArrayList<>();
        snowflakes = new ArrayList<>();
        xmasStar = new Star();
        currentKey = 1; //start with red
        
        //create array of snowflakes to start
        for (int i=0; i<25; i++)
        {
            snowflakes.add(new Snowflake());
        }
    }
    
    
    public ArrayList<Ornament> getOrnaments()
    {
        return ornaments;
    }
    
    public ArrayList<Snowflake> getSnowflakes()
    {
        return snowflakes;
    }
    
    public Tree getTree()
    {
        return xmasTree;
    }
    
    public Star getStar()
    {
        return xmasStar;
    }
    
    //use 'r', 'g', and 'b' keys to switch colour, and 
    //click on tree to add ornament to desired spot
    public void addOrnament(int x, int y)
    {
        switch (currentKey)
        {
            case 1:
                ornaments.add(new RedOrnament(40, 40, x, y));
                break;
            case 2:
                ornaments.add(new GoldOrnament(40, 40, x, y));
                break;
            case 3:
                ornaments.add(new BlueOrnament(40, 40, x, y));
                break;
        }
    }
    
    //press ' ' (space) to add the star to the top
    public void addStar()
    {
        xmasStar.x = 408;
        xmasStar.y = 50;
    }
    
    public void addSnowflakes()
    {
        snowflakes.add(new Snowflake());
    }
    
}
