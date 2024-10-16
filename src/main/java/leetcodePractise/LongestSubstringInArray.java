package leetcodePractise;

import java.util.Arrays;

public class LongestSubstringInArray {
	
	public static void main(String[] args) {
		
		String [] arr = {"flower", "fly","flight", "flame"};
		
		String longestSubstring = getLongestSubstring(arr);
		System.out.println(longestSubstring);
		
	}
	
	public static String getLongestSubstring(String [] arr)
	{
		Arrays.sort(arr);
		
		String str1 = arr[0];
		String str2 = arr[arr.length-1];
		int idx = 0;
		
		while(idx <str1.length() && idx< str2.length())
		{
			if(str1.charAt(idx)==str2.charAt(idx))
			{
				idx ++;
			}
			else 
			{
				break;
			}
		}
		return str1.substring(0,idx);
	}

}
