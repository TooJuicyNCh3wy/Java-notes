/**
   DigitalSong class
*/

public class DigitalSong implements RetailItem
{
   private String title;       // The song's title
   private String artist;      // The song's artist
   private double retailPrice; // The song's retail price
   
   /**
      Constructor
      @param songTitle The song title.
      @param songArtist The name of the artist.
      @param songPrice The song's price.
   */

   public DigitalSong(String songTitle, String songArtist,
                      double songPrice)
   {
      title = songTitle;
      artist = songArtist;
      retailPrice = songPrice;
   }
   
   /**
      getTitle method
      @return The CD's title.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      getArtist method
      @return The name of the artist.
   */

   public String getArtist()
   {
      return artist;
   }

   /**
      getRetailPrice method (Required by the RetailItem
      interface)
      @return The retail price of the CD.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}