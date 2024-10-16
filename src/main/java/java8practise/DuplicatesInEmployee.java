package java8practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new Employee(1, "Rahul"));
		emplist.add(new Employee(2, "AKshay"));
		emplist.add(new Employee(3, "Varda"));
		emplist.add(new Employee(4, "Pooja"));
		emplist.add(new Employee(5, "Om"));
		emplist.add(new Employee(6, "Rahul"));
		
		List<String> names = emplist.stream().map(x -> x.getName()).collect(Collectors.toList());
		
		Set<String> hs = new HashSet<String>();
		
		
		Set<String> dupl = names.stream().filter(name -> !hs.add(name)).collect(Collectors.toSet());
		
		System.out.println(dupl);
	}

}
