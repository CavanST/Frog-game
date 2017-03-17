/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.Body;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import java.awt.Color;
import org.jbox2d.common.Vec2;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class LevelOne extends AbstractLevel {
    
    private static final int NUM_FLY = 1;
    
    @Override
    public void populate(Game game){
        super.populate(game);
        
         // create platforms
        Shape boxShape1 = new BoxShape(4, 0.5f);
        Shape boxShape2 = new BoxShape(2, 0.1f);
        
        /* Start and End platforms are different to the rest
        to indicate to the player where to go.*/
        Body startPlatform = new StaticBody(this, boxShape1);
        startPlatform.setPosition(new Vec2(-14.8f, -17f));
        startPlatform.setFillColor(Color.green);
        
        Body endPlatform = new StaticBody(this, boxShape1);
        endPlatform.setPosition(new Vec2(14.9f, 13.5f));
        endPlatform.setFillColor(Color.green);
        
        //Standard smaller platforms.
        Body platform1 = new StaticBody(this, boxShape2);
        platform1.setPosition(new Vec2(-1, -14));
        platform1.setFillColor(Color.green);
        
        Body platform2 = new StaticBody(this, boxShape2);
        platform2.setPosition(new Vec2(4, -11.5f));
        platform2.setFillColor(Color.green);
        
        Body platform3 = new StaticBody(this, boxShape2);
        platform3.setPosition(new Vec2(16.8f, -10.5f));
        platform3.setFillColor(Color.green);
        
        Body platform4 = new StaticBody(this, boxShape2);
        platform4.setPosition(new Vec2(10, -7.5f));
        platform4.setFillColor(Color.green);
        
        Body platform5 = new StaticBody(this, boxShape2);
        platform5.setPosition(new Vec2(-2, -5.5f));
        platform5.setFillColor(Color.green);
        
        Body platform6 = new StaticBody(this, boxShape2);
        platform6.setPosition(new Vec2(-10, -2.5f));
        platform6.setFillColor(Color.green);
        
        Body platform7 = new StaticBody(this, boxShape2);
        platform7.setPosition(new Vec2(-16.5f, 0.8f));
        platform7.setFillColor(Color.green);
        
        Body platform8 = new StaticBody(this, boxShape2);
        platform8.setPosition(new Vec2(-10.5f, 4));
        platform8.setFillColor(Color.green);
        
        Body platform9 = new StaticBody(this, boxShape2);
        platform9.setPosition(new Vec2(-0.5f, 7f));
        platform9.setFillColor(Color.green);
        
        Body platform10 = new StaticBody(this, boxShape2);
        platform10.setPosition(new Vec2(-5f, 10f));
        platform10.setFillColor(Color.green);
        
        Body platform11 = new StaticBody(this, boxShape2);
        platform11.setPosition(new Vec2(2f, 13f));
        platform11.setFillColor(Color.green);
    }
    
    @Override
    public Vec2 startPosition() {
        return new Vec2(-16, -13);
    }
    
    @Override
    public Vec2 flyPosition() {
        return new Vec2(15,16.5f);
    }
    
    @Override
    public boolean isCompleted(){
        return getPlayer().getFlyCount() == NUM_FLY;
    }

    @Override
    public Vec2 topTBPosition() {
        return new Vec2(0, 19.4f);
    }

    @Override
    public Vec2 bottomTBPosition() {
        return new Vec2(0, -19.4f);
    }

    @Override
    public Vec2 leftLRPosition() {
        return new Vec2(-19.4f,0);
    }

    @Override
    public Vec2 rightLRPosition() {
        return new Vec2(19.4f,0);
    }

    @Override
    public Vec2 oneSBPosition() {
        return new Vec2(17.8f,-10);
    }

    @Override
    public Vec2 twoSBPosition() {
        return new Vec2(-11.5f, -2.0f);
    }

    @Override
    public Vec2 threeSBPosition() {
        return new Vec2(14.9f, 14f);
    }
    
    private LevelOne levelOne;
    public LevelOne getLevel(LevelOne levelOne){
        return this.levelOne = levelOne;
    }
    
    @Override
    public String currentLevel(){
        return "1";
    }
}