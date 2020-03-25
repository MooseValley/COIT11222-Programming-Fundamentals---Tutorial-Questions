/*
Author: Mike OMalley
Source: QuartsToGallons.java

Java - Basic Console App - Week 2
4. a. Write a Java class that declares a named constant to hold the number of quarts
in a gallon (4). Also declare a variable to represent the number of quarts
needed for a painting job, and assign an appropriate value—for example, 18.
Compute and display the number of gallons and quarts needed for the job.
Display explanatory text with the values—for example, A job that needs 18
quarts requires 4 gallons plus 2 quarts. Save the class as QuartsToGallons.
java.
b. Convert the QuartsToGallons class to an interactive application. Instead of
assigning a value to the number of quarts, accept the value from the user as input.
Save the revised class as QuartsToGallonsInteractive.java.
*/
import java.util.Scanner;

public class QuartsToGallons
{
   public final static int QUARTS_PER_GALLON = 4;

   public static void main (String[] args)
   {
      int numQuarts = 0;
      Scanner kb    = new Scanner (System.in);

      // Get user input for numQuarts:
      System.out.println ("Enter total quarts: " );
      numQuarts = kb.nextInt ();

      // Convert numQuarts to gallons and quarts:
      int gallons = numQuarts / QUARTS_PER_GALLON;
      int quarts  = numQuarts % QUARTS_PER_GALLON;

      // Display the results to the user:
      System.out.println ("A paint job that requires " + numQuarts +
          " quarts, requires " + gallons + " gallons and " + quarts + " quarts.");
   }
}