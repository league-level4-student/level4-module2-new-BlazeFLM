package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		
		boolean x = new Random().nextBoolean();
		this.item = x ? "cereal1.jpeg" : "cereal2.jpeg";
		price = 8;
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
