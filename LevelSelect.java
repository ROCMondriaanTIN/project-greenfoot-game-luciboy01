import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        prepare();
    }
public void act(){
        if (Greenfoot.isKeyDown("q")){
            Greenfoot.setWorld(new MyWorld());
    }
}
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        druk druk = new druk();
        addObject(druk,488,121);
        druk.setLocation(478,242);
        lv1 lv1 = new lv1();
        addObject(lv1,478,242);
    }
}
