package JavaPractise;

public class palindromeString {
	
	
	public static String reverseString(String name)
	{
		String rev ="";
		

		for(int i = name.length()-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
		}
		
		return rev;
		
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("abcdefg"));
		
	}
	
	
}
