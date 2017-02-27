/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.World;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public abstract class AbstractLevel extends World {
    private Frog player;
    private Fly fly;

    public Frog getPlayer() {
        return player;
    }

    public Fly getFly() {
        return fly;
    }
    
    public void populate (Game game){
        player = new Frog(this);
    }
}
