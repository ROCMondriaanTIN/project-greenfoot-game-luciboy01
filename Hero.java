   
import greenfoot.*;

/**
*
* @author R. Springer
*/
public class Hero extends Mover {
public boolean right=true;
public boolean mirror=true;
private final double gravity;
private final double acc;
private final double drag;
public int spring = -20;
public int frame;
public int getal;

Heart1 h1;
public Hero() {
    super();
    gravity = 5.8;
    acc = 0.6;
    drag = 0.8;
    setImage("p1.png");
}
        
    @Override
    public void act() {
        if (h1 == null)
        {
          h1 = new Heart1();  
          getWorld().addObject(h1,119,31);
        }
        handleInput();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
         
         for (Actor Enemy : getIntersectingObjects(Enemy.class)) {
            if (Enemy != null) {
                checkWorld();
                h1.removeLife();
                return;
            }
        }
        
        for (Actor Water : getIntersectingObjects(Water.class)) {
        if (Water != null) {
            h1.removeLife();
            checkWorld();
            return;
          }
            }
        
        
        for (Actor DoorClosed : getIntersectingObjects(DoorClosed.class)) {
            if (DoorClosed != null&&getWorld().getObjects(Key.class).size()==0) {
                Greenfoot.setWorld(new Level2());
            
                return;
            }
        }
       
        for (Actor BlueGem : getIntersectingObjects(BlueGem.class)) {
            if (BlueGem != null) {
               getWorld().removeObject(BlueGem);
                return;
            }
        }
        
        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {
               getWorld().removeObject(this);
                return;
            }
        }
        for (Actor CoinGold : getIntersectingObjects(CoinGold.class)) {
            if (CoinGold != null) {
               getWorld().removeObject(CoinGold);
                HudNumber.score=HudNumber.score+2;

                return;
            }
        }
        
        for (Actor CoinSilver : getIntersectingObjects(CoinSilver.class)) {
            if (CoinSilver != null) {
               getWorld().removeObject(CoinSilver);
               HudNumber.score++;
               
               

                return;
            }
        }
        
        for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
               getWorld().removeObject(Key);

                return;
            }
        }
    }
    public void checkWorld(){ 
        if (getWorld().getClass()==MyWorld.class)
        { 
            setLocation(454, 973);
        }   
        if (getWorld().getClass()==Level2.class)
        { 
            setLocation(1304, 973);

        }
    }

 boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
                    return under != null;}
public void Animate(){
    switch(frame){
    case 1:
    setImage("p1_walk01.png");
    break;
    case 2:
    setImage("p1_walk02.png");
    break;
    case 3:
    setImage("p1_walk03.png");
    break;
    case 4:
    setImage("p1_walk04.png");
    break;
    case 5 :
    setImage("p1_walk05.png");
    case 6 :
    setImage("p1_walk06.png");
    break;
    case 7:
    setImage("p1_walk07.png");
    break;
    case 8 :
    setImage("p1_walk08.png");
    case 9 :
    setImage("p1_walk09.png");
    break;
    case 10:
    setImage("p1_walk10.png");
    break;
    case 11:
    setImage("p1_walk11.png");
    
    frame=0;
    break;
}
frame++;
mirrorImage();
}
public void AnimateRoze(){
    switch(frame){
    case 1:
    setImage("p3_walk01.png");
    break;
    case 2:
    setImage("p3_walk02.png");
    break;
    case 3:
    setImage("p3_walk03.png");
    break;
    case 4:
    setImage("p3_walk04.png");
    break;
    case 5 :
    setImage("p3_walk05.png");
    case 6 :
    setImage("p3_walk06.png");
    break;
    case 7:
    setImage("p3_walk07.png");
    break;
    case 8 :
    setImage("p3_walk08.png");
    case 9 :
    setImage("p3_walk09.png");
    break;
    case 10:
    setImage("p3_walk10.png");
    break;
    case 11:
    setImage("p3_walk11.png");
    
    frame=0;
    break;
}
frame++;
mirrorImage();
}
public void AnimateBlauw(){
    switch(frame){
    case 1:
    setImage("p2_walk01.png");
    break;
    case 2:
    setImage("p2_walk02.png");
    break;
    case 3:
    setImage("p2_walk03.png");
    break;
    case 4:
    setImage("p2_walk04.png");
    break;
    case 5 :
    setImage("p2_walk05.png");
    case 6 :
    setImage("p2_walk06.png");
    break;
    case 7:
    setImage("p2_walk07.png");
    break;
    case 8 :
    setImage("p2_walk08.png");
    case 9 :
    setImage("p2_walk09.png");
    break;
    case 10:
    setImage("p2_walk10.png");
    break;
    case 11:
    setImage("p2_walk11.png");
    
    frame=0;
    break;
}
frame++;
mirrorImage();
}
    public void handleInput() {
if (Greenfoot.isKeyDown("space")&&onGround() == true&&getal==0) {
            setImage("p1_jump.png");
            velocityY = spring;
        }

 if (Greenfoot.isKeyDown("1")) {
     getal=1;
            setImage("p3_stand.png");

        }
        if (Greenfoot.isKeyDown("2")) {
            getal=2;
            setImage("p2_stand.png");

        }
        
        
 if (Greenfoot.isKeyDown("0")) {
     getal=0;
            setImage("p3_stand.png");

        }
 if (Greenfoot.isKeyDown("left")&&getal==0) {
            right=true;
            velocityX = -2;
            Animate();
        } else if (Greenfoot.isKeyDown("right")&&getal==0) {
            velocityX = 2;
            right=false;
            Animate();
        }
    
    if (Greenfoot.isKeyDown("space")&&onGround() == true&&getal==1) {
            setImage("p3_jump.png");
            velocityY = spring;
        }
        
         if (Greenfoot.isKeyDown("space")&&onGround() == true&&getal==2) {
            setImage("p2_jump.png");
            velocityY = spring;
        }
        

 if     (Greenfoot.isKeyDown("1")) {
        getal=1;
        setImage("p3_stand.png");

        }
        

 if (Greenfoot.isKeyDown("left")&&getal==1) {
            right=true;
            velocityX = -2;
            AnimateRoze();
        } else if (Greenfoot.isKeyDown("right")&&getal==1) {
            velocityX = 2;
            right=false;
           AnimateRoze();
        }
        
        if (Greenfoot.isKeyDown("left")&&getal==2) {
            right=true;
            velocityX = -2;
            AnimateBlauw();
        } else if (Greenfoot.isKeyDown("right")&&getal==2) {
            velocityX = 2;
            right=false;
           AnimateBlauw();
        }
    }
    
public void mirrorImage(){
if (mirror && right){ 
    getImage().mirrorHorizontally();
}
else if (!mirror && right){
    getImage().mirrorHorizontally();
}
}
  
public int getWidth(){
        return getImage().getWidth();
    }
    

  public int getHeight() {
        return getImage().getHeight();
    }

}
