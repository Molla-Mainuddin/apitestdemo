package com.sts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	private List<Book> list = new ArrayList<>();
	
	public BookController() {
		list.add(new Book(1234,"JAVA Complete Reference","Herbert Sildth"));
		list.add(new Book(2345,"Computer Network","Fouruzen"));
		list.add(new Book(7896,"Operating System","Galvin"));
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return list;
	}	
}
