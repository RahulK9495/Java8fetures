package com.techine.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingJava8 {
	
	public static void main(String[] args) {
		
		List<Book> list= BookDao.getListOfBook();
		
		
		Collections.sort(list, (o1,o2) -> o2.getPrice()-o1.getPrice());
		System.out.println(list);
		
		//list.stream().sorted((o1,o2) -> o1.getPrice()-o2.getPrice()).forEach(System.out::print);
		
		list.stream().sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::print);
	
	}

}
