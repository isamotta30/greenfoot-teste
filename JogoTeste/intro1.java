import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro1 extends intro
{

    /**
     * Constructor for objects of class intro1.
     * 
     */
    public intro1()
    {
    }
    
        public void act(){
        //Diálogo yoda
        if (Greenfoot.isKeyDown("enter")){
            intro2 world = new intro2();
            Greenfoot.setWorld(world);
        }
    }
}
