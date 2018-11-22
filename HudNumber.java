import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudNumber extends HudCoin
{
    /**
     * Act - do whatever the HudNumber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        outscore();
        counter();
    }    
    
    public void outscore(){
        if (score==1){
            setImage("hud_1.png");
    }
    if(score==2){
        setImage("hud_2.png");
        
}
}
}


