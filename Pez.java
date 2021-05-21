import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Pez here.
 * 
 * @author (Deloz09) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    private int velocidad;
    
    public Pez(int v){
        velocidad = v;
    }
    /**
     * Act - do whatever Pez wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + velocidad);
        if( getY() >= getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentarPuntuacion(10);
        }
    }    
}