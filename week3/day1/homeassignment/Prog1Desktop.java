package week3.day1.homeassignment;

public class Prog1Desktop extends Prog1Computer {
	
	public void desktopSize()
	{
		System.out.println("Desktop Size");
	}
	
	
	public static void main(String[] args) {
		
		Prog1Desktop prog1desktop = new Prog1Desktop();
		
		prog1desktop.desktopSize();
		prog1desktop.computerModel();
	}

}
