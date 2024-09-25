package com.techine.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {
	
	
	public static List<Customer> getAll()
	{
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(10, "Rahul", Arrays.asList("8007788373","73937939992")));
		list.add(new Customer(20, "Akshay", Arrays.asList("782748","287874419")));
		list.add(new Customer(30, "Gaurav", Arrays.asList("748749","927491749")));
		list.add(new Customer(40, "varad", Arrays.asList("274847874","12748274")));
		list.add(new Customer(50, "Abhi", Arrays.asList("892478491","19749147917")));
		return list;
	}

}
