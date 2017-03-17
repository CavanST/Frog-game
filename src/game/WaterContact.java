/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class WaterContact implements CollisionListener{
    private WaterBall water;
    private Game game;
    
    WaterContact(WaterBall water, Game game){
        this.water = water;
        this.game = game;
    }
    
    @Override
    public void collide(CollisionEvent e){
            if(e.getOtherBody() instanceof SpikedBall){
                e.getOtherBody().destroy();
                e.getReportingBody().destroy();
            }else{
                e.getReportingBody().destroy();
            }
    }
}
