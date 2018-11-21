import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudKey extends Mover
{
    /**
     * Act - do whatever the HudKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        FillKey();
    }    
    
    public void FillKey(){
        if(getWorld().getObjects(Key.class).size()==0){
            setImage("hud_keyRed.png");
            
            
        
        
    
}
}
}
