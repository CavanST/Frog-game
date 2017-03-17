package game;

import city.cs.engine.*;

//TBBorder stands for Top and Bottom Border
//Class to create the top and bottom sides of the border.
public class TBBorder extends StaticBody{
    private static final BoxShape boxShape = new BoxShape(19.9f, 0.5f);

    // Constructor for TBBorder
    public TBBorder(World world) {
        super(world, boxShape);
    }
}