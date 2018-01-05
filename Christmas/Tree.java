/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christmas;

/**
 *
 * @author jodisloan
 */
public class Tree
{
    protected float width;
    protected float height;
    protected float x;
    protected float y;
    
    protected static String IMAGE_NAME = "tree2.png";
    
    public Tree()
    {
        width = 650;
        height = 700;
        x = 400;
        y = 400;
    }
    
    public int getWidth() { return (int)width; }
    public int getHeight() { return (int)height; }
    
    public float getX() { return x; }
    public float getY() { return y; }
    
    public String getImageName() { return IMAGE_NAME; }
   
}
