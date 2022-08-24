package week4.day2homeassignment;

import java.util.TreeSet;

public class Prog2MissingNumber {

	public static void main(String[] args) {
		
		int[] snumb = {3,5,6,4,5,3,6,7,8,6,10,10,3,4,5,6};
	
		
		TreeSet<Integer> sDataTreeSet = new TreeSet<Integer>();
		
		 //Remove the duplicates using Set
		for(int i=0;i<snumb.length;i++)
			sDataTreeSet.add(snumb[i]);
		
		//Make sure the set is in the ascending order
		System.out.println(sDataTreeSet);
		
		//Iterate from the starting number and verify the next number is + 1
		int sstart = sDataTreeSet.first();
		int snext = sstart + 1;
		
		for(Integer integer : sDataTreeSet)
		{
			if(integer == snext -1)
			{
				snext = snext +1;
				
			}
			else
			{
				//If did not match, that is the number
				System.out.println("Missing Number is - " + (snext -1) );
				break;
			}
				
		}
		 
	}
		
}
