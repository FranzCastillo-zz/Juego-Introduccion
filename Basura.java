import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ferrari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basura extends Actor
{
    private int velocidad;
    
    public Basura(int v){
        velocidad = v;
    }
    /**
     * Act - do whatever the ferrari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + velocidad);
        if( getY() >= getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(10);
            juego.disminuir_num_corales();
            juego.aumentar_num_adelantamientos();
        }
    }    
}
