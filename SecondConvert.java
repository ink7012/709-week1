import java.io.*;
import java.util.*;


public class SecondConvert {
    public static void main(String[] args) {

        //intiialzing scanner and variables needed for calculations
        Scanner in = new Scanner(System.in);
        double hours;
        double minutes;
        double userInput;
        double remainingSeconds;


        //asks user for input    
        System.out.println("How many second would you like to convert?");


        //assigns userInput and remainingSeconds
        userInput = in.nextDouble();
        remainingSeconds = userInput;

        //calculation for hours and remainder of seconds after calculation
        hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;

        //calculation for minutes and remainder of seconds after calculation
        minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
      
          
      System.out.printf("%.1f seconds = %.1f hours, %.1f minutes, and %.1f seconds \n",userInput, hours, minutes , remainingSeconds);




    }
}




/*Exercise 3  
Write a program that converts a total number of seconds to hours, minutes, and seconds. 
It should (1) prompt the user for input, (2) read an integer from the keyboard, 
(3) calculate the result, and (4) use printf to display the output. 
For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
*/