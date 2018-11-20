import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorClosedTop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorClosedTop extends Mover
{
    /**
     * Act - do whatever the DoorClosedTop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        openTop();
        applyVelocity();
    }    
    public void openTop()
    {
        if(getWorld().getObjects(Key.class).size()==0){
            setImage("door_openTop.png");
        }
    }
    }
   

