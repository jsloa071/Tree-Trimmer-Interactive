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
public abstract class ChristmasItem 
{
    protected float width;
    protected float height;
    protected float x;
    protected float y;
    
    protected String imageName;
    
    public ChristmasItem(int newWidth, int newHeight,
                      int newX, int newY,
                      String newImageName)
    {
        width = newWidth;
        height = newHeight;
        x = newX;
        y = newY;
        imageName = newImageName;
    }
    
    public int getWidth() { return (int)width; }
    public int getHeight() { return (int)height; }
    
    public float getX() { return x; }
    public float getY() { return y; }
    
    public String getImageName() { return imageName; }
    
}
