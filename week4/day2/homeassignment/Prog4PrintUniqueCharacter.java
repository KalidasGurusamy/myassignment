package week4.day2homeassignment;

import java.util.HashSet;

public class Prog4PrintUniqueCharacter {

	public static void main(String[] args) {
		
		
		String sname ="kalidas";
		
		//Convert String to Character array
		char[] snamechr = sname.toCharArray();
		
		//Create a new Set -> HashSet
		HashSet<Character> sUniquecharset = new HashSet<Character>();
		
		//Add each character to the Set and if it is already there, remove it
		for(int i=0; i<snamechr.length;i++)
		{
			if(!sUniquecharset.add(snamechr[i]))
				sUniquecharset.remove(snamechr[i]);
		}
		//print the set
		System.out.println(sUniquecharset);

	}

}
