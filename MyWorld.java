import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     *
     */
    
    int[] arreglo;
    public MyWorld()
    {    
        // Create a new world with 420x610 cells with a cell size of 1x1 pixels.
        //super(416, 608, 1);
        super(420, 610, 1);
        prepare();
        generarCoral();
        colocarCoral(arreglo);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pez pez = new Pez();
        addObject(pez,210,580);
    }
    
    private void generarCoral()
    {
        Random random = new Random();
        int limite = 4; //Limite hasta 4 para generar los randoms
        int cont = 0;
        int contCorales = 0;
        arreglo = new int[4];
        for(int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = 0;
        }
        
        while(cont < 4)
        {
            int posicion = random.nextInt(limite);
            if(arreglo[posicion] == 0 && contCorales < 3)
            {
                arreglo[posicion] = 1; // 1 representa un coral
                contCorales++;
                cont++;
            }
            if(arreglo[posicion] == 0 && contCorales == 3)
            {
                arreglo[posicion] = 2; // 2 representa el pbjeto transparente
                cont++;
            }
        }
    }
    
    private void colocarCoral(int[] arreglo)
    {
        int distancia = 150;
        CoralAmarillo coralAmarillo = new CoralAmarillo();
        CoralMorado coralMorado = new CoralMorado();
        CoralRosa coralRosa = new CoralRosa();
        Transparente transparente = new Transparente();
        int cont = 0;
        for(int i: arreglo)
        {
            if(i == 1 && cont == 0)
            {
                addObject(coralAmarillo,50 + cont * distancia,0);
                cont++;
            }
            if(i == 1 && cont == 1)
            {
                addObject(coralMorado,50 + cont * distancia,0);
                cont++;
            }
            if(i == 1 && cont == 2)
            {
                addObject(coralRosa,50 +cont * distancia,0);
                cont++;
            }
        }
    }
}
