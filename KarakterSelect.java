import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KarakterSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KarakterSelect extends World
{

    /**
     * Constructor for objects of class KarakterSelect.
     * 
     */
    public KarakterSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        prepare();
    }
    public void act(){
        if (Greenfoot.isKeyDown("0")) {
            Greenfoot.setWorld(new MyWorld());
        }
        if (Greenfoot.isKeyDown("1")) {
            Greenfoot.setWorld(new MyWorld());
        }
}
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Karakter karakter = new Karakter();
        addObject(karakter,492,391);
    }
}
