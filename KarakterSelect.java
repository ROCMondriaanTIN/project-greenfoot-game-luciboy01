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
        super(1000, 800, 1, true); 
        
         prepare();
    }
    public void act(){
        if (Greenfoot.isKeyDown("2")){
        Hero.getal=2;
        
    }
    if (Greenfoot.isKeyDown("1")){
        Hero.getal=1;
    }
    if (Greenfoot.isKeyDown("0")){
        Hero.getal=0;
    }
        if (Greenfoot.isKeyDown("space"))
           
           {
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
        addObject(karakter,479,393);
    }
}
