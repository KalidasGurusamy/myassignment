package week4.day2homeassignment;

import java.util.ArrayList;
import java.util.List;

public class Prog5FindIntersectionList {

	public static void main(String[] args) {
		
		int i,j;
		
		//Declare An Array for {3,2,11,4,6,7};
		int[] a={3,2,11,4,6,7};
		
		//Declare another Array for {1,2,8,4,9,7};
		int[] b={1,2,8,4,9,7};
		
		//create a two empty Lists - list1 & list2
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//eclare for loop iterator from 0 to array a.length and add into list
		for(i=0; i<a.length; i++)
			list1.add(a[i]);
		
		for(i=0; i<b.length; i++)
			list2.add(b[i]);
		
		//Compare Both list1 & list2 using a nested for loop
		for(i=0;i<list1.size();i++)
		{
			for(j=0; j<list2.size();j++)
			{
				if(list1.get(i) == list2.get(j))
				{
					//Print the matching number
					System.out.println(list1.get(i));
				}
			}
		}
		
		
	}

}
