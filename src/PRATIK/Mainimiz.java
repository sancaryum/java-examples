package PRATIK;

import java.util.Scanner;

public class Mainimiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Work operation = new Work();
		int x = 0;
		
		
		
		
			System.out.println("Welcome to LibrarySystem");
			System.out.println("1-Add book");
			System.out.println("2-Borrow book");
			System.out.print("Choose operation number what you want: ");
			x = scan.nextInt();
		
	
		if(x==1)
		{
			operation.addBook();
			
		}
		
		
		else if(x==2)
		{
			operation.borrowBook();
		}
		
		
		
		else
		{
			System.out.println("Invalid Action!");
		}
		
		}
	
	}
	



	
	
	
	
	
	

