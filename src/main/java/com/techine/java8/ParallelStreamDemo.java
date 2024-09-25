package com.techine.java8;

import java.util.List;

public class ParallelStreamDemo {
	
	public static void main(String[] args) {
		
		long start=0;
		long end =0;
		
		
		List<Employee> employees = EmployeeDatabase.getallEmployee();
		
		start = System.currentTimeMillis();
		double avgsalary = employees.stream().map(Employee -> Employee.getSalaray())
			.mapToDouble(i->i)
			.average().getAsDouble();
		end= System.currentTimeMillis();
		System.out.println("Total time reuired for stream : "+(end-start)+"  average salary "+ avgsalary );
		
		start = System.currentTimeMillis();
		double avgsalaryByParallel =employees.parallelStream().map(Employee -> Employee.getSalaray())
			.mapToDouble(i->i)
			.average().getAsDouble();
		end= System.currentTimeMillis();
		System.out.println("Total time reuired for parallel stream : "+(end-start)+"  average salary "+ avgsalaryByParallel);
		
		
	
	}

}
