public class TestCircle {                                                                                                         // Main Class
  public static void main(String[] args) {                                                                                        // Main Method
    // Creating a circle-radius of 1
    Circle circle1 = new Circle();                                                                                                // Create a Circle with radius 1 (Created Pbject)
    System.out.println("The Area of radius " + circle1.radius + " is " + circle1.getArea()); 

    //Creating a circle-radius of 25
    Circle circle2 = new Circle(25);                                                                                    // Create a Circle with radius 25 (Created Pbject)
    System.out.println("The Area of radius " + circle2.radius + " is " + circle2.getArea()); 

    //Creating a circle-radius of 125
    Circle circle3 = new Circle(125);                                                                                   // Create a Circle with radius 125 (Created Pbject)
    System.out.println("The Area of radius " + circle3.radius + " is " + circle3.getArea()); 

    //Modify ONE of the circle radius (25)
    circle2.radius = 100;                                                                                                         // OR circle2.setRadius(100);
    System.out.println("The Area of radius " + circle2.radius + " is " + circle2.getArea()); 
  }
}

// Define the Circle Class with TWO Constructors
 class Circle {                                             // Class Circle
  double radius;                                            // Data Field

// Making a Constructor with radius 1
  Circle() {                                                // no-arg Constructor
    radius = 1;
  }

// Construct a circle with a SPECIFIED radius 
  Circle(double newRadius) {                                // Second Constructor
    radius = newRadius;
  }

// Returning the AREA of the Circle
  double getArea() {                                        // getArea
    return radius * radius * Math.PI;
  }

// Returning the PERIMETER of the circle
  double getPerimeter (){                                   // getPerimeter
    return 2 * radius * Math.PI;
  }

// Set a new radius for the circle
  void setRadius(double newRadius) {                       // setRadius
    radius = newRadius;
  }
}

