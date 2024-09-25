package java8.techi.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stringDistinctchars {

	public static void main(String[] args) {
		
		String input = "ilovemyindia";
		
		Map<String, Long> map = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		List<String> duplicates = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(duplicates);
		
		List<String> unique = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(unique);
		
		String firstuniquechar = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1)
		.findFirst().get().getKey();

		System.out.println(firstuniquechar);
		
	}
}
