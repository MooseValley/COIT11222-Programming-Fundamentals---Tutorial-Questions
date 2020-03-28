/*
Author: Mike OMalley
Source: NumbersDemo.java

Java - Basic Console App - Week 05
4. a. Create an application named NumbersDemo whose main() method holds two
integer variables. Assign values to the variables. In turn, pass each value to
methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
displayNumberSquared(). Create each method to perform the task its name
implies. Save the application as NumbersDemo.java.

b. Modify the NumbersDemo class to accept the values of the two integers from a user
at the keyboard. Save the file as NumbersDemo2.java.
*/
public class NumbersDemo
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
      int int1 = 15;
      int int2 = 6;

      System.out.println ("\n*** Integer #1: " + int1);
      displayTwiceTheNumber (int1);
      displayNumberPlusFive (int1);
      displayNumberSquared  (int1);

      System.out.println ("\n*** Integer #2: " + int2);
      displayTwiceTheNumber (int2);
      displayNumberPlusFive (int2);
      displayNumberSquared  (int2);

   }
}