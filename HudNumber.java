import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HudNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HudNumber extends Mover
{
    public static int score;
    public void act(){
            counter();

    }
       public void counter(){
           if (score==0){
            setImage("hud_0.png");}
        if (score==1){
            setImage("hud_1.png");
    }
    if(score==2){
        setImage("hud_2.png");
        
}
if(score==3){
        setImage("hud_3.png");
        
}
if(score==4){
        setImage("hud_4.png");
        
}
if(score==5){
        setImage("hud_5.png");
        
}
if(score==6){
        setImage("hud_6.png");
        
}
if(score==7){
        setImage("hud_7.png");
        
}
if(score==8){
        setImage("hud_8.png");
        
}
if(score==9){
        setImage("hud_9.png");
        
}
if(score>=10){
        score=1;
        
}

}
}




