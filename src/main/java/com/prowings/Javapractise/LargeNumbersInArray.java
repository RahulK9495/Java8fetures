package com.prowings.Javapractise;

public class LargeNumbersInArray {
	
	public static void main(String[] args) {
        
		   int num[] = {2,4,6,7,9,8,7,111,8,9};
		   
		    int large =0;
		    
		   for(int i=0; i<=num.length-1; i++)
		   {
		        if (num[i]> large)
		        {
		            large=num[i];
		        }
		   }
		   
		   System.out.println(large);
		}

}
