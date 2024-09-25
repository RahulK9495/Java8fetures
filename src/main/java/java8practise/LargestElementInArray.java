package java8practise;

import java.util.Arrays;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		
		int array[] = {2,5,6,3,5,4};
		
		int max = Arrays.stream(array).max().getAsInt();

		System.out.println(max);
	}

}
