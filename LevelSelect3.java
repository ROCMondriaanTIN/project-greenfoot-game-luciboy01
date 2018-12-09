import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect3 extends World
{

    /**
     * Constructor for objects of class LevelSelect3.
     * 
     */
    public LevelSelect3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
public void act(){
        if (Greenfoot.isKeyDown("q")){
            Greenfoot.setWorld(new MyWorld());
        
    }
    if (Greenfoot.isKeyDown("w")){
        Greenfoot.setWorld(new Level2());
    }
    if (Greenfoot.isKeyDown("e")){
        Greenfoot.setWorld(new Level3());
    }
}
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        druk druk = new druk();
        addObject(druk,514,125);
        druk.setLocation(510,244);
        lv1 lv1 = new lv1();
        addObject(lv1,510,244);
        druk.setLocation(508,334);
        lv2 lv2 = new lv2();
        addObject(lv2,508,334);
        druk.setLocation(508,425);
        lv3 lv3 = new lv3();
        addObject(lv3,508,425);
    }
}
