package com.prowings.Java8;

import java.util.Optional;

public class optionalclass {

	
	public static void main(String[] args) {
		
		
		Optional<String> optional1 = doSomething(1);
		
//		if(name.isPresent())
//			System.out.println(name.get());

//		name.ifPresent(x -> System.out.println(x));
	
//		name.ifPresent(System.out::println);
	
		Optional<String> optional2 = optional1.map(x -> ((String) x).toUpperCase());
		optional2.ifPresent(System.out::println);
		
	}
	
	public static Optional<String> doSomething(int id)
	{
//		return Optional.ofNullable(null);
	
		return Optional.of("shyam");
	}
}
