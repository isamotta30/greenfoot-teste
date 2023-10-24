import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(670, 446, 1); 
    }

    public void act(){
        //Diálogo yoda
        if (Greenfoot.isKeyDown("enter")){
            intro1 world = new intro1();
            Greenfoot.setWorld(world);
        }
    }
}