/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.UserView;
import city.cs.engine.World;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Cavan Scoffin-Thomas
 */
public class GameView extends UserView {
    
    Frog frog;
    
    private Image background;

    public GameView(World world, Frog frog, int width, int height) {
        super(world, width, height);
        this.frog = frog;
        this.background = new ImageIcon("data/water_background.jpg").getImage();
    }
    
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 20, 20, this);
    }

    @Override
    protected void paintForeground(Graphics2D g) {
        g.drawString(frog.getOutput(), 5, 16);
    }
}