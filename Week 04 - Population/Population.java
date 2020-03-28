/*
Author: Mike OMalley
Source: Population.java

Java - Basic Console App - Week 04
12. Assume that the population of Mexico is 121 million and that the population
increases 1.01 percent annually. Assume that the population of the United States is
315 million and that the population is reduced 0.15 percent annually. Write an
application that displays the populations for the two countries every year until the
population of Mexico exceeds that of the United States, and display the number of
years it took. Save the file as Population.java.
*/

public class Population
{
   public static final double MEXICO_START_POPULATION  = 121; // Millions
   public static final double USA_START_POPULATION     = 315;
   public static final double MEXICO_POP_ANNUAL_CHANGE = 1.01  / 100.0;
   public static final double USA_POP_ANNUAL_CHANGE    = -0.15 / 100.0;


   public static void main (String[] args)
   {
      double popMexico = MEXICO_START_POPULATION;
      double popUSA    = USA_START_POPULATION;
      int    yearCount = 0;

      while (popMexico < popUSA)
      {
         popMexico = popMexico + popMexico * MEXICO_POP_ANNUAL_CHANGE;
         popUSA    = popUSA    + popUSA    * USA_POP_ANNUAL_CHANGE;

         yearCount++;

         System.out.println ("Year: "   + String.format ("%2d",  yearCount) + "\t" +
                             "Mexico: " + String.format ("%.2f", popMexico) + "\t  " +
                             "USA: "    + String.format ("%.2f", popUSA   )  );

      }

      System.out.println ("It took " + yearCount + " years.");
   }
}
