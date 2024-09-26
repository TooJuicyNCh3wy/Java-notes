import java.util.Scanner;

/**
   This program demonstrates some of the Character
   class's character testing methods.
*/

public class CharacterTest
{
   public static void main(String[] args)
   {
      char ch;
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get a character from the user.
      System.out.print("Enter any single character: ");
      ch = keyboard.nextLine().charAt(0);
      
      // Test the character.
      if (Character.isLetter(ch))
         System.out.println("That is a letter.");

      if (Character.isDigit(ch))
         System.out.println("That is a digit.");
      
      if (Character.isLowerCase(ch))
         System.out.println("That is a lowercase letter.");

      if (Character.isUpperCase(ch))
         System.out.println("That is an uppercase letter.");

      if (Character.isSpaceChar(ch))
         System.out.println("That is a space.");

      if (Character.isWhitespace(ch))
         System.out.println("That is a whitespace character.");
   }
}
