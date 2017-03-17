package game;

import city.cs.engine.*;

// Class containing the information to create a Fly.
public class Fly extends DynamicBody {
    
    //Creates a polygon shape in the form of a fly.
    private static final Shape shape = new PolygonShape(
            -0.082f,0.358f, -0.648f,-0.224f, 0.169f,-0.368f, 0.708f,0.196f);
    
    /*creates a BodyImage called image which has 
    the .gif file of a fly connected to it.*/
    private static final BodyImage image =
        new BodyImage("data/dragon-fly.gif", 0.8f);
    
    // Constructor for the Fly class.
    public Fly(World world) {
        super(world, shape);
        addImage(image);
    }
}