package at.dga.firsgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Rectangles implements Actor {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP}

    ;
    private float x;
    private float y;
    private float speed;

    public Rectangles(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 20);
    }

    @Override
    public void update(int delta) {
        this.x += (float)delta/this.speed;
        if (this.x>800){
            this.x = 0;
        }

    }
}
