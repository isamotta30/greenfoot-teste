import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yoda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yoda extends Actor
{
    public int speed=3;
    /**
     * Act - do whatever the Yoda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       movimento();
    }
public void move()
    {
        move(1);
    }
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }

public void movimento(){
        if (Greenfoot.isKeyDown("Up")) {
            this.setLocation(this.getX(), this.getY() - speed);
            
        }
          if (Greenfoot.isKeyDown("Down")) {
            this.setLocation(this.getX(), this.getY() + speed);
            
        }
          if (Greenfoot.isKeyDown("Left")) {
            this.setLocation(this.getX() - speed, this.getY());
        }
            
          if (Greenfoot.isKeyDown("Right")) {
            this.setLocation(this.getX() + speed, this.getY() );
           
        }
         if(Greenfoot.isKeyDown("f")) {
        getWorld().addObject(new Bola_De_Fogo(), getX() +30, getY() -30);
        
}
}
}
