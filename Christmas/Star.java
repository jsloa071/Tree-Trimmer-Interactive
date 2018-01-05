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
public class Star
{
    protected float width;
    protected float height;
    protected float x;
    protected float y;
    
    protected String imageName;
    
    public Star()
    {
        width = 90;
        height = 90;
        x = -80;
        y = -80;
        imageName = "star.png";
    }
    
    public int getWidth() { return (int)width; }
    public int getHeight() { return (int)height; }
    
    public float getX() { return x; }
    public float getY() { return y; }
    
    public String getImageName() { return imageName; }

}
