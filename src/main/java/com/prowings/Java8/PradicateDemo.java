package com.prowings.Java8;

import java.util.function.Predicate;

public class PradicateDemo {

	public static void main(String[] args) {

		
		Predicate<Integer> p1 = x -> x > 10;
		System.out.println(p1.test(8));
		
		Predicate <String> startsWith = s -> s.toLowerCase().charAt(0) == 'r';
		
		System.out.println(startsWith.test("Rahul"));
		
		Predicate <String> endsWith = e -> e.charAt(e.length()-1) == 'l';
		
		System.out.println(endsWith.test("Rahul"));
		
		Predicate<String> and = startsWith.and(endsWith);
		System.out.println(and.test("Rahul"));
		Predicate<String> or = startsWith.or(endsWith);
		System.out.println(or.test("Vipul"));

		System.out.println(startsWith.negate().test("viraj"));
		
		Predicate <Object> predicate = Predicate.isEqual("Rahul");
		System.out.println(predicate.test("Rahul1"));
	}

}
