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
public class SpikeContact implements CollisionListener {
    private SpikedBall sb;
    private Game game;
    
    SpikeContact(SpikedBall sb, Game game){
        this.sb = sb;
        this.game = game;
    }
    
    @Override
    public void collide(CollisionEvent e){
            if(e.getOtherBody() instanceof TBBorder){
                e.getReportingBody().destroy();
            }
    }
}
