package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepository bookrepository;

	
	public Book saveBook(Book book) {
		
		return bookrepository.save(book);
	}
	
	
	public Book getBook(String bookId) {
		Optional<Book> optional=bookrepository.findById(bookId);
		Book book =optional.get();
		return book;
		
	}
	
	public Book updateBook(Book book,String bookId) {
		book.setBookId(bookId);
		return bookrepository.save(book);
		
		
	}
	
	public void deletebook(String bookId) {
		bookrepository.deleteById(bookId);
		
	}
	
	public List<Book> getAllBook(){
		
		return bookrepository.findAll();
		
	}
	
}
		
	
	


