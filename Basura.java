import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstáculo: Basura. 
 * 
 */
public class Basura extends Actor
{
    
    private int velocidad;
    
    public Basura(int v){
        velocidad = v;
    }
    /**
     * Act - Acciones que realiza el obstáculo Basura, se llama cuando el juego inicia.
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
