package game;

import city.cs.engine.*;
import java.awt.Color;
import org.jbox2d.common.Vec2;


// @author Cavan
 


// Class to design the world.
public class GameWorld extends World {
    //Declareing objects.
    private Frog frog;
    private Fly fly;
    private SpikedBall ball, ball2, ball3;
    private TBBorder top, bottom;
    private LRBorder left, right;
    
    public GameWorld() {
        super();
        
        // create platforms
        Shape boxShape1 = new BoxShape(4, 0.5f);
        Shape boxShape2 = new BoxShape(2, 0.1f);
        
        /* Start and End platforms are different to the rest
        to indicate to the player where to go.*/
        Body startPlatform = new StaticBody(this, boxShape1);
        startPlatform.setPosition(new Vec2(-15, -17f));
        
        Body endPlatform = new StaticBody(this, boxShape1);
        endPlatform.setPosition(new Vec2(14.9f, 13.5f));
        
        //Standard smaller platforms.
        Body platform1 = new StaticBody(this, boxShape2);
        platform1.setPosition(new Vec2(-1, -14));
        
        Body platform2 = new StaticBody(this, boxShape2);
        platform2.setPosition(new Vec2(4, -11.5f));
        
        Body platform3 = new StaticBody(this, boxShape2);
        platform3.setPosition(new Vec2(16.8f, -10.5f));
        
        Body platform4 = new StaticBody(this, boxShape2);
        platform4.setPosition(new Vec2(10, -7.5f));
        
        Body platform5 = new StaticBody(this, boxShape2);
        platform5.setPosition(new Vec2(-2, -5.5f));
        
        Body platform6 = new StaticBody(this, boxShape2);
        platform6.setPosition(new Vec2(-10, -2.5f));
        
        Body platform7 = new StaticBody(this, boxShape2);
        platform7.setPosition(new Vec2(-16.5f, 0.8f));
        
        Body platform8 = new StaticBody(this, boxShape2);
        platform8.setPosition(new Vec2(-10.5f, 4));
        
        Body platform9 = new StaticBody(this, boxShape2);
        platform9.setPosition(new Vec2(-0.5f, 7f));
        
        Body platform10 = new StaticBody(this, boxShape2);
        platform10.setPosition(new Vec2(-5f, 10f));
        
        Body platform11 = new StaticBody(this, boxShape2);
        platform11.setPosition(new Vec2(2f, 13f));
        
        // initialising objects.
        frog = new Frog(this);
        frog.setPosition(new Vec2(-16, -13));
        
        fly = new Fly(this);
        fly.setPosition(new Vec2(15,16.5f));
        fly.addCollisionListener(new Contact(frog));
        
        ball = new SpikedBall(this);
        ball.setPosition(new Vec2(17.8f,-10));
        ball.addCollisionListener(new Contact(frog));
        
        ball2 = new SpikedBall(this);
        ball2.setPosition(new Vec2(-11.5f, -2.0f));
        ball2.addCollisionListener(new Contact(frog));
        
        ball3 = new SpikedBall(this);
        ball3.setPosition(new Vec2(14.9f, 14f));
        ball3.addCollisionListener(new Contact(frog));
        
        bottom = new TBBorder(this);
        bottom.setPosition(new Vec2(0, -19.4f));
        bottom.addCollisionListener(new Contact(frog));
        bottom.setFillColor(Color.orange);
        bottom.setLineColor(Color.red);
        
        top = new TBBorder(this);
        top.setPosition(new Vec2(0, 19.4f));
        top.addCollisionListener(new Contact(frog));
        top.setFillColor(Color.orange);
        top.setLineColor(Color.red);
        
        right = new LRBorder(this);
        right.setPosition(new Vec2(19.4f,0));
        right.addCollisionListener(new Contact(frog));
        right.setFillColor(Color.orange);
        right.setLineColor(Color.red);
        
        left = new LRBorder(this);
        left.setPosition(new Vec2(-19.4f,0));
        left.addCollisionListener(new Contact(frog));
        left.setFillColor(Color.orange);
        left.setLineColor(Color.red);
        
    }
    //Method to return the frog. Used in the Game class.
    public Frog getPlayer() {
        return frog;
    }
}