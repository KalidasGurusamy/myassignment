package week4.day2homeassignment;

public class Prog9Palindrome {

	public static void main(String[] args) {
		
		// Declare A String value as"madam"
		String str = "Kalidas";
		
		//Declare another String rev value as ""
		String sRevStr = "";
		
		//Iterate over the String in reverse order
		for(int i=str.length()-1;i>=0; i-- )
			sRevStr = sRevStr + str.charAt(i);//Add the char into rev
		
		//Compare the original String with the reversed String, if it is same then print palinDrome 
		if(sRevStr.equalsIgnoreCase(str))
			System.out.println("palindrome");
		else
			System.out.println("Not Palindrome");		
		
	}

}
