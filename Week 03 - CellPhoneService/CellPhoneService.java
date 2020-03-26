/*
Author: Mike OMalley
Source: CellPhoneService.java

Java - Basic Console App - Week 3
4. Write a program for Horizon Phones, a provider of cellular phone service. Prompt a
user for maximum monthly values for talk minutes used, text messages sent, and
gigabytes of data used, and then recommend the best plan for the customer’s needs.
A. A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month.
B. A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month.
C-D. A customer who needs 500 or more minutes of talk and no data should accept either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text messages or more at $70 per month.
E-F. A customer who needs any data should accept Plan E for up to 2 gigabytes at $79 or Plan F for 2 gigabytes or more at $87.
Save the file as CellPhoneService.java.
*/
import java.util.Scanner;

public class CellPhoneService
{
   public static void main (String[] args)
   {
      int talkTimeMinutes;   // Per Month
      int textMessagesSent;
      double gigabytesOfData;
      Scanner kb = new Scanner (System.in);

      System.out.println ("Enter talk time (mins) per month: ");
      talkTimeMinutes = kb.nextInt();

      System.out.println ("Enter text messages sent per month: ");
      textMessagesSent = kb.nextInt();

      System.out.println ("Enter gigabytes of data per month: ");
      gigabytesOfData = kb.nextDouble();


      // A. A customer who needs fewer than 500 minutes of talk and no
      // text or data should accept Plan A at $49 per month.
      if ((talkTimeMinutes < 500) && (textMessagesSent == 0) && (gigabytesOfData == 0))
      {
         System.out.println ("Plan A at $49 per month.");
      }

      // B. A customer who needs fewer than 500 minutes of talk and
      // any text messages should accept Plan B at $55 per month.
      else if ((talkTimeMinutes < 500) && (textMessagesSent > 0) &&
               (gigabytesOfData == 0))
      {
         System.out.println ("Plan B at $55 per month.");
      }

      // C-D. A customer who needs 500 or more minutes of talk and
      // no data should accept either Plan C for up to 100 text messages
      // at $61 per month or Plan D for 100 text messages or more at $70 per month.
      else if ((talkTimeMinutes >= 500) && (textMessagesSent < 100) &&
               (gigabytesOfData == 0))
      {
         System.out.println ("Plan C at $61 per month.");
      }

      else if ((talkTimeMinutes >= 500) && (textMessagesSent >= 100) &&
               (gigabytesOfData == 0))
      {
         System.out.println ("Plan D at $70 per month.");
      }

      // E-F. A customer who needs any data should accept Plan E for up to
      // 2 gigabytes at $79 or Plan F for 2 gigabytes or more at $87.
      else if (gigabytesOfData < 2.0)
      {
         System.out.println ("Plan E at $79 per month.");
      }

      else //if (gigabytesOfData >= 2.0)
      {
         System.out.println ("Plan F at $87 per month.");
      }

   }
}