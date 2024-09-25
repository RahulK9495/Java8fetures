package java8practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(10,12,34,45,80,10,23,34,23,35,78,78,78,59);
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8);
		Set<Integer> duplicates = new HashSet<Integer>();
		
		list.stream().filter(x -> !duplicates.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.print(x));
		System.out.println();
		
		list.stream().map(x -> x*x).collect(Collectors.toList()).forEach(x-> System.out.print(x +","));
		
		Double avg = list1.stream().map(x-> x*x).filter(x -> x<100).mapToInt(x->x).average().getAsDouble();
		System.out.println(  avg);
	
	}

}
