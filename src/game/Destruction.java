/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.DestructionEvent;
import city.cs.engine.DestructionListener;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class Destruction implements DestructionListener{
    
    private FireBall fire;
    private LevelFour levelFour;
    private Game game;
    
    Destruction(FireBall fire, Game game){
        this.fire = fire;
        this.game = game;
    }
    
    @Override
    public void destroy(DestructionEvent e){
        if(e.getSource() instanceof FireBall){
            //System.out.println("destroy");
            //levelFour.createFireBall();
        }
    }
}
