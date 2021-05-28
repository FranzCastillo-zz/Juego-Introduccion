import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jos� Kiesling 
 * CoralAmarillo
 * 20 de mayo
 */
public class CoralMorado extends Actor
{
    private int velocidad; //Variable de velocidad
    
    public CoralMorado(int v){
        velocidad = v;
    }
    //Acci�n del coral
    public void act() 
    {
        setLocation(getX(), getY() + velocidad); //Obtener posici�n del coral
        if( getY() >= getWorld().getHeight() - 1 ){ // Condici�n que eval�a si ha llegado al fondo de la panatalla
            MyWorld juego = (MyWorld) getWorld(); //Llamar 
            juego.removeObject(this); //Eliminar el objeto
            juego.aumentar_puntuacion(10); //Aumentar la puntuaci�n 
            juego.disminuir_num_corales(); //Disminuir el n�mero de corales
            juego.aumentar_num_adelantamientos(); //Aumentar la velocidad
        }
    }    
}
