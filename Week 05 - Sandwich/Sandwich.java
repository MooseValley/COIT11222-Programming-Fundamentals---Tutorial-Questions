/*
Author: Mike OMalley
Source: Sandwich.java

Java - Basic Console App - Week 05
11. a. Create a class named Sandwich. Data fields include a String for the main
ingredient (such as “tuna”), a String for bread type (such as “wheat”), and a
double for price (such as 4.99). Include methods to get and set values for each of
these fields. Save the class as Sandwich.java.

b. Create an application named TestSandwich that instantiates one Sandwich object
and demonstrates the use of the set and get methods. Save this application as
TestSandwich.java.
*/

public class Sandwich
{
   private String mainIngredient;
   private String breadType;
   private double price;

   // Default Constructor:
   public Sandwich()
   {
      mainIngredient = "";
      breadType      = "";
      price          = 0.0;
   }

   // Getters / Accessors:

   public String getMainIngredient ()
   {
      return mainIngredient;
   }

   public String getBreadType ()
   {
      return breadType;
   }
   public double getPrice ()
   {
      return price;
   }


   // Setters / Mutators:

   public void setMainIngredient (String newMainIngredient)
   {
      mainIngredient = newMainIngredient;
   }

   public void setBreadType (String newBreadType)
   {
      breadType = newBreadType;
   }

   public void setPrice (double newPrice)
   {
      price = newPrice;
   }
}