import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rival: Piraña.
 * 
 */
public class Piraña extends Actor
{
    private int velocidad;
    
    public Piraña(int v){
        velocidad = v;
    }
    /**
     * Act - Acciones que realiza el rival Piraña, se llama cuando a partir del nivel 4.
     */
    public void act() 
    {
        //Aparición y colisión.
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
