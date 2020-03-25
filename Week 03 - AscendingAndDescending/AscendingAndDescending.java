/*
Author: Mike OMalley
Source: AscendingAndDescending.java

Java - Basic Console App - Week 3
2. Write an application that asks a user to enter three integers. Display them in
ascending and descending order. Save the file as AscendingAndDescending.java.
*/
import java.util.Scanner;

public class AscendingAndDescending
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner (System.in);
      int int1    = 0, int2   = 0, int3     = 0;
      int biggest = 0, middle = 0, smallest = 0;

      // Get 3 integers from the user:
      System.out.println ("Enter 3 integers: ");
      int1 = kb.nextInt();
      int2 = kb.nextInt();
      int3 = kb.nextInt();

      // Get the biggest:
      biggest = int1;
      if (int2 > biggest)
         biggest = int2;
      if (int3 > biggest)
         biggest = int3;

      smallest = int1;
      if (int2 < smallest)
         smallest = int2;
      if (int3 < smallest)
         smallest = int3;

      // Middle
      /*
      Skip the edge cases: 4 4 4, 3 3 9

      1 3 5  5 4 3   <-- int2 is middle
      5 1 3  1 5 3   <-- int3 is middle
      3 1 5  3 5 1   <-- int1 is middle
      */
      if ((int1 < int2 && int2 < int3) || (int1 > int2 && int2 > int3) )
         middle = int2;
      else if ((int1 > int3 && int2 < int3) || (int1 < int3 && int2 > int3) )
         middle = int3;
      else if ((int1 > int2 && int1 < int3) || (int1 < int2 && int1 > int3) )
         middle = int1;

      // Display them in ascending order:
      System.out.println ("Ascending: " + smallest + ", " + middle + ", " + biggest);

      // Deisplay them in descending order:
      System.out.println ("Descending: " + biggest + ", " + middle + ", " + smallest);

   }
}