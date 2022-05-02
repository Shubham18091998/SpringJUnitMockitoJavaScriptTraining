package com.cts.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	private String isbn;
	private String bookName;
	private int price;
	@Autowired
	private Author bookAuthor;
	public Book() {
		super();
		System.out.println(bookAuthor);
	}
	public Book(String isbn, String bookName, int price, Author bookAuthor) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.price = price;
		this.bookAuthor = bookAuthor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(Author bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", price=" + price + ", bookAuthor=" + bookAuthor
				+ "]";
	}
	
}
