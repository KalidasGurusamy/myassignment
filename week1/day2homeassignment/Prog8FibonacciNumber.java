package week1.day2homeassignment;

public class Prog8FibonacciNumber {
	
	public static void main(String[] args) {
		
		int sRange = 8, sFstNumb =0, sSecNumb =1, sSum=0;
		for(int i=1; i<sRange; i++)
		{
			sSum = sFstNumb + sSecNumb;
			sFstNumb = sSecNumb;
			sSecNumb = sSum;
		}
		System.out.println("The Fibonacci Series of " + sRange + " is - " + sSum);
	}

}
