/*
Author: Mike OMalley
Source: BarChart.java

Java - Basic Console App - Week 04
13. The Huntington High School basketball team has five players named
Moose, Frankie, Bella, Teenie, and Sam. Accept the number of points scored
by each player in a game and create a bar chart that illustrates the
points scored.
Save the file as BarChart.java.

------------------------------------------------------------
Enter points scored by Moose:    3
Enter points scored by Frankie:  12
Enter points scored by Bella:    8
Enter points scored by Teenie:   6
Enter points scored by Sam:      15

Points Bar Graph:
Moose    ***
Frankie  ************
Bella    ********
Teenie   ******
Sam      ***************
------------------------------------------------------------
*/
import java.util.Scanner;

public class BarChart
{
   private static void printBarForPlayer (String name, int pointsScored)
   {
      System.out.print (name + "   ");
      for (int points = 0; points < pointsScored; points++)
      {
         System.out.print ("*");
      }
      System.out.println ();
   }

   public static void main (String[] args)
   {
      Scanner kb = new Scanner (System.in);

      System.out.print ("Enter points scored by Moose: ");
      int moosePoints = kb.nextInt();

      System.out.print ("Enter points scored by Frankie: ");
      int frankiePoints = kb.nextInt();

      System.out.print ("Enter points scored by Bella: ");
      int bellaPoints = kb.nextInt();

      System.out.print ("Enter points scored by Teenie: ");
      int teeniePoints = kb.nextInt();

      System.out.print ("Enter points scored by Sam: ");
      int samPoints = kb.nextInt();


      System.out.println ("\n" + "Points Bar Graph:");

      /*
      System.out.print ("Moose   ");
      for (int points = 0; points < moosePoints; points++)
      {
         System.out.print ("*");
      }
      System.out.println ();

      System.out.print ("Frankie ");
      for (int points = 0; points < frankiePoints; points++)
      {
         System.out.print ("*");
      }
      System.out.println ();
      */

      printBarForPlayer ("Moose    ", moosePoints);
      printBarForPlayer ("Frankie  ", frankiePoints);
      printBarForPlayer ("Bella    ", bellaPoints);
      printBarForPlayer ("Teenie   ", teeniePoints);
      printBarForPlayer ("Sam      ", samPoints);


   }
}