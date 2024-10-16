package leetcodePractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermidiateNumbersInArray {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,4,5,6,7);
		List<Integer> list2 = Arrays.asList(4,5,6,7);
		
		
		List<Integer> intermidiateValues = intermidiateValues(list1, list2);
		System.out.println(intermidiateValues);
	}
	
	public static List<Integer> intermidiateValues(List<Integer> list1, List<Integer> list2 )
	{
		
		return list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toList());
	}

}
