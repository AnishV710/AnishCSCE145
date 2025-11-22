/**
 * Anish Verma
 */

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		boolean playAgain = true;
		
		// Loop continues until the player says "No"
		while(playAgain)
		{
			
			// Reset scores at the start of each game
			int computerWinCount = 0;
			int userWinCount = 0;		
			
			System.out.println("Welcome to Rock Paper Scissors!  Best 2 out of 3!");
			
			// Play exactly 3 rounds
			for(int i = 0; i < 3; i++)
			{
				
				// Ask the user for their choice
				System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
				String userChoice = keyboard.nextLine();
				int computerNumChoice = random.nextInt(3);
				String computerChoice = "";
				
				// Generate computer's random choice
				if(computerNumChoice == 0)
				{
					computerChoice = "Rock";
				}
				else if(computerNumChoice == 1)
				{
					computerChoice = "Paper";
				}
				else if(computerNumChoice == 2)
				{
					computerChoice = "Scissors";
				}
				
				// Compare both choices and update scores
				if(userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Paper"))
				{
					System.out.println("Rock v Paper! Computer Wins!");
					computerWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Rock v Scissors! Player Wins!");
					userWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Rock"))
				{
					System.out.println("Rock v Rock! Tie!");
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
				{
					System.out.println("Paper v Rock! Player Wins!");
					userWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Paper v Scissors! Computer Wins!");
					computerWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Paper"))
				{
					System.out.println("Paper v Paper! Tie!");
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Rock"))
				{
					System.out.println("Scissors v Rock! Computer Wins!");
					computerWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
				{
					System.out.println("Scissors v Paper! Player Wins!");
					userWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Scissors v Scissors! Tie!");
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
				else if(!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase("Scissors"))
				{
					System.out.println("Not a valid input! Computer wins");
					computerWinCount++;
					System.out.println("Player has won " + userWinCount + " times and the computer has won " + computerWinCount + " times");
				}
			}
			
			// Decide overall winner after 3 rounds
			if(userWinCount > computerWinCount)
			{
				System.out.println("The Player wins!");
			}
			else if(computerWinCount > userWinCount)
			{
				System.out.println("The Computer wins!");
			}
			else if(computerWinCount == userWinCount)
			{
				System.out.println("It's a Tie!");
			}
			
			// Ask if the player wants to play again
			System.out.println("Play again? \"Yes\" or \"No\"");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("no"))
			{
				playAgain = false;
				System.out.println("Goodbye!");
			}
		}
		keyboard.close();
	}
}
