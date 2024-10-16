package leetcodePractise;

public class PalindromeString {
	
	public static boolean isPalindrome(String str)
	{
		String rev="";
		String org = str;
		
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equals(org))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("rahuluhar"));
	}

}
