/**
   This program demonstrates that an interface type may
   be used to create a polymorphic reference.
*/

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      // Create a DigitalSong object.
      DigitalSong song =
              new DigitalSong("Sunset Serenade",
                              "Joe Looney Band",
                              1.00);
      // Create a DigitalMovie object.
      DigitalMovie movie =
              new DigitalMovie("It Came From Planet X",
                               102, 4.95);

      // Display the song's title.                      
      System.out.println("Item #1: " +
                         song.getTitle());
                         
      // Display the song's price.
      showPrice(song);
      
      // Display the movie's title.
      System.out.println("Item #2: " +
                         movie.getTitle());
                         
      // Display the movie's price.
      showPrice(movie);
   }

   /**
      The showPrice method displays the price
      of a RetailItem object.
      @param item A reference to a RetailItem object.
   */
   
   private static void showPrice(RetailItem item)
   {
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
   }
}
