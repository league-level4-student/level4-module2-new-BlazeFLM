package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toiletries extends NonFood {

	public Toiletries() {
		
		boolean x = new Random().nextBoolean();
		this.item = x ? "toiletries1.jpeg" : "toiletries2.jpeg";
		price = 15;
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
