import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Juego Fish Tales.
 * RIVAL PIRAÑA
 *
 * @version: 2.0
 * 
 * @autores:
 * José Pablo Kiesling Lange - 21581
 * Fernanda Esquivel de Leon - 21542
 * Francisco Javier Castillo Cerna - 21562
 * Diego Estuardo Lemus Lopez - 21469
 * Andrés Estuardo Montoya - 21552
 * 
 * @realización: 14 - 28 de mayo 2021
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
