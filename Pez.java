import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Protagonista: Pez.
 * 
 */

public class Pez extends Actor
{
    //Declaración de variables
    private int velocidad;
    boolean bandera=false;
    GreenfootSound deathsound = new GreenfootSound("dead.wav");
    
    //Velocidad del Pez
    public Pez(int v){
        velocidad = v;
    }
    
    
    /**
     * Act - Acciones que realiza el pez, se llama cuando el juego inicia.
     */
    public void act() 
    {
        //Movimientos: arriba, abajo, derecha, izquierda.
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
        try{
   
        Actor collided = getOneIntersectingObject(CoralAmarillo.class);
        Actor collided2 = getOneIntersectingObject(CoralMorado.class);
        Actor collided3 = getOneIntersectingObject(CoralRosa.class);
        Actor collided4 = getOneIntersectingObject(Piraña.class);
        Actor collided5 = getOneIntersectingObject(Basura.class);
        
        //En caso de colisión con Pez
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
        if (collided4 != null)
        {
          getWorld().removeObject(collided);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
        if (collided5 != null)
        {
          getWorld().removeObject(collided);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
    }
    catch(Exception e){
    }
    }
    
    //Aumento de velocidad de Pez
    public void aumenta_velocidad(){
        velocidad++;
    }
}