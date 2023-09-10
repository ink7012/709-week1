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
    day = "Sunday";
    date = 10;
    month = "September";
    year = 2023;

    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " +         year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " +           year);
  }
}