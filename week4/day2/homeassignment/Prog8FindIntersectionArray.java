package week4.day2homeassignment;

public class Prog8FindIntersectionArray {
	
	
	public static void main(String[] args) {
		
		//Declare An array for {3,2,11,4,6,7};
		int[] a ={3,2,11,4,6,7};
		
		//Declare another array for {1,2,8,4,9,7};
		int b[] = {1,2,8,4,9,7};
		
		
		//Declare for loop iterator from 0 to array length
	for(int i=0; i<a.length; i++)
	{
		//Declare a nested for another array from 0 to array length
		for(int j=0;j<b.length; j++)
		{
			//Compare Both the arrays using a condition statement
			if(a[i] == b[j])
				System.out.println(a[i]);//Print the first array (should match item in both arrays)
		}
	}
		
	}

}
