       
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int spring = -20;
    public int frame;
    public Hero() {
        super();
        gravity = 5.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setLocation(300,200);
                Heart1.hartHud--;
              
                return;
            }
        }
        Heart1.hartHud = Heart1.hartHud;
        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {
                setLocation(300,200);
                Heart1.hartHud--;
            
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
    setImage("p1_walk05.png");
    break;
    case 5 :
    setImage("p1_walk05.png");
    
}
}
    public void handleInput() {
if (Greenfoot.isKeyDown("space")&&onGround() == true) {
            setImage("p1_jump.png");
            velocityY = -10;
            velocityY = spring;
            frame=1;
        }
if (frame==1 &&onGround() == true){
    frame -=1;
    setImage("p1.png");
}

 if (Greenfoot.isKeyDown("left")) {
            setImage("p1.png");
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("right")) {
            setImage("p1.png");
            velocityX = 2;
        }
    }

  public int getWidth() {
        return getImage().getWidth();
    }

  public int getHeight() {
        return getImage().getHeight();
    }
}
