import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instructie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instructie extends Mover
{
    /**
     * Act - do whatever the instructie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("b")){
        Greenfoot.setWorld(new TitelScreen());
    }    
}
}
