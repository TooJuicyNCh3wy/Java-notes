/**
   The Contact class holds a person's contact info.
*/

public class Contact
{
   // Fields
   private String name;
   private String email;
   
   /**
      No-arg constructor sets the name and email
      fields to empty strings.
   */
   
   public Contact()
   {
      name = "";
      email = "";
   }
   
   /**
      This constructor sets the name field to the value
      passed as an argument. The email field is assigned
      an emtpty string. 
      @param n The contact's name
   */
   
   public Contact(String n)
   {
      name = n;
      email = "";
   }
   
   /**
      This constructor sets the name and email fields to
      specified values.
      @param n The contact's name
      @param e The contact's email address
   */
   
   public Contact(String n, String e)
   {
      name = n;
      email = e;
   }
   
   /**
      The setName method sets the contacat's name.
      @param n The contact's name
   */
   
   public void setName(String n)
   {
      name = n;
   }
   
   /**
      The setEmail method sets the contacat's email address.
      @param e The contact's email address
   */
   
   public void setEmail(String e)
   {
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