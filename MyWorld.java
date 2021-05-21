import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public contador puntos;
    public contador nivel;
    
    public int velocidadPez;
    public int obstaculosAdelantados;
    public int obstaculosAdelantadosPorNivel;
    public Pez pez;
    public int cantidadObstaculos;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(420, 610, 1);
        
           obstaculosAdelantados = 0;
           obstaculosAdelantadosPorNivel = 4;
           velocidadPez = 2;
           
           puntos = new contador("Puntos: " );
           nivel = new contador("Nivel: " );
           nivel.sumar(1);
           pez = new Pez(velocidadPez);
           
           addObject(pez, 210, 580);
           addObject(nivel, 205, 90);
           addObject(puntos, 205, 60);
    }

    public int getRandomNumber(int inicio,int fin){
       int normal = Greenfoot.getRandomNumber(fin-inicio+1);
       return normal+inicio;
    }
    
    public void aumentarPuntuacion(int valor){
        puntos.sumar(valor);
    }
}

