import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rival: Pira�a.
 * 
 */
public class Pira�a extends Actor
{
    private int velocidad;
    
    public Pira�a(int v){
        velocidad = v;
    }
    /**
     * Act - Acciones que realiza el rival Pira�a, se llama cuando a partir del nivel 4.
     */
    public void act() 
    {
        //Aparici�n y colisi�n.
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
