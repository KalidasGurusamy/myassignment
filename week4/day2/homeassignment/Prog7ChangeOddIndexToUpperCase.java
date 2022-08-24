package week4.day2homeassignment;

public class Prog7ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		//Declare String Input as Follow
		String test = "changeme";
		String Convtest ="";
		
		//Convert the String to character array
		char[] testchar = test.toCharArray();
		
		 //Traverse through each character (using loop)
		for(int i=0; i<testchar.length; i++)
		{
			//find the odd index within the loop (use mod operator)
			//change the character to uppercase, if the index is odd else don't change
			if(i%2 == 1)
				Convtest = Convtest + Character.toUpperCase(testchar[i]);
			else
				Convtest = Convtest + testchar[i];
		}
		System.out.println(Convtest);
	}

}
