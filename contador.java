import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    private int valor = 0;
    private int objetivo = 0;
    private String texto;
    private int largo;

    public contador()
    {
        this(""); //Asigna el valor vacio al inicio del juego
    }
    public contador(String antes)
    {
        texto = antes;
        largo = (texto.length() + 2) * 16; //Ajusta el tamaño del texto

        setImage(new GreenfootImage(largo, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        image.setColor(Color.BLACK);
        actualizar();
    }
    public void act() {
        if(valor < objetivo) {
            valor++;
            actualizar();
        }
        else if(valor > objetivo) {
            valor--;
            actualizar();
        }
    }
    public void sumar(int puntos){
        objetivo += puntos;
    }
    public void restar(int puntos){
        objetivo -= puntos;
    }
    public int obtenerValor(){
        return valor;
    }
    private void actualizar(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(texto + valor, 1, 18);
    }
}
