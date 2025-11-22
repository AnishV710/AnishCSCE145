
/**
* Anish Verma
*/
import java.util.Scanner;

public class ChooseYourOwnAdventure 
{
	public static void main(String[] args)
    {
        // Introduction to Java High School and 3 choices
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Java High School!");
        System.out.println("It's lunch time. Will you sit with the nerds, athletes, or alone?");
        String decision1 = keyboard.nextLine();
        // Condition for the case where user chooses to sit with nerds
        if(decision1.equalsIgnoreCase("nerds"))
        {
            System.out.println("You sit down and see one of the nerds about to say something to you. \"Hi! Do you want to join Robotics Club? Yes or No?\" he says.");
            String nd1 = keyboard.nextLine();
            if(nd1.equalsIgnoreCase("yes"))
            {
                System.out.println("You work on a robot, but it malfunctions during the competition.");
                System.out.println("To fix it quickly, you must guess the correct number between 1 and 3.");
                int nd2 = keyboard.nextInt();
                int correctNum = (int)(Math.random() * 3) + 1;
                if(nd2 == correctNum)
                {
                    System.out.println("You won the robotics competition! You are a champion! THE END.");
                }
                else
                {
                    System.out.println("The robot exploded in front of everyone! You lost. THE END.");
                } 
            }
            else
            {
                System.out.println("You do not go to the club.");
                System.out.println("Oh No! Bullies are coming up to you! Do you fight or run?");
                String nd3 = keyboard.nextLine();
                if(nd3.equalsIgnoreCase("fight"))
                {
                    System.out.println("The bullies respect you. They dont mess with you anymore. THE END.");
                }
                else if(nd3.equalsIgnoreCase("run"))
                {
                    System.out.println("The bullies chase you! You get a swirly and lose your lunch money. THE END.");
                }
            } 
        }
        // Condition for the case where user chooses to sit with athletes
        else if(decision1.equalsIgnoreCase("athletes"))
        {
            System.out.println("You sit down and see one of the basketball players about to say something to you. \"Hi! Do you want to try out for the Basetball Team? Yes or No?\" he says.");
            String ad1 = keyboard.nextLine();
            if(ad1.equalsIgnoreCase("yes"))
            {
                System.out.println("The coach is testing your skills at try-outs.");
                System.out.println("\"How tall are you (in inches)?\" he ask.");
                int height = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("\"What is your vertical (in inches)?\" he ask.");
                int vert = keyboard.nextInt();
                keyboard.nextLine();
                // Compound boolean expression for conditions to make Basketball Team under "sit with athletes" choice
                if(height >= 72 && vert >= 25)
                {
                    System.out.println("You make the team and become a varisty star. You win the State Championship! THE END.");
                }
                else
                {
                    System.out.println("You get cut in the first week of try-outs. You were terrible. THE END.");
                } 
            }
            else if(ad1.equalsIgnoreCase("no"))
            {
                System.out.println("\"Fine, but you’ve got to help us with a prank to steal the mascot costume from our rival's Python HighSchool tonight.\" one athlete says.");

                 System.out.println("The prank goes well. You take the costume and everyone as school loves you. THE END.");
            }
        }
        // Condition for the case where user chooses to sit alone
        else if(decision1.equalsIgnoreCase("alone"))
        {
            System.out.println("You sit alone. A mysterious teacher comes and sits across from you.");
            System.out.println("\"You want to know the truth about this school? Yes or no?\" he says.");
            String aloned1 = keyboard.nextLine();
            if(aloned1.equalsIgnoreCase("yes"))
            {
                System.out.println("\"Follow me.\" he says. He takes you an underground lab below the school.");
                System.out.println("You discover the teachers are aliens!");
                System.out.println("Do you want expose or join them? (type expose or join)");
                String aloned2 = keyboard.nextLine();
                if(aloned2.equalsIgnoreCase("expose"))
                {
                    System.out.println("You save the school! You are awarded by the FBI! THE END.");
                }
                else if(aloned2.equalsIgnoreCase("join"))
                {
                    System.out.println("You become an alien spy! You gather intel on students and report to the teachers. THE END.");
                }
            }
            else if(aloned1.equalsIgnoreCase("no"))
            {
                System.out.println("You ignore them and keep scrolling on your phone.");
                System.out.println("You go through highschool normally and become a Software Engineer. THE END.");
            }
        } 
    }
}
