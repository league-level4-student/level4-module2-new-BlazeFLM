package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	public Toy() {
		
		boolean x = new Random().nextBoolean();
		this.item = x ? "toy1.jpeg" : "toy2.jpeg";
		price = 25;
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
