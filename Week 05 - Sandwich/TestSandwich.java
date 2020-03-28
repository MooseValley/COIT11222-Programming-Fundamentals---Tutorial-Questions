public class TestSandwich
{
   public static void main (String[] args)
   {
      Sandwich mikesLunch = new Sandwich ();

      mikesLunch.setMainIngredient ("Chicken");
      mikesLunch.setBreadType      ("Multigrain bread");
      mikesLunch.setPrice          (3.50);

      System.out.println ("Mike's Lunch is " +
                           mikesLunch.getMainIngredient () + " on "            +
                           mikesLunch.getBreadType ()      + " at a cost of $" +
                           String.format ("%.2f", mikesLunch.getPrice () )
                         );

      Sandwich frankieLunch = new Sandwich ();

      frankieLunch.setMainIngredient ("Roast Beef");
      frankieLunch.setBreadType      ("Rye bread");
      frankieLunch.setPrice          (3.45);

      System.out.println ("Frankie's Lunch is " +
                           frankieLunch.getMainIngredient () + " on "            +
                           frankieLunch.getBreadType ()      + " at a cost of $" +
                           String.format ("%.2f", frankieLunch.getPrice () )
                         );
   }
}