package com.library;

import java.io.Serializable;
import java.util.Scanner;
public class Librarian extends Thread implements Serializable {
	
	private Scanner scan= new Scanner(System.in);
	public void access()
	{
		BookDTO bookDTO= new BookDTO();
		BookDAO bookAccessObject =bookDTO.bookDAO();
		
		System.out.println("Press 1 to add a book.....  ");
		System.out.println("Press 2 to search book....  ");
		System.out.println("Press 3 to search  book using author name....  ");
		System.out.println("Press 4 to search  book using  book title  .....  ");
		System.out.println("Press 5 to update book.....  ");
		System.out.println("Press 6 to remove book.....  ");
		System.out.println("Enter your choice... ");
		int choice = scan.nextInt();
		if(choice==1)
		{
		       System.out.println("...Please Enter Book Details...");
		       System.out.println("Enter book title...");
		       String title =scan.next();
		       System.out.println("Enter the author name...");
		       String author=scan.next();
		       System.out.println("enter genre..");
		       String genre=scan.next();
		       System.out.println("enter the edition...");
		       int edition=scan.nextInt();
		       System.out.println("enter the price..");
		       int price =scan.nextInt();
		       Books book =new Books(title,author,genre,edition,price);
		       bookAccessObject.addBook(book);
		}
		   else if(choice==2)
		   {
			  System.out.println("Which book are you searchimg for today ?  bookTitle");
			  String  bookTitle=scan.next();
			  System.out.println(" enter the bookAuthor");
			  String bookAuthor=scan.next();
			  System.out.println("enter the edition");
			  int  bookEdition=scan.nextInt();
			  System.out.println(bookAccessObject.search(bookTitle, bookAuthor, bookEdition));
		   }
		   else if(choice==3)
		   {
			  System.out.println("enter the author name");
			  String bookAuthorname=scan.next();
			  System.out.println(bookAccessObject.searchBookByAuthor(bookAuthorname));
		   }
		   else if(choice==4)
			   {
			   System.out.println("enter the title");
		        String  bookTitle=scan.next();
		        System.out.println(bookAccessObject.searchBookByTitle(bookTitle));
			   }
		
		
		   else if(choice==5)
		   {
			   System.out.println("to update book");
			   
		   }
		   else if(choice==6)
		   {
			   System.out.println("You Choose to Delete a Book ");
               String empty = scan.next();
		   }
		  
		   else
		   {
			System.out.println("Given choice is invalid .. enter the corect choice");
		   }
		}
		@Override
		public void run()
		{
			System.out.println("Welcome to library Management System...");
			
			do
			{
				access();
				System.out.println("Press 'Y' to continue..");
				System.out.println("Press 'N' to stop...");
			}while(scan.next().charAt(0)=='Y'|| scan.next().charAt(0)=='y');
		System.out.println("thank yoy visit us again...");

	}

}
