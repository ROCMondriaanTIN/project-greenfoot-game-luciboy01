import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorOpen extends Tile
{
    /**
     * Act - do whatever the DoorOpen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        for (Actor Hero : getIntersectingObjects(Hero.class)) {
            if (Hero != null) {
               Greenfoot.setWorld(new level2());

                return;
            }
        }
    }    
    public DoorOpen(String image, int width, int heigth) {   super(image,width,heigth);}
}
