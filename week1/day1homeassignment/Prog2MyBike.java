package week1.day1homeassignment;

public class Prog2MyBike {
	
	public void applyBreak()
	{
		System.out.println("Applied break");
	}
	
	public void soundHorn()
	{
		System.out.println("Sound horn");
	}

	public static void main(String[] args) {
		
		Prog1MyCar mycar = new Prog1MyCar();
		mycar.soundHorn();
		mycar.applyBreak();
		
		Prog2MyBike mybike = new Prog2MyBike();
		mybike.soundHorn();
		mybike.applyBreak();
	}

}
