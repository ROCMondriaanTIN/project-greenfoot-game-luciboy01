import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int score =0;
    public Counter(){
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString(" : " + score, 5, 25);
        setImage(img);
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
