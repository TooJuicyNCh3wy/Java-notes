import java.util.Scanner;

/**
   This program demonstrates the immutable Contact class.
*/

public class GetContactInfo
{
   public static void main(String[] args)
   {
      String userName, userEmail;
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a name and email address from the user.
      System.out.print("Enter your name: ");
      userName = keyboard.nextLine();
      System.out.print("Enter your email address: ");
      userEmail = keyboard.nextLine();
      
      // Create a Contact object.
      Contact contact = new Contact(userName, userEmail);
      
      // Display the object's contents.
      System.out.println("Here is your contact info:");
      System.out.println("Name:  " + contact.getName());
      System.out.println("Email: " + contact.getEmail());
   }
}