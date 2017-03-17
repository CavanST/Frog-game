package game;

import city.cs.engine.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;


// Creates the actual game.
public class Game {

    // The World in which the bodies move and interact.
    private AbstractLevel world;

    // A graphical display of the world (a specialised JPanel).
    private GameView view;
    
    private int level;
    
    private final Controller controller;
    
//    private final ShootWater shootWater;

    // Initialise a new Game.
    public Game() {
        // make the world
        level = 1;
        world = new LevelOne();
        world.populate(this);
        
        
        
        // make a view
        view = new GameView(world, world.getPlayer(), 800, 800, world);
        

        // display the view in a frame
        final JFrame frame = new JFrame("Frog game");

        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window.
        frame.add(view);
        // stops the game window being resized.
        frame.setResizable(true);
        // size the game window to fit the world view.
        frame.pack();
        // make the window visible.
        frame.setVisible(true);
        
        view.addMouseListener(new GiveFocus(frame));
        
        
        // Allows the frog to be controller by the keyboard.
        frame.addKeyListener(new Controller(world.getPlayer()));

        // uncomment this to make a debugging view
        JFrame debugView = new DebugViewer(world, 800, 800);

        controller = new Controller(world.getPlayer());
        frame.addKeyListener(controller);
        
//        shootWater = new ShootWater(view, world.getPlayer());
//        frame.addKeyListener(shootWater);
        
        // starts the world/
        world.start();
        
        Container buttons = new ControlPanel(getWorld());
        frame.add(buttons, BorderLayout.WEST);
        
    }
    private Game game;
    public Game getGame(Game game){
        return this.game = game;
    }
    
    /** The player in the current level. */
    public Frog getPlayer() {
        return world.getPlayer();
    }
    
    /** Is the current level of the game finished? */
    public boolean isCurrentLevelCompleted() {
        return world.isCompleted();
    }
    
    /** Advance to the next level of the game. */
    public void goNextLevel() {
        world.stop();
        if (level == 4) {
            view.getLevel4();
            System.exit(0);
        }else if(level == 3){
            level++;
            // get a new world
            world = new LevelFour();
            // fill it with bodies
            world.populate(this);
            // switch the keyboard control to the new player
            controller.setBody(world.getPlayer());
            view.setFrog(world.getPlayer());
            // show the new world in the view
            view.setWorld(world);
            view.getLevel3();

            world.start();
        }else if(level == 2){
            level++;
            // get a new world
            world = new LevelThree();
            // fill it with bodies
            world.populate(this);
            // switch the keyboard control to the new player
            controller.setBody(world.getPlayer());
            view.setFrog(world.getPlayer());
            // show the new world in the view
            view.setWorld(world);
            view.getLevel2();

            world.start();
        }else{
            level++;
            // get a new world
            world = new LevelTwo();
            // fill it with bodies
            world.populate(this);
            // switch the keyboard control to the new player
            controller.setBody(world.getPlayer());
            view.setFrog(world.getPlayer());
            // show the new world in the view
            view.setWorld(world);
            view.getLevel1();

            world.start();
        }
    }

    // Runs the game.
    public static void main(String[] args) {
        new Game();  
    }
    
    public World getWorld(){
        return world;
    }
    
    public int getLevel(){
        return level;
    }
    
    public String printLevel(){
        return "Level: " + getLevel();
    }
    
}