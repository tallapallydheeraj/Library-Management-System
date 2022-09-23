package com.library;
import java.util.ArrayList;

	public interface BookDAO
	{
		
		void addBook(Books book);
		ArrayList<Books> searchBookByTitle(String bookTitle);
		ArrayList<Books> searchBookByAuthor(String bookAuthor);
		Books search(String bookTitle,String bookAuthor,int bookEdition);
		boolean updateBook(Books book);
		boolean removeBook(Books book);
	}


