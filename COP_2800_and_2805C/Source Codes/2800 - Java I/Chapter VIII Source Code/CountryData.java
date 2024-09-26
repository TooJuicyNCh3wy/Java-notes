/**
   This program demonstrates the immutable Country class.
*/

public class CountryData
{
   public static void main(String[] args)
   {
      // Create a Country object.
      Country country = new Country(
         "Norway", new City("Oslo", 681000.0));
      
      // Display data about the country's capital city.
      System.out.println( 
           "The capital of " + country.getName() + 
           " is " +
           country.getCapital().getName() + 
           " and it has a population of " +
           country.getCapital().getPopulation() + ".");
      
      // Get a City object for the capital city.
      City city = country.getCapital();
      
      // Change the capital city's name.
      city.setName("Bergen");
      
      // Again, display data about the country's capital city.
      System.out.println(
           "The capital of " + country.getName() + 
           " is " +
           country.getCapital().getName() + 
           " and it has a population of " +
           country.getCapital().getPopulation() + ".");
   }
}