package com.techine.java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {
	
	public static void main(String[] args) {
		
		List<Customer> clist = CustomerDatabase.getAll();
		
		List<String> names = clist.stream().map(Customer -> Customer.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		List<List<String>> numbers = clist.stream().map(Customer -> Customer.getMobilenumber()).collect(Collectors.toList());
		System.out.println(numbers);
		
		List<String> nums= clist.stream().flatMap(Customer -> Customer.getMobilenumber().stream()).collect(Collectors.toList());
		System.out.println(nums);
	}

}
