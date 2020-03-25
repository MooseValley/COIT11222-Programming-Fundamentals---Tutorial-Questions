/*
Java - Basic Console App - Week 3
1. Write an application that asks a user to enter an integer. Display a statement that
indicates whether the integer is even or odd. Save the file as EvenOdd.java.
*/
import java.util.Scanner;

public class EvenOdd
{
   public static void main (String[] args)
   {
      int input;
      Scanner kb = new Scanner (System.in);

      // Get integer from user:
      System.out.println ("Enter an integer: ");
      input = kb.nextInt();

      // Display odd or even:
      // Even = evenly divisable by 2.
      int remainder = input % 2;

      if (remainder == 0)
         System.out.println ("The number is EVEN.");
      else
         System.out.println ("The number is ODD.");
   }
}