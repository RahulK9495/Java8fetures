package com.techine.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
//		Consumer<Integer> con =i -> System.out.println(i);
//		con.accept(10);
		
		List<Integer> ls = Arrays.asList(2,3,4,5,6,7,8);
		
		ls.stream().forEach(i -> System.out.println(i));
		
		Predicate<Integer> pr = (i)-> i%2==0;
		System.out.println(pr.test(10));
		
		ls.stream().filter(pr).forEach(i -> System.out.println("Even num "+i));
		
		Supplier<String> sp = () -> "This is supplier";
		System.out.println(sp.get());
		
		Function<Integer,Integer> fr = a -> a*a;
		fr.apply(10);

		
	}

}
