/**
   The Contact class is an immutable class that holds
   a person's name and email address.
*/

public final class Contact
{
   // Fields
   private final String name;
   private final String email;
   
   /**
      The constructor initializes the name and email fields.
      @param n The contact's name
      @param e The contact's email address
   */
   
   public Contact(String n, String e)
   {
      name = n;
      email = e;
   }
   
   /**
      The getName method returns the contact's name.
      @return The value of the name field
   */
   
   public String getName()
   {
      return name;
   }
   
   /**
      The getEmail method returns the contact's email address.
      @return The value of the email field
   */
   
   public String getEmail()
   {
      return email;
   }
}