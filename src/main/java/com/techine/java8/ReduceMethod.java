package com.techine.java8;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,4,6,3,1,5,7,9);
		
		List<String> ls = Arrays.asList("CoreJava","Hibernate","Spring Data JPA");
		
		
		
		
		int sum = nums.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		int sum1 = nums.stream().reduce(Integer::sum).get();
		System.out.println(sum1);
		
		int mult = nums.stream().reduce(1, (a,b)->a*b);
		System.out.println(mult);
		
		int max = nums.stream().reduce(0, (a,b)->(a>b?a:b));
		System.out.println(max);
		
		int max1 = nums.stream().reduce(Integer::max).get();
		System.out.println(max1);
		
		String longest =ls.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		
		System.out.println(longest);
		
		
		List<Book> booklist = BookDao.getListOfBook();
		
		double avgprice = booklist.stream().filter(Book -> Book.getName().equalsIgnoreCase("Vapurza"))
			.map(Book -> Book.getPrice())
			.mapToInt(i->i)
			.average().getAsDouble();
		
		System.out.println(avgprice);
		
		int sumprice = booklist.stream().filter(Book -> Book.getName().equalsIgnoreCase("Vapurza"))
				.map(Book-> Book.getPrice())
				.mapToInt(i->i)
				.sum();
		System.out.println(sumprice);
		
		
		
	}

}
