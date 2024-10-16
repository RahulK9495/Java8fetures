package leetcodePractise;

public class PalindromeInteger {
	
	public static boolean isPalindrome(int x) {
        int rev = 0;
        int sample= x;
        while(sample>0)
        {
            rev = rev*10 + sample%10;
            sample=sample/10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(1212121));
		
	}

}
