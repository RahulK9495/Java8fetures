package JavaPractise;

public class revInteger {
	
	public static void main(String[] args) {
		
		
		System.out.println(reverserString(23456));
	}

	public static int reverserString( int num)
	{
		int rev = 0;

		
		while(num > 0)
		{
			rev = rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
}
