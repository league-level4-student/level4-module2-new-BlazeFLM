package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Food{
	public Candy() {
		
		boolean x = new Random().nextBoolean();
		this.item = x ? "candy1.jpeg" : "candy1.jpeg";
		price = 5;
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
