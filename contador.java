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

public class contador extends Actor
{
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;

    public contador(){
        this("");
    }
    public contador(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        image.setColor(Color.BLACK);
        
        updateImage();
    }
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }
    public void add(int score){
        target += score;
    }
    public void subtract(int score){
        target -= score;
    }
    public int getValue(){
        return value;
    }
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 18);
    }
}
