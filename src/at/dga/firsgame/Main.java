package at.dga.firsgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;

public class Main extends BasicGame {
    private Random random = new Random();
    ArrayList<Actor> myActors;

    public Main(String title) {
        super(title);
    }

    public enum Direction {RIGHT, LEFT, DOWN, UP}


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        myActors = new ArrayList<Actor>();
        for (int i = 1; i <= 10; i++) {
            myActors.add(new Circle(random.nextInt(700), random.nextInt(600), 10));
            myActors.add(new Eclipsen(random.nextInt(800), random.nextInt(600), 10));
            myActors.add(new Rectangles(random.nextInt(800), random.nextInt(600), 10));
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor a : myActors) {
            a.update(delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor a : myActors) {
            a.render(graphics);
        }

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
