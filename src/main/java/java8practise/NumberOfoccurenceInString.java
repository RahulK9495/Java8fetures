package java8practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfoccurenceInString {
	
	public static void main(String[] args) {
		
		String str = "welcome to code decode and code decode welcome to you";
		
		List<String> list= Arrays.asList(str.split(" "));
		
		Map<String, Long>  map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
	}

}
