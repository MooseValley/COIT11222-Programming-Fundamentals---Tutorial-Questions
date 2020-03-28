/*
Author: Mike OMalley
Source: NumbersDemo2.java

Java - Basic Console App - Week 05
4. a. Create an application named NumbersDemo whose main() method holds two
integer variables. Assign values to the variables. In turn, pass each value to
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
displayNumberSquared(). Create each method to perform the task its name
implies. Save the application as NumbersDemo.java.

b. Modify the NumbersDemo class to accept the values of the two integers from a user
at the keyboard. Save the file as NumbersDemo2.java.
*/
import java.util.Scanner;

public class NumbersDemo2
{
   private static void displayTwiceTheNumber(int val)
   {
      System.out.println ("Twice the number is: " + (2 * val) );
   }

   private static void displayNumberPlusFive(int val)
   {
      System.out.println ("Number + 5:          " + (val + 5) );
   }

   private static void displayNumberSquared(int val)
   {
      System.out.println ("Number squared:      " + (val * val) );
   }

   public static void main (String[] args)
   {
      int int1 = 0;
      int int2 = 0;

      Scanner kb = new Scanner (System.in);
      System.out.println ("Enter 2 integers: ");
      int1 = kb.nextInt();
      int2 = kb.nextInt();

      System.out.println ("\n*** Integer #1: " + int1);
      displayTwiceTheNumber (int1);
      displayNumberPlusFive (int1);
      displayNumberSquared  (int1);

      System.out.println ("\n*** Integer #2: " + int2);
      displayTwiceTheNumber (int2);
      displayNumberPlusFive (int2);
      displayNumberSquared  (int2)
   }
}