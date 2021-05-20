import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(416, 608, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pez pez = new Pez();
        addObject(pez,181,394);
        CoralAmarillo coralAmarillo = new CoralAmarillo();
        addObject(coralAmarillo,57,214);
        CoralMorado coralMorado = new CoralMorado();
        addObject(coralMorado,352,217);
        coralAmarillo.setLocation(267,201);
        CoralRosa coralRosa = new CoralRosa();
        addObject(coralRosa,169,244);
        coralRosa.setLocation(61,211);
        coralAmarillo.setLocation(317,352);
        coralMorado.setLocation(212,213);
        coralAmarillo.setLocation(362,191);
        CoralAmarillo coralAmarillo2 = new CoralAmarillo();
        addObject(coralAmarillo2,164,62);
        CoralRosa coralRosa2 = new CoralRosa();
        addObject(coralRosa2,336,378);
    }
}
