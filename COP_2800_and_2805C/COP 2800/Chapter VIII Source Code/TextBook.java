/**
   This class stores data about a textbook.
*/

public class TextBook
{
   private String title;     // Title of the book
   private String author;    // Author's last name
   private String publisher; // Name of publisher

   /**
      This constructor initializes the title,
      author, and publisher fields
      @param textTitle The book's title.
      @param auth The author's name.
      @param pub The name of the publisher.
   */

   public TextBook(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   /**
      The copy constructor initializes the object
      as a copy of another TextBook object.
      @param object2 The object to copy.
   */

   public TextBook(TextBook object2)
   {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
   }
   
   /**
      The getTitle method returns the title field.
      @return textTitle The textbook's title.
   */
   
   public String getTitle()
   {
      return title;
   }
   
   /**
      The getAuthor method returns the author field.
      @return textTitle The textbook's author.
   */
   
   public String getAuthor()
   {
      return author;
   }
   
   /**
      The getPublisher method returns the publisher field.
      @return textTitle The textbook's publisher.
   */
   
   public String getPublisher()
   {
      return publisher;
   }

   /**
      toString method
      @return A string with the textbook
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Title: " + title +
                   "\nAuthor: " + author +
                   "\nPublisher: " + publisher;
         
      // Return the string.
      return str;
   }
}