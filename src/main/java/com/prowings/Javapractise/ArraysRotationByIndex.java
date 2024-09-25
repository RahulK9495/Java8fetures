package com.prowings.Javapractise;

public class ArraysRotationByIndex {
	
	public static void main(String[] args) {
        
		   int num[] = {2,4,6,7,9,4,5};
		   int value =2;
		   int n =num.length;
		  
		    
		    rotateArray(num, value, n);
		}

		    public static void rotateArray(int num[], int value, int n )
		    {
		    	int temp[] = new int [n];
		    	
		    	int k=0;
		    	
		    	for(int i = value; i<n; i++)
		    	{
		    		temp[k]=num[i];
		    		k++;
		    	}
		    	for(int i=0; i<value; i++)
		    	{
		    		temp[k]=num[i];
		    		k++;
		    	}
		    	
		    	for(int j = 0; j<temp.length; j++)
		    	{
		    		System.out.println(temp[j]);
		    	}
		    }

}
