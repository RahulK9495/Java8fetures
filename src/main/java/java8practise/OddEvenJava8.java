package java8practise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddEvenJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,1,2,2,3,3,4,5,6,7,7,8,9);
		
		Map<Integer, Long> list1  =list.stream().filter(x -> x%2 != 0).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(list1);
	}

}
