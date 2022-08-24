package week4.day2homeassignment;

import java.util.TreeSet;

public class Prog3PrintDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		int i,j;
		
		//Print only duplicate values using for loop
		System.out.println("Print duplicate values using for loop");
		for (i=0; i<data.length;i++ )
		{
			for(j=i+1; j<data.length;j++)
			{
				if(data[i] == data[j])
				{
					System.out.println(data[i]);
				}
			}
		}
		System.out.println("Print duplicate values using Using Set");
		TreeSet<Integer> sDataTreeSet = new TreeSet<Integer>();
		for (i=0; i<data.length;i++ )
		{
			if(!sDataTreeSet.add(data[i]))
				System.out.println(data[i]);
				
		}
	}

}
