package com.techine.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {
	
	public static List<Employee> getallEmployee()
	{
		List<Employee> employees = new ArrayList<Employee>();
		for(int i=0; i<1000; i++)
		{
			employees.add(new Employee(i, "employee"+i,	Double.valueOf(new Random().nextInt(1000*100))));
		}
		
		return employees;
	}

}
