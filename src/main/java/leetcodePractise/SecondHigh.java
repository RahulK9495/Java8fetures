package leetcodePractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondHigh {
	
	public static void main(String[] args) {
		
		Integer [] sample = {2,3,4,6,7,24,22};
	//	System.out.println(getSecondHigh(sample));
		
		Integer second = Arrays.asList(sample).stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(second);
		
		Integer s2 = Arrays.asList(sample).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(s2);
		
		Integer s3 = Arrays.asList(sample).stream().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(s3);
	}
	
	public static int getSecondHigh(int [] arr)
	{
		int max =0;
		int max2 = max;
		
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max2 = max;
				max = arr[i];
			}
			else if( arr[i]<max && arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		if(max2 == max || max2 ==0)
			return -1;
		return max2;
	}

}
