import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart1 extends Mover
{
    public int hartHud=2;
    public void act() 
    {
       getWorld().showText("Leven "+hartHud, 140, 40);
       if(hartHud==1){
          
           setImage("hud_heartHalf.png");
       }
       if(hartHud==0){ //getWorld().removeObject(this);
           Greenfoot.setWorld(new GameOver());
           hartHud=hartHud+2;
       }
    }
    
    public void removeLife()
    {
        hartHud--;
    }
}
