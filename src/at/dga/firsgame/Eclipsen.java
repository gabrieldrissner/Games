package at.dga.firsgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Eclipsen implements Actor {
    private float x,y;
    private float speed;

    public Eclipsen(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,40,50);
    }

    public void update(int delta) {
        this.x += (float)delta/this.speed;
        if (this.x>800){
            this.x = 0;
        }
    }


}