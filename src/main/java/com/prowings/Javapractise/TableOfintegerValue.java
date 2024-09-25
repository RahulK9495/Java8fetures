package com.prowings.Javapractise;

public class TableOfintegerValue {
	
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        // Table of 8 between 0 to 100
        multiplicationOf(8);
    }
    
    public static void multiplicationOf(int num)
    {
        if(num == 0)
        System.out.println("Please enter correct number");
        
        for(int i=1; ; i++)
        {
            int product = num * i;
            if(product > 100)
            {
                break;
            }
                System.out.println(product);
        }
              
        
    }

}
