import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Congrats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Congrats extends World
{

    /**
     * Constructor for objects of class Congrats.
     * 
     */
    public Congrats()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
        Greenfoot.setWorld(new TitelScreen());
    }       
}
}
