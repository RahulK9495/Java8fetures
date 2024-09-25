package com.prowings.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,6,7,8,9,10,122,3,3,45,56,67));
		
		list.stream();
		
		List<Integer> s1= Stream.iterate(0, x -> x+1).limit(100).collect(Collectors.toList());

		List filteredlist = list.stream().filter(x -> x % 2 ==0).distinct().collect(Collectors.toList());
		System.out.println(filteredlist );
	
		List<Integer> modList = list.stream().map(x -> x +2)
				.distinct()
				.sorted((a,b) -> (b-a))
				.limit(7)
				.skip(2)
				.peek(x -> System.out.println(x))
				.collect(Collectors.toList());
		System.out.println(modList);
		
		Integer value = Stream.iterate(0, x -> x + 2).limit(50).map(x -> x /2).max((a,b) -> (a-b)).get();
		System.out.println(value);
	}

}
