/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.DynamicBody;
import city.cs.engine.WorldView;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class ShootWater extends MouseAdapter{
    
    private WorldView view;
    
    private Frog frog;
    
    public Frog getFrog(Frog frog){
        return this.frog = frog;
    }
    
    public ShootWater(WorldView view, Frog frog){
        this.view = view;
        this.frog = frog;
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        if(e.getButton() == MouseEvent.BUTTON1){
            DynamicBody waterBall = new WaterBall(view.getWorld());
            waterBall.setPosition(new Vec2(getFrog(frog).getPosition().x + 1, getFrog(frog).getPosition().y));
            waterBall.setLinearVelocity(new Vec2(50,0));
            waterBall.setAngularVelocity(20);
        }
    }
}
