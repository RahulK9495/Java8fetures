package java8practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee2Test {
	
	public static void main(String[] args) {
		
		List<Employee2> list = new ArrayList<Employee2>();
		
		list.add(new Employee2("Rahul", 7000000));
		list.add(new Employee2("Akshay",2000000));
		list.add(new Employee2("Rahul", 3000000));
		list.add(new Employee2("VArad", 1000000));
		list.add(new Employee2("Gaurav", 1000000));
		
		List<Integer> intlist = Arrays.asList(2,5,7,4,3,5,5,4,2,7,1,9);
		
		List<Integer> slist = intlist.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(slist);
		
		List<Employee2> sorted = list.stream().sorted((a,b)-> a.getSalary()-b.getSalary()).limit(3).toList();
		System.out.println(sorted);
		
		Set<Integer> hs= new HashSet<>();
		
		Set<Integer> duplicates = intlist.stream().filter(x -> !hs.add(x)).collect(Collectors.toSet());
		System.out.println(duplicates);
		List<Integer> duplicates2 = intlist.stream().filter(x -> !hs.add(x)).collect(Collectors.toList());
		System.out.println(duplicates2);
		
		
		String code = "Welcome to code decode and code decode welcome to you";
		
		List<String> listcode = Arrays.asList(code.split(" "));
		
		List<String> listofunique = listcode.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue()>1).map(x ->x.getKey())
				.collect(Collectors.toList());
				
	
		System.out.println(listofunique);
		
		list.stream().anyMatch(x -> x.getName().contains("Rahul"));
		
		double max = list.stream().map(x -> x.getSalary()).mapToDouble(x -> x).max().getAsDouble();
		System.out.println(max);
	}

}
