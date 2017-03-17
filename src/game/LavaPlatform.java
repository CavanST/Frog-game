/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.BoxShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.World;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class LavaPlatform extends DynamicBody{
    private static final BoxShape boxShape = new BoxShape(2, 0.1f);

    public LavaPlatform(World world) {
        super(world, boxShape);
    }
}
