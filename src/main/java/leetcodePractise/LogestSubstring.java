package leetcodePractise;

import java.util.HashSet;
import java.util.Set;

public class LogestSubstring {
	
	
	public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet();
        int maxlength =0;
        int left = 0;

        for(int right=0; right<n; right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        System.out.println(set);
        return maxlength;

    }
	
	public static void main(String[] args) {
		
		int lengthOfLongestSubstring = lengthOfLongestSubstring("abcabcbb");
		System.out.println(lengthOfLongestSubstring);
	}

}
