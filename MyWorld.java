import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private contador score;
    private contador level;
    
    private int velocidad_coche;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private Pez pez;
    private int num_rivales;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        
       num_adelantamientos = 0;
       num_adelantamientos_nivel = 4;
       velocidad_coche = 2;
       
       score = new contador("Score: " );
       level = new contador("Level: " );
       level.add(1);
       pez = new Pez(velocidad_coche);
       
       addObject(pez, 200, 500);
       addObject(level, 205, 90);
       addObject(score, 205, 60);
    }
    
    public void act(){
        aumentar_dificultad();
        aniadir_rivales();
    }
    
    public int getRandomNumber(int start,int end){
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    
    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }
    
    public void disminuir_num_rivales(){
        num_rivales--;
    }
    
    
    public void aumentar_dificultad(){
        if(num_adelantamientos == num_adelantamientos_nivel){
            num_adelantamientos = 0;
            num_adelantamientos_nivel = num_adelantamientos_nivel + 2;
            velocidad_coche++;
            level.add(1);
            pez.aumenta_velocidad();
        }
    }
   
    public void aniadir_rivales(){
        
        if(num_rivales == 0){
            
            int carril = getRandomNumber(0,3);
            
            if(carril == 0){
                addObject(new CoralAmarillo(velocidad_coche),90, 80);
            }
            else if( carril == 1){
                addObject(new CoralMorado(velocidad_coche),200, 80);
            }
            else{
                addObject(new CoralRosa(velocidad_coche),330, 80);
            }
            
            carril++;
            carril = carril % 3;
            
            if(carril == 0){
                addObject(new CoralAmarillo(velocidad_coche),90, 80);
            }
            else if( carril == 1){
                addObject(new CoralMorado(velocidad_coche),220, 80);
            }
            else{
                addObject(new CoralRosa(velocidad_coche),330, 80);
            }
            
            
            num_rivales = 2;
        }
    }
    
    
    
}

