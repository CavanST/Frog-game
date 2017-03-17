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
public class LevelTwo extends AbstractLevel{
    private static final int NUM_FLY = 2;
    LavaPlatform lp1,lp2,lp3,lp4,lp5;
    FireBall fb1,fb2,fb3;
    
    @Override
    public void populate(Game game){
        super.populate(game);
        
        fb1 = new FireBall(this);
        fb1.setPosition(new Vec2(0, -4.5f));
        fb1.setGravityScale(0.3f);
        fb1.addCollisionListener(new FireContact(getFire(), game));
        fb1.addDestructionListener(new Destruction(getFire(), game));
        
        fb2 = new FireBall(this);
        fb2.setPosition(new Vec2(-14, 18));
        fb2.setGravityScale(0.5f);
        fb2.addCollisionListener(new FireContact(getFire(), game));
        
        fb3 = new FireBall(this);
        fb3.setPosition(new Vec2(13.5f, 18));
        fb3.setGravityScale(1.2f);
        fb3.addCollisionListener(new FireContact(getFire(), game));
        
        lp1 = new LavaPlatform(this);
        lp1.setPosition(new Vec2(16.8f, -4.5f));
        lp1.setGravityScale(0);
        lp1.addCollisionListener(new Contact(getPlayer(),game));
        lp1.setFillColor(Color.ORANGE);
        lp1.setLineColor(Color.RED);
        
        lp2 = new LavaPlatform(this);
        lp2.setPosition(new Vec2(16.8f, 7.5f));
        lp2.setGravityScale(0);
        lp2.addCollisionListener(new Contact(getPlayer(),game));
        lp2.setFillColor(Color.ORANGE);
        lp2.setLineColor(Color.RED);
        
        lp3 = new LavaPlatform(this);
        lp3.setPosition(new Vec2(-16.8f, -4.5f));
        lp3.setGravityScale(0);
        lp3.addCollisionListener(new Contact(getPlayer(),game));
        lp3.setFillColor(Color.ORANGE);
        lp3.setLineColor(Color.RED);
        
        lp4 = new LavaPlatform(this);
        lp4.setPosition(new Vec2(-10, -1.5f));
        lp4.setGravityScale(0);
        lp4.addCollisionListener(new Contact(getPlayer(),game));
        lp4.setFillColor(Color.ORANGE);
        lp4.setLineColor(Color.RED);
        
        lp5 = new LavaPlatform(this);
        lp5.setPosition(new Vec2(4, 7.5f));
        lp5.setGravityScale(0);
        lp5.addCollisionListener(new Contact(getPlayer(),game));
        lp5.setFillColor(Color.ORANGE);
        lp5.setLineColor(Color.RED);
        
         // create platforms
        Shape boxShape1 = new BoxShape(4, 0.5f);
        Shape boxShape2 = new BoxShape(2, 0.1f);
        
        /* Start and End platforms are different to the rest
        to indicate to the player where to go.*/
        Body startPlatform = new StaticBody(this, boxShape1);
        startPlatform.setPosition(new Vec2(0, -17f));
        startPlatform.setFillColor(Color.green);
        
        Body endPlatform = new StaticBody(this, boxShape1);
        endPlatform.setPosition(new Vec2(0, 13.5f));
        endPlatform.setFillColor(Color.green);
        
        //Standard smaller platforms on the right.
        Body platform1 = new StaticBody(this, boxShape2);
        platform1.setPosition(new Vec2(10, -13.5f));
        platform1.setFillColor(Color.green);
        
        Body platform2 = new StaticBody(this, boxShape2);
        platform2.setPosition(new Vec2(16.8f, -10.5f));
        platform2.setFillColor(Color.green);
        
        Body platform3 = new StaticBody(this, boxShape2);
        platform3.setPosition(new Vec2(10, -7.5f));
        platform3.setFillColor(Color.green);
        
        Body platform4 = new StaticBody(this, boxShape2);
        platform4.setPosition(new Vec2(10, -1.5f));
        platform4.setFillColor(Color.green);
        
        Body platform5 = new StaticBody(this, boxShape2);
        platform5.setPosition(new Vec2(16.8f, 1.5f));
        platform5.setFillColor(Color.green);
        
        Body platform6 = new StaticBody(this, boxShape2);
        platform6.setPosition(new Vec2(10, 4.5f));
        platform6.setFillColor(Color.green);
        
        Body platform7 = new StaticBody(this, boxShape2);
        platform7.setPosition(new Vec2(10, 10.5f));
        platform7.setFillColor(Color.green);
        
        //Standard smaller platforms on the left.
        Body platform8 = new StaticBody(this, boxShape2);
        platform8.setPosition(new Vec2(-10, -13.5f));
        platform8.setFillColor(Color.green);
        
        Body platform9 = new StaticBody(this, boxShape2);
        platform9.setPosition(new Vec2(-16.8f, -10.5f));
        platform9.setFillColor(Color.green);
        
        Body platform10 = new StaticBody(this, boxShape2);
        platform10.setPosition(new Vec2(-10, -7.5f));
        platform10.setFillColor(Color.green);
        
        Body platform11 = new StaticBody(this, boxShape2);
        platform11.setPosition(new Vec2(-16.8f, 1.5f));
        platform11.setFillColor(Color.green);
        
        Body platform12 = new StaticBody(this, boxShape2);
        platform12.setPosition(new Vec2(-10, 4.5f));
        platform12.setFillColor(Color.green);
        
        Body platform13 = new StaticBody(this, boxShape2);
        platform13.setPosition(new Vec2(-16.8f, 7.5f));
        platform13.setFillColor(Color.green);
        
        Body platform14 = new StaticBody(this, boxShape2);
        platform14.setPosition(new Vec2(-10, 10.5f));
        platform14.setFillColor(Color.green);
        
        //Standard smaller platforms in the centre.
        Body platform15 = new StaticBody(this, boxShape2);
        platform15.setPosition(new Vec2(-4, -4.5f));
        platform15.setFillColor(Color.green);
        
        Body platform16= new StaticBody(this, boxShape2);
        platform16.setPosition(new Vec2(4, -4.5f));
        platform16.setFillColor(Color.green);
        
        Body platform17 = new StaticBody(this, boxShape2);
        platform17.setPosition(new Vec2(-4, 7.5f));
        platform17.setFillColor(Color.green);
        
        Body platform18 = new StaticBody(this, boxShape2);
        platform18.setPosition(new Vec2(0, 1.5f));
        platform18.setFillColor(Color.green);
        
    }
    
    @Override
    public Vec2 startPosition() {
        return new Vec2(0, -16);
    }
    
    @Override
    public Vec2 flyPosition() {
        return new Vec2(0,16.5f);
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
        return new Vec2(0, 2);
    }

    @Override
    public Vec2 threeSBPosition() {
        return new Vec2(-10.5f, 11);
    }
    
    @Override
    public String currentLevel(){
        return "2";
    }
}
