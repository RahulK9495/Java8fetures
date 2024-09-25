package java8practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		
		List<Integer> oneToTen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List evenNums = oneToTen.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		System.out.println(oneToTen.stream().max(Integer::compareTo).get());
		
		List filNums = oneToTen.stream().filter(x -> x*x*x >50).collect(Collectors.toList());
		System.out.println(filNums );
		
		int arr[] = { 11, 13, 15, 99, 55, 203, 99, 4, 91 };
		
		String s1 = "ilovejava";
		System.out.println(s1.chars().count());
		s1.chars().count();

		List<String >doubleChar = Arrays.stream(s1.split(""))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream()
			.filter(x -> x.getValue()>1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
		System.out.println(doubleChar);
		
		List<String> unique =Arrays.stream(s1.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream()
			.filter(x -> x.getValue()==1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
		System.out.println(unique);
		
		List<String> listS = Arrays.asList("AA", "BB", "ab","AA","abc","ab","Abc","fjjsnf");
		
		List<String> abc =listS.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream()
			.filter(x -> x.getValue()==1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
			System.out.println(abc);
			
			Integer first = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
			System.out.println(first);
			
			String lword = listS.stream().reduce((w1,w2) -> w1.length()>w2.length()?w1:w2).get();
		
			System.out.println(lword);
			
		List<String> startwith1 = Arrays.stream(arr).boxed()
			.map(s -> s +"")
			.filter(s -> s.startsWith("1"))
			.collect(Collectors.toList());
		System.out.println(startwith1);
		
	}
}
