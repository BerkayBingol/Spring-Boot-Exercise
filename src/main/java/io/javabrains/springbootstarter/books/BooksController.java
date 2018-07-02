package io.javabrains.springbootstarter.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	
	@Autowired
	private BooksService BooksService;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks()
	{
		return BooksService.getAllBooks();
	}
	
	
}
