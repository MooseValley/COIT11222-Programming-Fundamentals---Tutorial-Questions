/*
Author: Mike OMalley
Source: PastPresentFuture.java

Java - Basic Console App - Week 3
5. a. Write an application that prompts a user for a month, day, and year. Display a
message that specifies whether the entered date is (1) not this year, (2) in an earlier month this year, (3) in a later month this year, or (4) this month. Save the file as PastPresentFuture.java.
b. Use the Web to learn how to use the LocalDate Boolean methods isBefore(),
isAfter(), and equals(). Use your knowledge to write a program that prompts a
user for a month, day, and year, and then displays a message specifying whether
the entered day is in the past,
*/
import java.util.Scanner;
//import java.util.Date;
import java.time.LocalDate;


public class PastPresentFuture
{
   public static void main (String[] args)
   {
      int day, month, year;
      Scanner kb = new Scanner (System.in);

      // Get the current system date:
      /*
      Date date = new Date();
      int currDay   = date.getDate();
      int currMonth = date.getMonth() + 1;    // Get month: 1-12
      int currYear  = date.getYear()  + 1900; // Get actual year
      */
      LocalDate currDate = LocalDate.now();
      //int currDay   = currDate.getDayOfMonth ();
      //int currMonth = currDate.getMonthValue (); // 1-12
      //int currYear  = currDate.getYear();

      // Get a date from user: day, month, and year
      System.out.println ("Enter day, month, and year (3 integers): ");
      day   = kb.nextInt();
      month = kb.nextInt();
      year  = kb.nextInt();

      LocalDate usersDate = LocalDate.of (year, month, day);



      //System.out.println ("System date: " + currDay + "-" + currMonth + "-" + currYear);
      System.out.println ("User date: " + day + "-" + month + "-" + year);


/*
      // Compare the user's date to the current system date
      // and display a message:
      if (year != currYear)
      {
         System.out.println ("(1) not this year");
      }
      else
      {
         if (month < currMonth)
         {
            System.out.println ("(2) in an earlier month this year");
         }
         else if (month > currMonth)
         {
            System.out.println ("(3) in a later month this year");
         }
         else
         {
            System.out.println ("(4) this month");
         }
      }
*/



      if (usersDate.isBefore (currDate) == true)
         System.out.println ("User's date is BEFORE the current system date.");
      else if (usersDate.isAfter (currDate) == true)
         System.out.println ("User's date is AFTER the current system date.");
      else
         System.out.println ("User's date EQUALS the current system date.");
  }
}