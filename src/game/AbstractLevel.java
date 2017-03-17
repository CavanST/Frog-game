/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.World;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public abstract class AbstractLevel extends World {
    private Frog player;
    private FireBall fire;
    private SpikedBall sb;
    private Boulder boulder;
    private Game game;
    private WaterBall waterBall;
    
    public FireBall getFire(){
        return fire;
    }
    
    public Game getGame(){
        return game;
    }
    
    public Boulder getBoulder(){
        return boulder;
    }
    
    public SpikedBall getSpikedBall(){
        return sb;
    }

    public Frog getPlayer() {
        return player;
    }
    
    public void populate (Game game){
        player = new Frog(this);
        player.setPosition(startPosition());
        
        Fly fly = new Fly(this);
        fly.setPosition(flyPosition());
        fly.setGravityScale(0.0f);
        fly.addCollisionListener(new Contact(player, game));
        
        TBBorder top = new TBBorder(this);
        top.setPosition(topTBPosition());
        top.addCollisionListener(new Contact(player, game));
        top.setFillColor(Color.orange);
        top.setLineColor(Color.red);
        
        TBBorder bottom = new TBBorder(this);
        bottom.setPosition(bottomTBPosition());
        bottom.addCollisionListener(new Contact(player, game));
        bottom.setFillColor(Color.orange);
        bottom.setLineColor(Color.red);
        
        LRBorder left = new LRBorder(this);
        left.setPosition(leftLRPosition());
        left.addCollisionListener(new Contact(player, game));
        left.setFillColor(Color.orange);
        left.setLineColor(Color.red);
        
        LRBorder right = new LRBorder(this);
        right.setPosition(rightLRPosition());
        right.addCollisionListener(new Contact(player, game));
        right.setFillColor(Color.orange);
        right.setLineColor(Color.red);
        
        SpikedBall ball1 = new SpikedBall(this);
        ball1.setPosition(oneSBPosition());
        ball1.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        ball1.addCollisionListener(new Contact(player, game));
        
        SpikedBall ball2 = new SpikedBall(this);
        ball2.setPosition(twoSBPosition());
        ball2.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        ball2.addCollisionListener(new Contact(player, game));
        
        SpikedBall ball3 = new SpikedBall(this);
        ball3.setPosition(threeSBPosition());
        ball3.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        ball3.addCollisionListener(new Contact(player, game));
    }
    
    /** The initial position of the player. */
    public abstract Vec2 startPosition();
    
    /** The position of the exit door. */
    public abstract Vec2 flyPosition();
    public abstract Vec2 topTBPosition();
    public abstract Vec2 bottomTBPosition();
    public abstract Vec2 leftLRPosition();
    public abstract Vec2 rightLRPosition();
    public abstract Vec2 oneSBPosition();
    public abstract Vec2 twoSBPosition();
    public abstract Vec2 threeSBPosition();
    
    public abstract String currentLevel();
    
    /** Is this level complete? */
    public abstract boolean isCompleted();
}
