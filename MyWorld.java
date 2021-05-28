import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Juego Fish Tales.
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

//Clase MyWorld
public class MyWorld extends World
{
    //Declaración de variables
    private contador score;
    private contador level;
    private int nivelcont;
    private int velocidad_pez;
    private int num_adelantamientos;
    private int num_adelantamientos_nivel;
    private Pez pez;
    private int num_corales;
    //Música de fondo
    public GreenfootSound backgroundMusic1 = new GreenfootSound("levels.wav");
    
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
       velocidad_pez = 2;
       
       //Contador de niveles y puntuación
       score = new contador("Score: " );
       level = new contador("Level: " );
       level.add(1);
       nivelcont=1;
       pez = new Pez(velocidad_pez);
       
       //Se añade al personaje, niveles y puntuación
       addObject(pez, 200, 500);
       addObject(level, 90, 60);
       addObject(score, 90, 30);
       
    }
    
    public void act(){
        aumentar_dificultad();
        aniadir_rivales();
        backgroundMusic1.playLoop();
    }
    
    public int getRandomNumber(int start,int end){
       //Obtener número random
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
    public void aumentar_puntuacion(int valor){
        score.add(valor);
    }
    
    public void aumentar_num_adelantamientos(){
        num_adelantamientos++;
    }
    
    public void disminuir_num_corales(){
        num_corales--;
    }
    
    public void aumentar_dificultad(){
        //Se aumenta dificultad conforme se superan a los rivales
        if(num_adelantamientos == num_adelantamientos_nivel){
            num_adelantamientos = 0;
            num_adelantamientos_nivel = num_adelantamientos_nivel + 2;
            velocidad_pez++;
            //Aumenta el nivel
            level.add(1);
            nivelcont++;
            pez.aumenta_velocidad();
        }
    }
   
    public void aniadir_rivales(){
        //Se añaden los rivales
        if(num_corales == 0){
            if(nivelcont<=4)
            {
                
                int carril = getRandomNumber(0,3);
                
                if(carril == 0){
                    addObject(new CoralAmarillo(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new CoralMorado(velocidad_pez),195, 80);
                }
                else{
                    addObject(new CoralRosa(velocidad_pez),310, 80);
                }
                
                carril++;
                carril = carril % 3;
                
                if(carril == 0){
                    addObject(new CoralAmarillo(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new CoralMorado(velocidad_pez),195, 80);
                }
                else{
                    addObject(new CoralRosa(velocidad_pez),310, 80);
                }
                
                
                num_corales = 2;
            }
            else if(nivelcont>=4 && nivelcont<8)
            {
                int carril = getRandomNumber(0,3);
                
                if(carril == 0){
                    addObject(new Piraña(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new Piraña(velocidad_pez),195, 80);
                }
                else{
                    addObject(new Piraña(velocidad_pez),310, 80);
                }
                
                carril++;
                carril = carril % 3;
                
                if(carril == 0){
                    addObject(new Piraña(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new Piraña(velocidad_pez),195, 80);
                }
                else{
                    addObject(new Piraña(velocidad_pez),310, 80);
                }
                
                
                num_corales = 2;
            }
            else{
                int carril = getRandomNumber(0,3);
                
                if(carril == 0){
                    addObject(new Basura(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new Basura(velocidad_pez),195, 80);
                }
                else{
                    addObject(new Basura(velocidad_pez),310, 80);
                }
                
                carril++;
                carril = carril % 3;
                
                if(carril == 0){
                    addObject(new Basura(velocidad_pez),90, 80);
                }
                else if( carril == 1){
                    addObject(new Basura(velocidad_pez),195, 80);
                }
                else{
                    addObject(new Basura(velocidad_pez),310, 80);
                }
                
                
                num_corales = 2;
            }
        }
    }
    
    
    
}

