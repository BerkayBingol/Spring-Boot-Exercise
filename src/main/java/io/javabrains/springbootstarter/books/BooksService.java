package io.javabrains.springbootstarter.books;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;



@Service
public class BooksService {

	
	//non-mutable array list
	List<Book> books = new ArrayList<> (Arrays.asList(
			new Book(1, "Kitap 1 ","Description 1"),
			new Book(2, "Kitap 2 ","Description 2 "),
			new Book(3, "Kitap 3","Description 3")
			));

	public List<Book> getAllBooks() {
		return books;
	}
				
	
		
}
