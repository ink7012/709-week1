import java.io.*;
import java.util.*;


public class Guess
{
  public static void main(String[] args)
  {
    //intiialized Scanner class and variables
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    int answer = random.nextInt(100) + 1;
    int guess;
    int difference;
    
    //asks user for input
    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\n Type a number: ");

    //assigning guess and difference variable
    guess = in.nextInt();
    difference = Math.abs(guess - answer);


    //Tells user their guess, the answer, and the difference.
    System.out.println("Your guess is: " + guess);
    System.out.println("The number I was thinking of is: " + answer + "\nYou were off by: " + difference);
  }
}



/* EXAMPLE
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
*/


