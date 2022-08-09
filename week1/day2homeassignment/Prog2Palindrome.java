package week1.day2homeassignment;

public class Prog2Palindrome {
	
	public static void main(String[] args) {
		int sNumb = 151;
		int sTemp, sNumb1, sSum=0;
		sTemp = sNumb;
		for(int i=1; sNumb > 0;i++)
		{
			sNumb1 = sNumb %10;
			sSum = (sSum*10) + sNumb1;
			sNumb = sNumb/10;
		}
		if(sTemp == sSum)
			System.out.println(sTemp + " is a Palindrome Number.");
		else
			System.out.println(sTemp + " is Not a Palindrome Number.");
	}

}
