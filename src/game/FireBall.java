/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CircleShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import city.cs.engine.World;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class FireBall extends DynamicBody{
    private static final float radius = 0.5f;
    private static final Shape ballShape = new CircleShape(radius);
    
    private static final BodyImage ballImage =
        new BodyImage("data/fireball.png", 2*radius);
    
    public FireBall(World world){
        super(world, ballShape);
        addImage(ballImage);
    }
}
