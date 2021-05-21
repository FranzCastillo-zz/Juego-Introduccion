import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mclaren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pez extends Actor
{
    private int velocidad;
    
    public Pez(int v){
        velocidad = v;
    }
    
    /**
     * Act - do whatever the mclaren wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 350)
                setLocation(getX() + velocidad, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 50)
                setLocation(getX() - velocidad, getY()); 
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 50)
                setLocation(getX() , getY() - velocidad); 
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 600)
                setLocation(getX() , getY() + velocidad); 
        }
        
        checkCollision();
    }
    
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(CoralAmarillo.class);
        Actor collided2 = getOneIntersectingObject(CoralMorado.class);
        Actor collided3 = getOneIntersectingObject(CoralRosa.class);
        if (collided != null)
        {
          getWorld().removeObject(collided);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
        if (collided2 != null)
        {
          getWorld().removeObject(collided);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
        if (collided3 != null)
        {
          getWorld().removeObject(collided);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
    }
    
    public void aumenta_velocidad(){
        velocidad++;
    }
}