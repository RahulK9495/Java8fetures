package com.prowings.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> consume = s -> System.out.println(s);
		consume.accept("Rahul");
		
		Consumer <List<Integer>> consumer1 = li -> {
			for (Integer i : li)
			{
				System.out.println(i+100);
			}
		};
		
		consumer1.accept(Arrays.asList(1,2,3,4,5));
		
		Supplier<Integer> supplier = () -> 100;
	}
}
