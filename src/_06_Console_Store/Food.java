package _06_Console_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Food implements PricedItem{
    String item;
    int price;

    public abstract JLabel getFood();
    
    public abstract int getPrice();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO.read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
