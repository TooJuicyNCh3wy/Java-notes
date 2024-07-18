/**
   Country class (immutable)
*/

public final class Country
{
   private final String name;     // Country's name
   private final City capital;    // Country's capital
   
   /**
      Constructor
      @param n The country's name.
      @param cap The country's capital.
   */
   
   public Country(String n, City cap)
   {
      name = n;
      capital = new City(cap);
   }
   
   /**
      getName method
      @return The country's name.
   */
   
   public String getName()
   {
      return name;
   }
   
   /**
      getCapital method
      @return The country's capital.
   */
   
   public City getCapital()
   {
      return new City(capital);
   }
}