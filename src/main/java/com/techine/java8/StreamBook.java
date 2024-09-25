package com.techine.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBook {
	
	public static void main(String[] args) {
		

		System.out.println(getListOfBookByprice(100));
	}

	public static List<Book> getListOfBookByprice(int price)
	
	{
		return BookDao.getListOfBook().stream().filter(bk->bk.getPrice()>price).collect(Collectors.toList());
	}
}
