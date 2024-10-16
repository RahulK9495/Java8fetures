package java8practise;

import java.util.Arrays;
import java.util.List;

public class prefixProgramm {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("floor","flight","fly","flootan");
		
		String[] sample = {"floor","floight","floy","flootan"};
		
		System.out.println(longestPrfeixinString(sample));
		
	}
	
	public static String longestPrfeixinString(String[] sample)
	{
		Arrays.sort(sample);
		
		String str1 = sample[0];
		String str2 = sample[sample.length-1];
		
		int idx = 0;
		
		while(idx < str1.length() && idx <str2.length())
		{
			if(str1.charAt(idx)==str2.charAt(idx))
			{
				idx++;
			}
			else
			{
				break;
			}
		}
		return str1.substring(0,idx);
		
	}

}
