class Circle {
  // The radius of a circle
  double radius = 1;
  // Data field ↑↑↑


  /** These are Constructors */

  // Construct a Circle Object
  Circle() {
  }

  // Construct a Circle object
  Circle(double newRadius){
    radius = newRadius;
  }
  /** End of Constructors */


  /** These are Methods */

  // Return the area of this circle
  double getArea() {
    return radius * radius * Math.PI;
  }

  // Return the perimeter of this circle
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  // Set a new radius for this circle
  void setRadius(double newRadius) {
    radius = newRadius;
  }
  /** End of Methods */
}
