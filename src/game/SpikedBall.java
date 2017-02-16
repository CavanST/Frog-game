package game;

import city.cs.engine.*;

// Class containing the information to create a Fly.
public class SpikedBall extends DynamicBody{
    
    // Sets the size of the radius and then uses that to create a circle.
    private static final float radius = 0.5f;
    private static final Shape ballShape = new CircleShape(radius);
    
    /*creates a BodyImage called image which has 
    the .gif file of a spikedBall connected to it.*/
    private static final BodyImage ballImage =
        new BodyImage("data/spiked_ball.png", 2*radius);
    
    // Constructor for the Fly class.
    public SpikedBall(World world) {
        super(world, ballShape);
        addImage(ballImage);
    }
}
