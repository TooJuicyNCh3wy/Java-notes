import java.util.Scanner;

/**
   This program tests a customer ID to
   verify that it is in the proper format.
*/

public class CustomerNumber
{
   public static void main(String[] args)
   {
      String input;
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get a customer number.
      System.out.println("Enter a customer ID in the form LLLNNNN");
      System.out.print("(LLL = letters and NNNN = numbers): ");
      input = keyboard.nextLine();

      // Validate the input.
      if (isValid(input))
         System.out.println("That's a valid customer ID.");
      else
      {
         System.out.println("That is not the proper format of " +
                            "a customer ID.");
         System.out.println("Here is an example: ABC1234");
      }
   }

   /**
      The isValid method determines whether a String is a
      valid customer ID. If so, it returns true.
      @param custNumber The String to test.
      @return true if valid, otherwise false.
   */

   private static boolean isValid(String custID)
   {
      boolean goodSoFar = true;  // Flag
      int i = 0;                 // Control variable

      // Test the length.
      if (custID.length() != 7)
         goodSoFar = false;

      // Test the first three characters for letters.
      while (goodSoFar && i < 3)
      {
         if (!Character.isLetter(custID.charAt(i)))
            goodSoFar = false;
         i++;
      }

      // Test the last four characters for digits.
      while (goodSoFar && i < 7)
      {
         if (!Character.isDigit(custID.charAt(i)))
            goodSoFar = false;
         i++;
      }

      return goodSoFar;
   }
}
