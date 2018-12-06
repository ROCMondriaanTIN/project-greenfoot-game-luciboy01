import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KarakterSelect here.
 * 
 * @author (Luciano Dias) 
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
        super(1000, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Karakter karakter = new Karakter();
        addObject(karakter,494,416);
    }
}
