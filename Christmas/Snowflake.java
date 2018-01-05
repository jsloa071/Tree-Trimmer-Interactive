/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Christmas;

import java.util.Random;

/**
 *
 * @author jodisloan
 */
public class Snowflake {
    public float x;
    public float y;
    public float d;
    
    public Snowflake() {
        this.d = (float) Math.random()*8;
        this.x = (float) Math.random()*1600;
        this.y = -(this.d);
    }
    
    public void fall() {
        this.x += (float) (-(Math.random() + Math.random() / 2));
        this.y += (float) (Math.random() * 2);
    }
    
}
