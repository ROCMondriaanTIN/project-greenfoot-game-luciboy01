import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudCoin extends Mover
{
   
    /**
     * Act - do whatever the HudCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        counter();
    }    
    public int score;
    public void counter()
    {
        if(getWorld().getObjects(CoinGold.class).size()==0){
      score=score+2;      
        
}
if(getWorld().getObjects(CoinSilver.class).size()==0){
    score=score+1;
}
}
}
