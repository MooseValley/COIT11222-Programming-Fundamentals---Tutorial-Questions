/*
Author: Mike OMalley
Source: DiagonalOs.java

Java - Basic Console App - Week 04
7. Write an application that uses a loop to create the pattern of Os
in which each O is displayed one additional space to the right. Save the file as
DiagonalOs.java.
O
 O
  O
   O
    O
     O
*/
public class DiagonalOs
{
   public static void main (String[] args)
   {
      String spacesStr = "";

      for (int line = 0; line < 10; line++)
      {
         System.out.println (spacesStr + "O");

         spacesStr = spacesStr + " ";
      }
   }
}
