package com.prowings.Javapractise;

public class StarPyramid {
	
	public static void main(String[] args) {
		
		starPyramid(4);
	}

	public static void starPyramid(int value)
	{
		int ovalue = value;
		
		for(int i=0; i<=value; i++)
		{
			for(int j=ovalue; j>=1; j--)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("*");
			for(int j=1;j<=i; j++)
				System.out.print("*");
			
			System.out.println();
			ovalue --;
		}
	}
}
