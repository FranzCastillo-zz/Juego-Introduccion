import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * José Kiesling 
 * CoralAmarillo
 * 20 de mayo
 */
public class CoralMorado extends Actor
{
    private int velocidad; //Variable de velocidad
    
    public CoralMorado(int v){
        velocidad = v;
    }
    //Acción del coral
    public void act() 
    {
        setLocation(getX(), getY() + velocidad); //Obtener posición del coral
        if( getY() >= getWorld().getHeight() - 1 ){ // Condición que evalúa si ha llegado al fondo de la panatalla
            MyWorld juego = (MyWorld) getWorld(); //Llamar 
            juego.removeObject(this); //Eliminar el objeto
            juego.aumentar_puntuacion(10); //Aumentar la puntuación 
            juego.disminuir_num_corales(); //Disminuir el número de corales
            juego.aumentar_num_adelantamientos(); //Aumentar la velocidad
        }
    }    
}
