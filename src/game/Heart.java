/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.BodyImage;
import city.cs.engine.DynamicBody;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.World;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class Heart extends DynamicBody{
    //Creates a polygon shape in the form of a fly.
    private static final Shape shape = new PolygonShape(
            -0.416f,0.589f, -0.541f,0.238f, -0.003f,-0.581f, 
            0.574f,0.216f, 0.435f,0.586f);
    
    /*creates a BodyImage called image which has 
    the .gif file of a fly connected to it.*/
    private static final BodyImage image =
        new BodyImage("data/heart.gif", 1.2f);
    
    // Constructor for the Fly class.
    public Heart(World world) {
        super(world, shape);
        addImage(image);
    }
}
