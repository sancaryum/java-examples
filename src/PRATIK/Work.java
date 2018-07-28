package PRATIK;

import java.util.Scanner;

public class Work {
	
	//CONSTRUCTOR
	
	
	public Work()
	{
		
	}
	
	// ARRAY
	String[] bookshelf = new String[1000];
	
	
	
	//METHODS
	public void addBook()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter shelf number which you want to add book: " );
		int a = scan.nextInt();
		
		
		if (bookshelf[a-1]==null)
		{
			System.out.print("Enter book's name which you want to add: ");
			bookshelf[a-1] = scan.nextLine();
			
			
			System.out.println(bookshelf[a-1] + " added to shelf " + a + " successfully");
		}
		
		else
		{
			System.out.println("This shelf full already");
		}
	}
	
	public void borrowBook()
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter book's shelf number which you want: ");
		int c = scan.nextInt();
		
		if(bookshelf[c-1]!=null)
		{
			System.out.println(bookshelf[c-1] + " has given");
			bookshelf[c-1]=null;
		}
		
		else 
		{
			System.out.println("There isn't any book in this shelf number!");
		}
		
		
	}
	
	
	
	}


