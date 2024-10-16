package java8.techi.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1, "Ram", "QA", 10000));
		list.add(new Employee(2, "Rahul", "DEV", 40000));
		list.add(new Employee(3, "Varad", "QA", 60000));
		list.add(new Employee(4, "Om", "QA", 70000));
		list.add(new Employee(5, "Akshay", "DEV", 80000));
		list.add(new Employee(6, "Raj", "QA", 90000));
		
		Map<Employee, Long> collect1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect1);
		
		Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(x -> x.getDep()));
		System.out.println(collect2);
		
		Optional<Employee> collect3 = list.stream().sorted((s1,s2) -> s2.getSalary()-s1.getSalary()).findFirst();
		System.out.println(collect3);
		
		String str ="abcad";
		
		String long1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue()>1).map(x -> x.getKey()).findFirst().get();
		System.out.println(long1);
		
	}

}
