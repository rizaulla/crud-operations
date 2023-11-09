package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/savebook")
	public Book saveBook(@RequestBody Book book)
	{
		return bookservice.saveBook(book);
	}
	
	@GetMapping("/getbooks/{bookId}")
	public Book getBook(@PathVariable  String  bookId) {
		return bookservice.getBook(bookId);
		
	}
	
	@PutMapping("/updatebook/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable String bookId) {
		return bookservice.updateBook(book, bookId);
	}
	
	@DeleteMapping("/deletebook/{bookId}")
	public String deleteBook(@PathVariable String bookId) {
		bookservice.deletebook(bookId);
		return "deleted successfully";
		
	} 
	
	@GetMapping("/getallbook")
	public List<Book> getallBook(){
		return bookservice.getAllBook();
		
	}
	
	
	
	



	
}
