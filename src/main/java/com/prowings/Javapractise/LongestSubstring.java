package com.prowings.Javapractise;

import java.util.Arrays;
import java.util.List;

public class LongestSubstring {
	
	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("flower", "fly", "flyover", "flame");
		
		System.out.println(list);
		System.out.println(getLongestSubstring(list));
		
	}
	
	public static String getLongestSubstring(List<String> list)
	{
		list.sort((s1,s2)-> s1.compareTo(s2));
		
		String str1 = list.get(0);
		String str2 = list.get(list.size()-1);
	
		int idx =0;
		
		while(idx<str1.length()&& idx <str2.length())
		{
			if(str1.charAt(idx)==str2.charAt(idx))
			{
				idx++;
			}
			else
				break;
			
		}
		return str1.substring(0,idx);
	}

}
