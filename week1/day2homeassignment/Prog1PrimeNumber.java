package week1.day2homeassignment;

public class Prog1PrimeNumber {
	
	public static void main(String[] args) {
		int sNumber =10;
		char sprimeflg ='N';
		for(int i=1; i<=sNumber; i++)
		{
			if(sNumber%i == 0)
			{
				if(i ==1 || i == sNumber)
				{
					sprimeflg = 'Y';
				}
				else
				{
					sprimeflg = 'N';
					System.out.println(sNumber + " is a Not Prime Number");
					break;
				}
			}
		}
		if(sprimeflg == 'Y')
			System.out.println(sNumber + " is a Prime Number");
			
	}

}
