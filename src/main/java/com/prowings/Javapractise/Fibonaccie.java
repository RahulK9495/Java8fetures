package com.prowings.Javapractise;

public class Fibonaccie {
	
	public static void fabonacci(int num)
	{
		int fb[] = new int [num];
		
		for(int i=1; i<=num-1; i++)
		{
			fb[i] =i+i;
		}
		
		System.out.println(fb);
	}

	public static void main(String[] args) {
		
		fabonacci(5);
	}
}
