package game;

import city.cs.engine.*;


// Collision listener that allows the bird to collide with things.
public class Contact implements CollisionListener {
    
    //Deaclares an object of type Frog
    private Frog frog;
    private Game game;

    
    //Contrusctor to initialise the object.
    public Contact(Frog frog, Game game) {
        this.frog = frog;
        this.game = game;
    }
    
    /*Method containing a set of instances which are used to call different 
    methods depending on which Body the frog comes into contact with.*/
    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == frog) {
            if(e.getReportingBody() instanceof Fly){          
                frog.eatFly();
                game.goNextLevel();
                e.getReportingBody().destroy();
            }else if (e.getReportingBody() instanceof SpikedBall){
                frog.hitObstacle();
                e.getReportingBody().destroy();
            }else if (e.getReportingBody() instanceof TBBorder){
                frog.fellInLava();
            }else if (e.getReportingBody() instanceof LRBorder){
                frog.hitWall();
            }else if(e.getReportingBody() instanceof LavaPlatform){
                frog.jumpedOnLava();
            }else if(e.getReportingBody() instanceof Boulder){
                frog.hitObstacle();
                e.getReportingBody().destroy();
            }else if(e.getReportingBody() instanceof Heart){
                frog.pickupHeart();
                e.getReportingBody().destroy();
            }
        }
    }
}