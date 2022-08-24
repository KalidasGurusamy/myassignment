package week4.day2homeassignment;

import java.util.LinkedHashSet;

public class Prog6RemoveDuplicatesUsingList {

	public static void main(String[] args) {
		
		//Declare a String as PayPal India
		String sText = "PayPal India";
		
		int i;
		
		//Convert it into a character array
		char[] sCharArray = sText.toCharArray();
		
		//Declare a Set as charSet for Character
		LinkedHashSet<Character> sCharset = new LinkedHashSet<Character>();
		
		//Declare a Set as dupCharSet for duplicate Character
		LinkedHashSet<Character> sDupCharset = new LinkedHashSet<Character>();
		
		//Iterate character array and add it into charSet
		for(i=0;i<sCharArray.length;i++)
		{
			//if the character is already in the charSet then, add it to the dupCharSet
			if(!sCharset.add(sCharArray[i]))
				sDupCharset.add((sCharArray[i]));
		}
		//System.out.println(sCharset);
		//System.out.println(sDupCharset);
		for(Character character : sDupCharset)
		{
			sCharset.remove(character);
		}
		//System.out.println(sCharset);
		
		for(Character character : sCharset)
		{
			//Check the iterator variable isn't equals to an empty space and Print it
			if(!character.equals(' '))
				System.out.print(character);
		}
				
		
	}

}
