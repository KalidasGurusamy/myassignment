package week1.day2homeassignment;

import java.util.Arrays;

public class Prog7MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,7,6,8};
		
		Arrays.sort(array1);
		int sIntration =1;
		for (int i=0; i<array1.length; i++)
		{
			if(!(array1[i] == sIntration))
			{
				System.out.println(sIntration + " is not equal to Intration Value");
				break;
			}
			sIntration++;
		}
		
	}

}
