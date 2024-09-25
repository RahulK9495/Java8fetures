package com.prowings.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;



public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String, Integer> findlength = s -> s.length();
		System.out.println(findlength.apply("Rahul"));
		
		Function<String, String> startswithRah = x -> x.substring(0, 3);
		System.out.println(startswithRah.apply("Rahul"));
		
		Function<List<Student>,List<Student>> getallstartswithRah = li -> {
			
			List<Student> list = new ArrayList<>();
			for(Student s :li)
			{
				if(startswithRah.apply(s.getName()).equalsIgnoreCase("rah"))
				{
					list.add(s);
				}
			}
			return list;
		};
		
		
		
		Student s1 = new Student(1, "Rahul");
		Student s2 = new Student(1, "Rahi");
		Student s3 = new Student(1, "Ram");
		Student s4 = new Student(1, "akshay");
		List<Student> Students = Arrays.asList(s1,s2,s3,s4);
		
		List<Student> filteredStd = getallstartswithRah.apply(Students);
		System.out.println(filteredStd);
		
		
		Function<Integer, Integer> function1 = x -> 2 * x;
		Function<Integer, Integer> function2 = x -> x * x * x;
		
		System.out.println(function1.andThen(function2).apply(3)); //216
		System.out.println(function2.andThen(function1).apply(3));  //54
		
		System.out.println(function1.compose(function2).apply(3));  //54
		
		
		Function<String,String> f1 = Function.identity();
		System.out.println(f1.apply("Rahul"));
		
		
		
	}
	
}
