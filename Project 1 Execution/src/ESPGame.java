/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (The "ESPGame" Java program is a text-based game that assesses a user's ability to guess a randomly selected color out of five options (Red, Green, Blue, Orange, or Yellow) in 10 rounds. 
 * 				The user provides their name, description, and due date for an assignment at the start. 
 * 				The program uses a loop to manage each round, randomly selecting a color for the user to guess. User input is validated to ensure it matches one of the predefined colors. 
 * 				If the guess matches the selected color, it's considered a successful guess, and the score is incremented. 
 * 				After 10 rounds, the game concludes, displaying the user's score and the initial user-provided information, providing a fun and interactive experience to test ESP skills.)
 * Due: 09/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Amanuel Yilma
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{
	public static void main(String[] arg)
	{
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		
		String winningColor = "";
		int successfulGuess = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String userName = keyboard.nextLine();
		
		System.out.print("Describe yourself: ");
		String userDescrip = keyboard.nextLine();
		
		System.out.print("Due Date: ");
		String dueDate = keyboard.nextLine();
		
		System.out.print("CMSC203 Assignment1: Test your ESP skills!\n");
		
		for(int count = 0; count < 10; count++)
		{
			boolean isValidColor = false;
			
			Random random = new Random();
			int randomNumber = random.nextInt(5)+1;
			
			switch(randomNumber)
			{
				case 1:
					winningColor = COLOR_RED;
					break;
				case 2:
					winningColor = COLOR_GREEN;
					break;
				case 3:
					winningColor = COLOR_BLUE;
					break;
				case 4:
					winningColor = COLOR_ORANGE;
					break;
				case 5:
					winningColor = COLOR_YELLOW;
					break;
			}
			
			System.out.printf("Round %d \n\n", count+1);
			System.out.print("I am thinking of a color.\n"
						  +	 "Is it Red, Green, Blue, Orange, or Yellow?\n"
						  +	 "Enter your guess:\n");
			String userGuess = keyboard.nextLine();
			
			while(isValidColor == false)
			{
				if(userGuess.equalsIgnoreCase(COLOR_RED) || userGuess.equalsIgnoreCase(COLOR_GREEN) || userGuess.equalsIgnoreCase(COLOR_BLUE) || userGuess.equalsIgnoreCase(COLOR_ORANGE) || userGuess.equalsIgnoreCase(COLOR_YELLOW))
				{
					isValidColor = true;
					System.out.println("\nI was thinking of "+(winningColor));
					
					if(userGuess.equalsIgnoreCase(winningColor))
						successfulGuess++;	
				}
				else
				{
					System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\n"
									+  "Enter your guess again:");
					String userGuess1 = keyboard.nextLine();
					userGuess = userGuess1;
				}
			}	
		}
		System.out.println("Game Over\n");
		System.out.printf("You guessed %d out of 10 colors correctly.\n",successfulGuess);
		System.out.printf("User Name: %s\n" ,userName);
		System.out.printf("User Description: %s\n" ,userDescrip);
		System.out.printf("Due Date: %s\n" ,dueDate);
	}
}
