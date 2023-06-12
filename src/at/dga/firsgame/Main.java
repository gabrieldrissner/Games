package at.dga.firsgame;

import org.newdawn.slick.*;

public class Main extends BasicGame {
    private NewObject newObject;
    private NewObject newObject2;
    private float xRectangle;
    private float yRectangle;

    private float xCircle;
    private float yCircle;
    private float xOval;
    private float yOval;
    private float speed;

    public enum Direction {RIGHT, LEFT, DOWN, UP}

    private Direction directionRectangle = Direction.RIGHT;

    public enum DirectionCircle {DOWN, UP}

    private DirectionCircle directionCircle = DirectionCircle.DOWN;

    public enum DirectionOval {RIGHT, LEFT}

    private DirectionOval directionOval = DirectionOval.RIGHT;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRectangle = 100;
        this.speed = 3.0F;
        this.yCircle = 100;

        this.newObject = new NewObject(100,100,5);
        this.newObject2 = new NewObject(5,400,10);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        float ovalue = (float) delta / this.speed;


        this.newObject.update(delta);
        this.newObject2.update(delta);

        if (directionOval == DirectionOval.RIGHT) {
            this.xOval += (float) delta / this.speed;
            if (xOval > 600) {
                directionOval = DirectionOval.LEFT;
            }
        }

        if (directionOval == DirectionOval.LEFT) {
            this.xOval -= (float) delta / this.speed;
            if (xOval <50) {
                directionOval = DirectionOval.RIGHT;
            }
        }



        if (directionCircle == DirectionCircle.DOWN) {
            this.yCircle += (float) delta / this.speed;
            if (yCircle > 500) {
                directionCircle = DirectionCircle.UP;
            }
        }

        if (directionCircle == DirectionCircle.UP) {
            this.yCircle -= (float) delta / this.speed;
            if (yCircle < 50) {
                directionCircle = DirectionCircle.DOWN;
            }
        }


        if (directionRectangle == Direction.RIGHT) {
            this.xRectangle += (float) delta / this.speed;
            if (xRectangle > 600) {
                directionRectangle = Direction.DOWN;
            }
        }

        if (directionRectangle == Direction.DOWN) {
            this.yRectangle += (float) delta / this.speed;
            if (yRectangle > 400) {
                directionRectangle = Direction.LEFT;
            }
        }

        if (directionRectangle == Direction.LEFT) {
            this.xRectangle -= (float) delta / this.speed;
            if (xRectangle < 100) {
                directionRectangle = Direction.UP;
            }
        }

        if (directionRectangle == Direction.UP) {
            this.yRectangle -= (float) delta / this.speed;
            if (yRectangle < 100) {
                directionRectangle = Direction.RIGHT;
            }
        }

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRectangle, this.yRectangle, 100, 100);
        graphics.drawOval(xCircle, yCircle, 50, 50);
        graphics.drawOval(xOval, yOval, 150, 50);
        this.newObject.render(graphics);
        this.newObject2.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
