import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darth_Vader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darth_Vader extends Actor
{
    public int speed=3;
    /**
     * Act - do whatever the Darth_Vader wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - speed);
           
        }
          if (Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + speed);
            
        }
          if (Greenfoot.isKeyDown("a")) {
            this.setLocation(this.getX() - speed, this.getY());
           
        }
          if (Greenfoot.isKeyDown("d")) {
            this.setLocation(this.getX() + speed, this.getY() );
            
        }
           if(Greenfoot.isKeyDown("f")) {
        getWorld().addObject(new Bola_De_Fogo(), getX() -80, getY() -70);
       
     
        
    }

}
}

    
