package deneme;

import java.util.Scanner;

public class NumberEstimation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = 20;
		int input = 0;
		
		


		boolean resumeGame = false;
		
		do 
		{
			
			//General logic of the game 
			System.out.print("Input one number: ");
			input=scan.nextInt();
			
			if (input>answer)
			{
				System.out.println("Decrease number!");
			}
			
			else if (input<answer)
			{
				System.out.println("Increase number!");
			}
			
			else if(input==answer)
			{
				System.out.println("Congratulations! ");
				resumeGame = false;
			}
		}while(resumeGame);
		
		
		
		/*while(resumeGame)
		{
			//General logic of the game 
			System.out.print("Input one number: ");
			input=scan.nextInt();
			
			if (input>answer)
			{
				System.out.println("Decrease number!");
			}
			
			else if (input<answer)
			{
				System.out.println("Increase number!");
			}
			
			else if(input==answer)
			{
				System.out.println("Congratulations! ");
				resumeGame = false;
			}
		}*/


		
		

		
		
		
		
	}
	
}
