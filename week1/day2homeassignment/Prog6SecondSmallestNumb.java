package week1.day2homeassignment;

import java.util.Arrays;

public class Prog6SecondSmallestNumb {
	
	public static void main(String[] args) {
		
		int[] array1 = {23,45,67,32,89,22};
		int sSecondSmallNumb =array1[0], sFstnum =array1[1], j=0;
		
		//**************Way1***********************
		System.out.println("Using Array Sort Function");
		Arrays.sort(array1);
		System.out.println(array1[1]);
		
		//**************Way2***********************
		for(int i=0; i<(array1.length -1); i++ )
		{
			if(array1[i] > array1[i+1])
			{
				if(sFstnum > array1[i+1])
					sFstnum = array1[i+1];
				if(sSecondSmallNumb > array1[i])
					sSecondSmallNumb = array1[i];
			}
			else
			{
				if(sFstnum > array1[i])
					sFstnum = array1[i];
				if(sSecondSmallNumb > array1[i+1])
					sSecondSmallNumb = array1[i+1];
			}
		}
		System.out.println("Using Custom logic");
		System.out.println(sSecondSmallNumb);
	}

}
