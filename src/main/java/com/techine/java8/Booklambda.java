package com.techine.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Booklambda {
	
	public static void main(String[] args) {
		
		BookDao dao=new BookDao();
		List<Book> booklist = dao.getListOfBook();
		Collections.sort(booklist, (o2, o1) -> o2.getName().compareTo(o1.getName()));
		System.out.println(booklist);
		
		
	}

}




