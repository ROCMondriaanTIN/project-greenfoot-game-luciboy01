import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect2 extends World
{

    /**
     * Constructor for objects of class LevelSelect2.
     * 
     */
    public LevelSelect2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        prepare();
    }
public void act(){
        if (Greenfoot.isKeyDown("q")){
            Greenfoot.setWorld(new MyWorld());
        
    }
    if (Greenfoot.isKeyDown("w")){
        Greenfoot.setWorld(new Level2());
    }
}
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        druk druk = new druk();
        addObject(druk,493,116);
        druk.setLocation(479,234);
        lv1 lv1 = new lv1();
        addObject(lv1,479,234);
        druk.setLocation(476,356);
        lv2 lv2 = new lv2();
        addObject(lv2,476,356);
    }
}
