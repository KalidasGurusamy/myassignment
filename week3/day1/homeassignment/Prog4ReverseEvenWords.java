package week3.day1.homeassignment;

public class Prog4ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] sStrarray =  test.split(" ");
		int i=0, j=0;
		String sEvenREverseWord ="";
		for(i=0;i<sStrarray.length;i++)
		{
			if(i==0)
				sEvenREverseWord = sStrarray[i];
			else if(i%2 == 1)
			{
				sEvenREverseWord = sEvenREverseWord + " ";
				char[] reversechar = sStrarray[i].toCharArray();
				for(j=reversechar.length-1;j>=0; j--)
				{
					sEvenREverseWord = sEvenREverseWord +  reversechar[j];
				}
				
			}
			else
			sEvenREverseWord = sEvenREverseWord + " " + sStrarray[i];
		}
		System.out.println(sEvenREverseWord);

	}

}
