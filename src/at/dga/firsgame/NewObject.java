package at.dga.firsgame;

import org.newdawn.slick.Graphics;

public class NewObject {

    private float x;
    private float y;
    private float speed;

    public NewObject(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,10,10);
    }

    public void update(int delta) {
        this.x += (float) delta / speed;

        if(this.x>600){
            this.x = 0;
        }

    }
}


