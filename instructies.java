import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instructies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructies extends World
{

    /**
     * Constructor for objects of class instructies.
     * 
     */
    public Instructies()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        prepare();
    }
public void act(){
    if (Greenfoot.isKeyDown("b")||Greenfoot.isKeyDown("space")){
        Greenfoot.setWorld(new TitelScreen());
        
}
}
   /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        instructie instructie = new instructie();
        addObject(instructie,505,385);
    }
}
