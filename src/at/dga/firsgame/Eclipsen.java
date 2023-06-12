package at.dga.firsgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Eclipsen implements Actor {
    private int x,y;

    public Eclipsen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,50);
    }

    public void update(int delta) {
    }



    public void init(GameContainer gameContainer) throws SlickException {

    }

    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }
}