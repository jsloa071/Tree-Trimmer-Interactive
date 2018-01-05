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
public abstract class Ornament
{
    protected float width;
    protected float height;
    protected float x;
    protected float y;
    
    protected String imageName;
    
    public Ornament(int newWidth, int newHeight, int newX, int newY, String img)
    {
        this.width = newWidth;
        this.height = newHeight;
        this.x = newX;
        this.y = newY;
        this.imageName = img;
    }
    
    public String getImageName()
    {
        return imageName;
    }
    
    public int getWidth() { return (int)width; }
    public int getHeight() { return (int)height; }
    
    public float getX() { return x; }
    public float getY() { return y; }

}
