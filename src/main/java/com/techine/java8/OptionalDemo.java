package com.techine.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static Customer getCustomerByName(String name) {
		List<Customer> list = CustomerDatabase.getAll();

		return list.stream().filter(Customer -> Customer.getName().equals(name)).findAny()
				.orElseThrow(() -> new IllegalArgumentException("Invalid name"));
	}

	public static void main(String[] args) {

		Customer cs = new Customer(10, null, Arrays.asList("2848648849", "26482478924"));

//		Optional<String> name= Optional.of(cs.getName());
//		System.out.println(name.get());

		Optional.ofNullable(cs);
		System.out.println(cs.getName());
		
		System.out.println(getCustomerByName("Rahul"));

	}

}
