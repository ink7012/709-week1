import java.io.*;
import java.util.*;


public class SecondConvert {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        int userInput;

        System.out.println("How many second would you like to convert?");

        userInput = in.nextInt();

        hours = userInput / 3600;
        
        System.out.println(hours);
    }
}






/*Exercise 3  
Write a program that converts a total number of seconds to hours, minutes, and seconds. 
It should (1) prompt the user for input, (2) read an integer from the keyboard, 
(3) calculate the result, and (4) use printf to display the output. 
For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".
*/