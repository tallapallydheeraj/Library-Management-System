package com.library;

public class Books {
	private String bookTitle;
	private String bookAuthor;
	private String bookGenre;
	private int bookEdition;
	private int bookPrice;
	
	public Books(String bookTitle, String bookAuthor, String bookGenre, int bookEdition, int bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.bookEdition = bookEdition;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString()
	{
		return "book[BookTitle=" + bookTitle +",BookAuthor="+bookAuthor+",BookGenre="+bookGenre+",Book Edition="+bookEdition+",Bokkprice="+bookPrice+"]";
	}
	@Override
	public boolean equals(Object o)
	{
		Books givenBook=(Books)o;
		return this.bookPrice==givenBook.bookPrice;
		//return this.bookEdition==givenBook.bookEdition;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle=bookTitle;
	}
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor=bookAuthor;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
	    this.bookGenre=bookGenre;
	}
	public int getBookEdition() {
		return bookEdition;
	}
	public void setBookEdition(int bookEdition) {
		this.bookEdition=bookEdition;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice)
	{
		this.bookPrice=bookPrice;
	}
	
	

}
