package com.prowings.Javapractise;

import java.util.Arrays;

public class ReverseStringByWord {
	
	
	public static void main(String[] args) {
		
		
		String str = "My name is rahul";
		
		String[] spl = str.split(" ");
		
		System.out.println(Arrays.toString(spl));
		
		String rev = "";
		
		for(int i=spl.length-1; i>=0; i--)
		{
			rev = rev+" " + spl[i];
		}
		
		System.out.println(rev);
		
		
	}
	
	

}
