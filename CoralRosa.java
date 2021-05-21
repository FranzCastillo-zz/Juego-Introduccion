import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoralRosa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoralRosa extends Actor
{
    private int velocidad;
    
    public CoralRosa(int v){
        velocidad = v;
    }
    /**
     * Act - do whatever the CoralRosa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            if(getX() < 460)
                setLocation(getX() + velocidad, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            if(getX() > 140)
                setLocation(getX() - velocidad, getY()); 
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() > 300)
                setLocation(getX() , getY() - velocidad); 
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() < 640)
                setLocation(getX() , getY() + velocidad); 
        }
        
        choque();
    }
    public void choque(){
        Actor collided = getOneIntersectingObject(Pez.class);
        if (collided != null)
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
