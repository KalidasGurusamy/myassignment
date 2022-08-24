package week4.day2homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Prog1FindSecondLargest {
	
	
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Create a empty Set Using TreeSet
		Set<Integer> sDataTreeSet = new TreeSet<Integer>();
		
		//Declare for loop iterator from 0 to data.length and add into Set
		for(int i=0; i< data.length; i++)
		{
			sDataTreeSet.add(data[i]);
		}
		
		//converted Set into List
		List<Integer> sDataList = new ArrayList<Integer>();
		for(Integer integer : sDataTreeSet)
		{
			sDataList.add(integer);
		}
		
		//Print the second last element from List
		System.out.println("The second last element from List - " + sDataList.get(sDataList.size()-2));
		
	}

}
