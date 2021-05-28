import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Juego Fish Tales.
 * RIVAL PIRA�A
 *
 * @version: 2.0
 * 
 * @autores:
 * Jos� Pablo Kiesling Lange - 21581
 * Fernanda Esquivel de Leon - 21542
 * Francisco Javier Castillo Cerna - 21562
 * Diego Estuardo Lemus Lopez - 21469
 * Andr�s Estuardo Montoya - 21552
 * 
 * @realizaci�n: 14 - 28 de mayo 2021
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
