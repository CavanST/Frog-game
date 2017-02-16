package game;

import city.cs.engine.*;

// Class containing the information to create a Frog as a character.
public class Frog extends Walker {

    //Creates a polygon shape in the form of a frog
    private static final Shape shape = new PolygonShape(
            -0.353f,0.2f, -1.15f,-0.828f, -0.544f,-1.144f, 0.713f,-1.141f,
            1.203f,-0.781f, 0.459f,0.184f);

    /*creates a BodyImage called image which has 
    the .gif file of a frog connected to it.*/
    private static final BodyImage image =
        new BodyImage("data/frog.gif", 2.5f);
    
    // creates an int to track the character's life.
    private int life;

    // Constructor for the Frog class.
    public Frog(World world) {
        super(world, shape);
        addImage(image);
        life = 100;
    }
    
    // Method to decrease lives by 34 when spiked ball is hit.
    public void ballDecrementLives(){
        life = life - 34;
    }
    
    // Method to decrease lives by 50 when border is hit.
    public void wallDecrementLives(){
        life = life - 50;
    }
    
    // Method to return the current value of lives.
    public int getLives(int life){
        return this.life = life;
    }

    // Method to control what happends when the Fly is eaten.
    public void eatFly() {
        System.out.println("You ate the fly!");
        System.out.println("YOU WIN!!!");
        System.exit(0);
    }
    
    //Method to control what happens when a spiked ball is hit.
    public void hitObstacle(){
        ballDecrementLives();
        if(life < 1){
            System.out.println("Ouch! You died.");
            System.out.println("You lose!");
            System.exit(0);
        }else{
            System.out.println("Ouch! You shouldn't swallow spiked balls.");
            System.out.println("Life = " + getLives(life));
        }
    }
    
    // Method to control what happens when the border is hit.
    public void hitWall(){
        wallDecrementLives();
        if(life < 1){
            System.out.println("Ouch! You died.");
            System.out.println("You lose!");
            System.exit(0);
        }else{
            System.out.println("Ouch! You shouldn't touch lava.");
            System.out.println("Life = " + getLives(life));
        }
    }
    
    //Method to end the game if the player falls.
    public void fellInLava(){
        System.out.println("Ouch! You drowned in lava.");
        System.out.println("You lose!");
        System.exit(0);
    }
}
