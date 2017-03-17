package game;

import city.cs.engine.*;
import java.awt.Color;

//LRBorder stands for Left and Right Border
//Class to create the left and right sides of the border.
public class LRBorder extends StaticBody{
    private static final BoxShape boxShape = new BoxShape(0.5f, 18.9f);
//    private static World world;
//    private static final StaticBody body = new StaticBody(world);

    // Constructor for LRBorder
    public LRBorder(World world) {
        super(world, boxShape);
//        body.setFillColor(Color.orange);
//        body.setLineColor(Color.red);
    }
}
