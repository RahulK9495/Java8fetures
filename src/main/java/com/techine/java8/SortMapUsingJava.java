package com.techine.java8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapUsingJava {
	
	public static void main(String[] args) {
		
		Map<Book, Integer> bookmap = new TreeMap<>((o1, o2) -> o1.getId()-o2.getId());
		
		bookmap.put(new Book(10, "Alcmist", 200), 10);
		bookmap.put(new Book(50, "Carver", 300), 20);
		bookmap.put(new Book(67, "Yayati", 100), 30);
		bookmap.put(new Book(23, "tom", 40), 40);
		bookmap.put(new Book(46, "Girl", 800), 50);
		
		System.out.println(bookmap);
		
		bookmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPrice))).forEach(System.out::println);
		System.out.println("*******************************************");
		bookmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getPrice).reversed())).forEach(System.out::println);
	}

}
