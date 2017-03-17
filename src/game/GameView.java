/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.UserView;
import city.cs.engine.World;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class GameView extends UserView {
    
    Frog frog;
    Game game;
    AbstractLevel world;
    
    private Image background;

    public GameView(World world, Frog frog, int width, int height, AbstractLevel world1) {
        super(world, width, height);
        this.frog = frog;

        this.world = world1;
        this.background = new ImageIcon("data/water_gif.gif").getImage();
        this.background = this.background.getScaledInstance(
                758, 758, Image.SCALE_SMOOTH);
    }
    
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 20, 20, this);
    }

    @Override
    protected void paintForeground(Graphics2D g) {
        Font font = new Font("SansSerif", Font.BOLD, 16);
        g.setFont(font);
        g.setColor(Color.darkGray);
        g.drawString(frog.getOutput(), 5, 17);
        
        //g.drawString(world.currentLevel(),500,17);
        g.setColor(Color.RED);
        g.drawString(getLevel1(), 435, 17);
        g.setColor(Color.darkGray);
        g.drawString(getLevel2(), 535, 17);
        g.drawString(getLevel3(), 635, 17);
        g.drawString(getLevel4(), 735, 17);
    }
    
    
    public void setFrog(Frog frog){
        this.frog = frog;
    }
    
    public String getLevel1(){
        return "Level: 1";
    }
    
    public String getLevel2(){
        return "Level: 2";
    }
    
    public String getLevel3(){
        return "Level: 3";
    }
    
    public String getLevel4(){
        return "Level: 4";
    }
}