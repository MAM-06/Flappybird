import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class come here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class come extends World
{

    /**
     * Constructor for objects of class come.
     * 
     */
    public come()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.start();
        addObject(new exit(), 530, 370);
        addObject(new deve(), 65, 370);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("x.mp3");
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
}
