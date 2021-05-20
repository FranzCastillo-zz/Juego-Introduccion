import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    /**
     * Act - do whatever the Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mover();
    }
    public void mover()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3); //gira 3 a la izquierda
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3); //gira 3 a la derecha
        }
    }
}
