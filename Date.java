import java.io.*;
import java.util.*;

public class Date
{
  public static void main(String[] args)
  {
   //declaring variables
    String day;
    int date;
    String month;
    int year;

    //initializing variables
    day = "Wednesday";
    date = 26;
    month = "January";
    year = 2023;

    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " +         year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " +           year);
  }
}