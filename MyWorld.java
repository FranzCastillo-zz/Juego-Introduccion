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
        coralRosa.setLocation(61,192);
        coralMorado.setLocation(268,200);
        coralRosa.setLocation(50,177);
        coralAmarillo2.setLocation(209,202);
        coralRosa.setLocation(43,195);
        coralAmarillo.setLocation(344,399);
        coralMorado.setLocation(354,187);
        coralAmarillo2.setLocation(258,206);
        coralRosa.setLocation(64,208);
        pez.setLocation(222,540);
        pez.setLocation(196,555);
        coralRosa.setLocation(60,216);
        coralAmarillo.setLocation(311,374);
        coralAmarillo2.setLocation(259,207);
        pez.setLocation(218,555);
        coralAmarillo.setLocation(330,377);
        coralAmarillo.setLocation(81,390);
        coralRosa2.setLocation(81,390);
        pez.setLocation(200,548);
        coralRosa2.setLocation(108,380);
        coralRosa2.setLocation(84,396);
        coralRosa2.setLocation(99,387);
        removeObject(coralRosa2);
        removeObject(coralAmarillo);
        coralAmarillo2.setLocation(264,270);
        coralMorado.setLocation(336,248);
        coralRosa.setLocation(49,255);
        coralMorado.setLocation(336,245);
        coralAmarillo2.setLocation(249,251);
        coralMorado.setLocation(354,255);
    }
}
