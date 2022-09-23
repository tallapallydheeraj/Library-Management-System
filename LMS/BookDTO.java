package com.library;
import java.util.ArrayList;

public class BookDTO {

private static ArrayList<Books>	 bookList=new ArrayList<Books>();

 public BookDAO bookDAO()
 {
	return new BookDAOImp(); 
 }
 private class BookDAOImp implements BookDAO
 {
	 @Override
	 public void addBook(Books book)
	 {
		 bookList.add(book);
		 System.out.println(bookList);
	 }
	 @Override
	 public ArrayList<Books> searchBookByTitle(String bookTitle)
	 {
		 ArrayList<Books> b = new ArrayList<Books>();
			System.out.println(bookTitle);
			for(int i=0;i<bookList.size();i++)
			{
				if(bookList.get(i).getBookTitle().equals(bookTitle))
				{
					b.add(bookList.get(i));
				}
			}
			System.out.println(b);
			return b;
	 }
	 @Override
	 public ArrayList<Books> searchBookByAuthor(String bookAuthor)
	 {
		 ArrayList<Books> b = new ArrayList<Books>();
			for(int i=0;i<bookList.size();i++)
			{
				if(bookList.get(i).getBookAuthor().equals(bookAuthor))
				{
					b.add(bookList.get(i));
				}
			}
			System.out.println(b);
			return b;
		}
	 @Override
	 public Books search(String bookTitle,String bookAuthor,int bookEdition)
	 {
		 ArrayList<Books> b = new ArrayList<Books>();
			b = bookList;
			int index =-1;
			for(int i=0;i<b.size();i++)
			{
				if(b.get(i).getBookTitle().equals(bookTitle) && b.get(i).getBookAuthor().equals(bookAuthor)// && b.get(i).getBookGenre().equals(bookGenre)
						&& bookList.get(i).getBookEdition()==bookEdition)// && bookList.get(i).getBookPrice()==bookPrice)
				{
					index =i;
				}
				else
				{
					index = -1;
				}
			}
			System.out.println(index);
			if(index >=0)
				return b.get(index);
			else
				return null;
		}
	 
	 @Override
	 public boolean updateBook(Books book)
	{
		 
		 
		 
	return false;
	}
	 @Override
	 public boolean removeBook(Books book) {
		 return false;
	 }
 }
}
