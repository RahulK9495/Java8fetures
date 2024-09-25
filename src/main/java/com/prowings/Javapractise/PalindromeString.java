package com.prowings.Javapractise;

public class PalindromeString {
	
public static void main(String[] args) {
        
        System.out.println(checkPalindrome("MADAsdiM"));
        
    }


    
    public static boolean checkPalindrome(String str)
    {
        if(str == null)
        return false;
        
        String rev ="";
        
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        
        if(str.equals(rev))
        {
            return true;
        }
        else 
            return false;
        
    }

}
