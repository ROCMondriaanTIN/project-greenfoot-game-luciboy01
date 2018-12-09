import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect4 extends World
{

    /**
     * Constructor for objects of class LevelSelect4.
     * 
     */
    public LevelSelect4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        druk druk = new druk();
        addObject(druk,519,110);
        druk.setLocation(512,229);
        lv1 lv1 = new lv1();
        addObject(lv1,512,229);
        druk.setLocation(510,338);
        lv2 lv2 = new lv2();
        addObject(lv2,510,338);
        druk.setLocation(512,447);
        lv3 lv3 = new lv3();
        addObject(lv3,512,447);
        lv1.setLocation(513,542);
        lv4 lv4 = new lv4();
        addObject(lv4,513,542);
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
    if (Greenfoot.isKeyDown("r")){
        Greenfoot.setWorld(new Level4());
    }
    
}
}
