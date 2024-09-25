package com.techine.java8;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public static List<Book> getListOfBook()
	{
		List<Book> listbook = new ArrayList<Book>();
		listbook.add(new Book(1, "Vapurza", 200));
		listbook.add(new Book(8, "Vapurza", 900));
		listbook.add(new Book(9, "Vapurza", 800));
		listbook.add(new Book(2, "My life", 200));
		listbook.add(new Book(3, "Yayati", 600));
		listbook.add(new Book(4, "Hitler", 300));
		listbook.add(new Book(5, "Mybook", 500));
		
		return listbook;
	}

}
