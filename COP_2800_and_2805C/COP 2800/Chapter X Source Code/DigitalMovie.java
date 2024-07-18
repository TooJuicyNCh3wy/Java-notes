/**
   DigitalMovie class
*/

public class DigitalMovie implements RetailItem
{
   private String title;       // The movie's title
   private int runningTime;    // Running time in minutes
   private double retailPrice; // The movie's retail price
   
   /**
      Constructor
      @param movieTitle The movie's title.
      @param runTime The running time in minutes.
      @param moviePrice The movie's price.
   */

   public DigitalMovie(String movieTitle, int runTime,
                       double moviePrice)
   {
      title = movieTitle;
      runningTime = runTime;
      retailPrice = moviePrice;
   }
   
   /**
      getTitle method
      @return The movie's title.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      getRunningTime method
      @return The running time in minutes.
   */

   public int getRunningTime()
   {
      return runningTime;
   }

   /**
      getRetailPrice method (Required by the RetailItem
      interface)
      @return The retail price of the movie.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}