import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoDia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoDia extends Mover
{
    /**
     * Act - do whatever the NoDia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       insertDia();
    } 
    
    public void insertDia(){
        if(getWorld().getObjects(BlueGem.class).size()==0){
            setImage("gemBlue.png");
        
        
    }
}
}
