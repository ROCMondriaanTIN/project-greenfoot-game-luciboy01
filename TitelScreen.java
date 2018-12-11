import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitelScreen here.
 * 
 * @Luciano Dias 
 * @version (a version number or a date)
 */
public class TitelScreen extends World
{

    /**
     * Constructor for objects of class TitelScreen.
     * 
     */
    public TitelScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(1000, 800, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BgText bgText = new BgText();
        addObject(bgText,500,400);
    }
    
    
    public void act(){
        if (Greenfoot.isKeyDown("space")){
        HudNumber.score = 0;
        Greenfoot.setWorld(new MyWorld());
    }       
    if (Greenfoot.isKeyDown("q")&&Hero.levCheck==1){
        Greenfoot.setWorld(new LevelSelect());
       
    }
    if (Greenfoot.isKeyDown("q")&&Hero.levCheck==2){
        Greenfoot.setWorld(new LevelSelect2());
       
    }
    if (Greenfoot.isKeyDown("q")&&Hero.levCheck==3){
        Greenfoot.setWorld(new LevelSelect3());
       
    }
     if (Greenfoot.isKeyDown("q")&&Hero.levCheck==4){
        Greenfoot.setWorld(new LevelSelect4());
       
    }
    
    if (Greenfoot.isKeyDown("w")){
        HudNumber.score = 0;
        Greenfoot.setWorld(new KarakterSelect());
       
    } 
    }
}
