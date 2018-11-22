import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); Greenfoot.playSound("game_over_voice-nQTLU271DFE.wav");
        if (Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new TitelScreen());
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new TitelScreen());
}
}
