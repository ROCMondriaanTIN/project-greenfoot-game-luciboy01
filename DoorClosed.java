import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorClosed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorClosed extends Mover
{
    /**
     * Act - do whatever the DoorClosed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        openDoor();
        
    }    
    public void openDoor()
    {
     if(getWorld().getObjects(Key.class).size()==0){
            setImage("door_openMid.png");
        }
        
    }
    }
