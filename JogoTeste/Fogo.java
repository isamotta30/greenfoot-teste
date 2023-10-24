import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fogo extends Actor
{
    GifImage myGif = new GifImage("bola2.gif");
    /**
     * Act - do whatever the Fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
