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
public class LevelFour extends AbstractLevel{
    private static final int NUM_FLY = 2;
    LavaPlatform lp1,lp2,lp3,lp4;
    Boulder boulder1, boulder2;
    Heart heart;
    FireBall fb1, fb2;
    SpikedBall sb1, sb2, sb3, sb4, sb5;
    
    @Override
    public void populate(Game game){
        super.populate(game);
        
        sb1 = new SpikedBall(this);
        sb1.setPosition(new Vec2(-19, 3));
        sb1.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        sb1.addCollisionListener(new Contact(getPlayer(), game));
        
        sb2 = new SpikedBall(this);
        sb2.setPosition(new Vec2(19, -2));
        sb2.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        sb2.addCollisionListener(new Contact(getPlayer(), game));
        
        sb3 = new SpikedBall(this);
        sb3.setPosition(new Vec2(-19, -9));
        sb3.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        sb3.addCollisionListener(new Contact(getPlayer(), game));
        
        sb4 = new SpikedBall(this);
        sb4.setPosition(new Vec2(19, -9));
        sb4.addCollisionListener(new SpikeContact(getSpikedBall(), game));
        sb4.addCollisionListener(new Contact(getPlayer(), game));
        
        fb1 = new FireBall(this);
        fb1.setPosition(new Vec2(13, 18));
        fb1.setGravityScale(0.9f);
        fb1.addCollisionListener(new FireContact(getFire(), game));
        
        fb2 = new FireBall(this);
        fb2.setPosition(new Vec2(-13, 18));
        fb2.setGravityScale(0.5f);
        fb2.addCollisionListener(new FireContact(getFire(), game));
        
        heart = new Heart(this);
        heart.addCollisionListener(new Contact(getPlayer(), game));
        heart.setPosition(new Vec2(-4, -4));
        heart.setGravityScale(0);
        
        boulder1 = new Boulder(this);
        boulder1.addCollisionListener(new BoulderContact(getBoulder(), game));
        boulder1.addCollisionListener(new Contact(getPlayer(), game));
        boulder1.setPosition(new Vec2(5,-12));
        boulder1.setAngularVelocity(15);
        boulder1.setLinearVelocity(new Vec2(-6,3));
        
        boulder2 = new Boulder(this);
        boulder2.addCollisionListener(new BoulderContact(getBoulder(), game));
        boulder2.addCollisionListener(new Contact(getPlayer(), game));
        boulder2.setPosition(new Vec2(-5,-12));
        boulder2.setAngularVelocity(15);
        boulder2.setLinearVelocity(new Vec2(6,3));
        
        lp1 = new LavaPlatform(this);
        lp1.setPosition(new Vec2(-16.8f, -6.5f));
        lp1.setGravityScale(0);
        lp1.setAngleDegrees(-15);
        lp1.addCollisionListener(new Contact(getPlayer(), game));
        lp1.setFillColor(Color.ORANGE);
        lp1.setLineColor(Color.RED);
        
        lp2 = new LavaPlatform(this);
        lp2.setPosition(new Vec2(16.8f, 1.5f));
        lp2.setGravityScale(0);
        lp2.setAngleDegrees(15);
        lp2.addCollisionListener(new Contact(getPlayer(), game));
        lp2.setFillColor(Color.ORANGE);
        lp2.setLineColor(Color.RED);
        
        lp3 = new LavaPlatform(this);
        lp3.setPosition(new Vec2(-4, 12.5f));
        lp3.setGravityScale(0);
        lp3.addCollisionListener(new Contact(getPlayer(), game));
        lp3.setFillColor(Color.ORANGE);
        lp3.setLineColor(Color.RED);
        
        lp4 = new LavaPlatform(this);
        lp4.setPosition(new Vec2(-16.8f, 5.5f));
        lp4.setGravityScale(0);
        lp4.setAngleDegrees(-15);
        lp4.addCollisionListener(new Contact(getPlayer(), game));
        lp4.setFillColor(Color.ORANGE);
        lp4.setLineColor(Color.RED);
        
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
        platform2.setAngleDegrees(15);
        platform2.setFillColor(Color.green);
        
        Body platform3 = new StaticBody(this, boxShape2);
        platform3.setPosition(new Vec2(16.8f, -6.5f));
        platform3.setAngleDegrees(15);
        platform3.setFillColor(Color.green);
        
        Body platform4 = new StaticBody(this, boxShape2);
        platform4.setPosition(new Vec2(16.8f, -2.5f));
        platform4.setAngleDegrees(15);
        platform4.setFillColor(Color.green);
        
        Body platform5 = new StaticBody(this, boxShape2);
        platform5.setPosition(new Vec2(16.8f, 5.5f));
        platform5.setAngleDegrees(15);
        platform5.setFillColor(Color.green);
        
        Body platform6 = new StaticBody(this, boxShape2);
        platform6.setPosition(new Vec2(16.8f, 9.5f));
        platform6.setAngleDegrees(15);
        platform6.setFillColor(Color.green);
        
        //Standard smaller platforms on the left.
        Body platform7 = new StaticBody(this, boxShape2);
        platform7.setPosition(new Vec2(-10, -13.5f));
        platform7.setFillColor(Color.green);
        
        Body platform8 = new StaticBody(this, boxShape2);
        platform8.setPosition(new Vec2(-16.8f, -10.5f));
        platform8.setAngleDegrees(-15);
        platform8.setFillColor(Color.green);
        
        Body platform9 = new StaticBody(this, boxShape2);
        platform9.setPosition(new Vec2(-16.8f, -2.5f));
        platform9.setAngleDegrees(-15);
        platform9.setFillColor(Color.green);
        
        Body platform10 = new StaticBody(this, boxShape2);
        platform10.setPosition(new Vec2(-16.8f, 1.5f));
        platform10.setAngleDegrees(-15);
        platform10.setFillColor(Color.green);
        
        Body platform11 = new StaticBody(this, boxShape2);
        platform11.setPosition(new Vec2(-16.8f, 9.5f));
        platform11.setAngleDegrees(-15);
        platform11.setFillColor(Color.green);
        
        //Standard smaller platforms in the centre.
        Body platform12 = new StaticBody(this, boxShape2);
        platform12.setPosition(new Vec2(-4, -9.5f));
        platform12.setFillColor(Color.green);
        
        Body platform13 = new StaticBody(this, boxShape2);
        platform13.setPosition(new Vec2(4, -9.5f));
        platform13.setFillColor(Color.green);
        
        Body platform14 = new StaticBody(this, boxShape2);
        platform14.setPosition(new Vec2(-4, -4.5f));
        platform14.setFillColor(Color.green);
        
        Body platform15 = new StaticBody(this, boxShape2);
        platform15.setPosition(new Vec2(4, -4.5f));
        platform15.setFillColor(Color.green);
        
        Body platform16 = new StaticBody(this, boxShape2);
        platform16.setPosition(new Vec2(-4, 0.5f));
        platform16.setFillColor(Color.green);
        
        Body platform17 = new StaticBody(this, boxShape2);
        platform17.setPosition(new Vec2(4, 0.5f));
        platform17.setFillColor(Color.green);
        
        Body platform18 = new StaticBody(this, boxShape2);
        platform18.setPosition(new Vec2(-4, 4.5f));
        platform18.setFillColor(Color.green);
        
        Body platform19 = new StaticBody(this, boxShape2);
        platform19.setPosition(new Vec2(4, 4.5f));
        platform19.setFillColor(Color.green);
        
        Body platform20 = new StaticBody(this, boxShape2);
        platform20.setPosition(new Vec2(-4, 8.5f));
        platform20.setFillColor(Color.green);
        
        Body platform21 = new StaticBody(this, boxShape2);
        platform21.setPosition(new Vec2(4, 8.5f));
        platform21.setFillColor(Color.green);
        
        Body platform22 = new StaticBody(this, boxShape2);
        platform22.setPosition(new Vec2(4, 12.5f));
        platform22.setFillColor(Color.green);
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
        return new Vec2(19,18);
    }

    @Override
    public Vec2 twoSBPosition() {
        return new Vec2(-19, 18);
    }

    @Override
    public Vec2 threeSBPosition() {
        return new Vec2(19, 6);
    }
    
    public void createFireBall(){
        fb1 = new FireBall(this);
        fb1.setPosition(new Vec2(13, 18));
        fb1.setGravityScale(0.9f);
        fb1.addCollisionListener(new FireContact(getFire(), getGame()));
        
        fb2 = new FireBall(this);
        fb2.setPosition(new Vec2(-13, 18));
        fb2.setGravityScale(0.5f);
        fb2.addCollisionListener(new FireContact(getFire(), getGame()));
    }
    
    @Override
    public String currentLevel(){
        return "4";
    }
}
