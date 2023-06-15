package at.dga.firsgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.Random;

public class Circle implements Actor {

    private float x, y;
    private float speed;
    private float diameter;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 10, 10);
    }


    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;

    //this.diameter+=10;
        }

    }
}
