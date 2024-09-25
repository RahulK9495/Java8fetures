package com.techine.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookTraditional {
	
	public static void main(String[] args) {
		
		BookDao dao=new BookDao();
		List<Book> booklist = dao.getListOfBook();
		Collections.sort(booklist, new MyComparator());
		System.out.println(booklist);
		
		
	}

}

class MyComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o2, Book o1) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
}