package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends NonFood{
	public Clothing() {
		
		boolean x = new Random().nextBoolean();
		this.item = x ? "clothing1.jpeg" : "clothing2.jpeg";
		price = 30;
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
