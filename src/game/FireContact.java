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
public class FireContact implements CollisionListener{
    private FireBall fire;
    private Game game;
    
    FireContact(FireBall fire, Game game){
        this.fire = fire;
        this.game = game;
    }
    
    @Override
    public void collide(CollisionEvent e){
            if(e.getOtherBody() instanceof Frog){
                System.out.println("Hit by fire ball");
                System.exit(0);
            }else{
                e.getReportingBody().destroy();
            }
    }
}
