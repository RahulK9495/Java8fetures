package com.prowings.Javapractise;

public class factorial {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i= 2; i<=num; i++)
		{
			 fact *= i;
		}
		
		
		return fact;
	}

}
