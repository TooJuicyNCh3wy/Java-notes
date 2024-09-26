/**
   City class (mutable)
*/

public class City
{
   private String name;
   private double population;
   
   /**
      Constructor
      @param n The city's name.
      @param p The city's population.
   */
   
   public City(String n, double p)
   {
      name = n;
      population = p;
   }
   
   /**
      Copy constructor
      @param city2 A City object to copy.
   */
   
   public City(City city2)
   {
      name = city2.name;
      population = city2.population;
   }
   
   /**
      setName method
      @param n The city's name
   */
   
   public void setName(String n)
   {
      name = n;
   }
   
   /**
      setPopulation method
      @param p The city's population
   */
   
   public void setPopulation(double p)
   {
      population = p;
   }
   
   /**
      getName method
      @return The city's name.
   */
   
   public String getName()
   {
      return name;
   }
   
   /**
      getPopulation method
      @return The city's population.
   */
   
   public double getPopulation()
   {
      return population;
   }
}