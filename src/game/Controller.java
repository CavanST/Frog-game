package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// Class to allow the user to control a Walker.
public class Controller extends KeyAdapter {
    
    // Declares and initialises variables.
    private static final float STOP_WALKING = 0;
    private static final float WALKING_SPEED = 8;
    private static final float JUMPING_HEIGHT = 8;
    
    //Declares  a walker.
    private Walker body;
    
    //Constructor that intialses the walker.
    public Controller(Walker body) {
        this.body = body;
    }
    
    // Method that handles key presses.
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_Q) { // Q = quit
            System.exit(0);
        } else if (code == KeyEvent.VK_SPACE) { // SPACE = jump
            Vec2 v = body.getLinearVelocity();
            // stops player being able to jump in mid air.
            if (Math.abs(v.y) < 0.01f) {
                body.jump(JUMPING_HEIGHT);
            }
        } else if (code == KeyEvent.VK_A) {
            body.startWalking(-WALKING_SPEED); // A = walk left
        } else if (code == KeyEvent.VK_D) {
            body.startWalking(WALKING_SPEED); // D = walk right
        }
    }
    
    //When key is released, the walker stops moving left or right.
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            body.startWalking(STOP_WALKING);
        } else if (code == KeyEvent.VK_D) {
            body.startWalking(STOP_WALKING);
        }
    }
    
    public void setBody(Walker body) {
        this.body = body;
    }
}