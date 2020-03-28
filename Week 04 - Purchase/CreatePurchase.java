import java.util.Scanner;

public class CreatePurchase
{
   public static final int    MIN_INVOICE_NUMBER = 1000;
   public static final int    MAX_INVOICE_NUMBER = 8000;
   public static final double MIN_SALE_AMOUNT    = 0.0;


   public static void main (String[] args)
   {
      /*
      Purchase newCar = new Purchase ();
      newCar.setInvoiceNumber (1000);
      newCar.setSaleAmount    (9999.00);

      System.out.println ("\nNew Car:");
      newCar.display();

      Purchase laptop = new Purchase();
      laptop.setInvoiceNumber (1002);
      laptop.setSaleAmount    (799);

      System.out.println ("\nLaptop:");
      laptop.display();
      */

      Scanner kb = new Scanner (System.in);
      int invoiceNum;
      double saleAmt;
      boolean dataValid = false;

      // Prompt user to enter Invoice Number:
      do
      {
         System.out.println ("Enter Invoice Number (" + MIN_INVOICE_NUMBER +
                             " - " + MAX_INVOICE_NUMBER + "): " );
         invoiceNum = kb.nextInt();

         if ((invoiceNum < MIN_INVOICE_NUMBER)  || (invoiceNum > MAX_INVOICE_NUMBER) )
         {
            System.out.println ("Error: Invoice Number must be a whole number " +
                                "in the range: " + MIN_INVOICE_NUMBER +
                                " - " + MAX_INVOICE_NUMBER + ".");
         }
         else
         {
            dataValid = true;
         }

      } while (dataValid == false);


      // Prompt user to enter Sale Amount:
      dataValid = false;
      do
      {
         System.out.println ("Enter Sale Amount ($" + MIN_SALE_AMOUNT +
                             " or greater): " );
         saleAmt = kb.nextDouble();

         if (saleAmt < MIN_SALE_AMOUNT)
         {
            System.out.println ("Error: Sale Amount must be " +
                                MIN_SALE_AMOUNT + " or greater.");
         }
         else
         {
            dataValid = true;
         }

      } while (dataValid == false);

      // Create a Purchase:
      Purchase purch = new Purchase();
      purch.setInvoiceNumber (invoiceNum);
      purch.setSaleAmount    (saleAmt);

      // Display the Purchase to the user:
      purch.display();
   }
}