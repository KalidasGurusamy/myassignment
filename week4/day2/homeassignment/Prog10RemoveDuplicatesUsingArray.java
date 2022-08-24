package week4.day2homeassignment;

public class Prog10RemoveDuplicatesUsingArray {
	
	public static void main(String[] args) {
		
		//Use the declared String text as input
		String sText = "We learn java basics as part of java sessions in java week1";
		
		//Initialize an integer variable as count
		int sCount = 0;
		String sNoDupText = "";
		//Split the String into array and iterate over it
		String[] textarray = sText.split(" ");
		
		for(int i=0; i<textarray.length; i++)
		{
			sCount = 0;
			for(int j=i+1;j<textarray.length -1;j++)
			{
				if(textarray[i].equals(textarray[j]))
				{
					textarray[j] = "";
					sCount++;
				}	
			}
				sNoDupText = sNoDupText + " " + textarray[i];
		}
		System.out.println(sNoDupText);
	}

}
