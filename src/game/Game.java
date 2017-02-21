package game;

import city.cs.engine.*;
import javax.swing.JFrame;


// Creates the actual game.
public class Game {

    // The World in which the bodies move and interact.
    private GameWorld world;

    // A graphical display of the world (a specialised JPanel).
    private UserView view;

    // Initialise a new Game.
    public Game() {

        // make the world
        world = new GameWorld();
        view = new GameView(world, world.getPlayer(), 800, 800);

        // display the view in a frame
        final JFrame frame = new JFrame("Event handling");

        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window.
        frame.add(view);
        // stops the game window being resized.
        frame.setResizable(false);
        // size the game window to fit the world view.
        frame.pack();
        // make the window visible.
        frame.setVisible(true);
        
        // Allows the frog to be controller by the keyboard.
        frame.addKeyListener(new Controller(world.getPlayer()));

        // uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 800, 800);

        // starts the world/
        world.start();
    }

    // Runs the game.
    public static void main(String[] args) {
        new Game();  
    }
}
