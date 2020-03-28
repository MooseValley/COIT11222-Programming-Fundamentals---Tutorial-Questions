/*
Author: Mike OMalley
Source: Purchase.java

Java - Basic Console App - Week 04
14. a. Create a class named Purchase. Each Purchase contains an invoice number,
amount of sale, and amount of sales tax. Include set methods for the invoice
number and sale amount. Within the set() method for the sale amount,
calculate the sales tax as 5% of the sale amount. Also include a display method
that displays a purchase’s details. Save the file as Purchase.java.

b. Create an application that declares a Purchase object and prompts the user for
purchase details. When you prompt for an invoice number, do not let the user
proceed until a number between 1,000 and 8,000 has been entered. When you
prompt for a sale amount, do not proceed until the user has entered a
nonnegative value. After a valid Purchase object has been created, display
the object’s invoice number, sale amount, and sales tax. Save the file as
CreatePurchase.java.
*/

public class Purchase
{
   public static final double SALES_TAX   = 5.0 / 100.0;

   private int    invoiceNumber;
   private double saleAmount;
   private double salesTax;

   public Purchase ()
   {
      invoiceNumber = 0;
      saleAmount    = 0.0;
      salesTax      = 0.0;
   }

   // Setters / Mutators
   public void setInvoiceNumber (int newNumber)
   {
      invoiceNumber = newNumber;
   }

   public void setSaleAmount (double newAmount)
   {
      saleAmount = newAmount;
      salesTax   = saleAmount * SALES_TAX;
   }

   public void display ()
   {
      System.out.println ("invoiceNumber: " + invoiceNumber +
                          ", saleAmount: $" + String.format ("%,.2f", saleAmount) +
                          ", salesTax: $"   + String.format ("%,.2f", salesTax  )  );
   }
}