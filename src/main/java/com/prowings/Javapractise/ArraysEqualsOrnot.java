package com.prowings.Javapractise;

import java.util.Arrays;

public class ArraysEqualsOrnot {
	
	public static void main(String[] args) {
		
		int arr1[] = new int[] {2,4,5,6,2,3};
		int arr2[] = new int[] {2,4,5,2,2,3};
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");
		
		String[] inarray1 = new String[] {"mango", "grapes", "plum", "watermelon", "apple"};   
		String[] inarray2 = new String[] {"mango", "grapes", "plum", "watermelon"};
		
		if(Arrays.equals(inarray1, inarray2))
		{
			System.out.println("Arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");
	}

}
