# Summary of Chapter 9

# 9.1
**Key Point**
- Obejct- oriented programming enables you to develop large-scale software and GUIs effectively

Why O.O.P?
- it is essentially a technology for developing reusable software.

--------------------------------
# 9.2
**Key Point**
- _a Class defines the properties and behaviors for objects._

# State of an object
Object-Oriented Programming 
- OR OOP for Short
  - involes programming object
 
Object represents an entity in the real world that can be distincly identified

EXAMPLE
```
- Student
- desk
- circle
- button
- loan
```
All of these can be viewed as objects

An Object has a Unique identity, state, and behavior
- the **_State_** of an Object
  - AKA its Properties **OR** Attributes
    -  is Represented by _Data Fields_ with their current values.
    -  EXAMPLE
```
A Circle Object as the EXAMPLE
has a Data field
- Radius
which is the property that characterize a circle
```
```
A rectangle object as the EXAMPLE
has the data field(s)
- width
- height
which are the propertes that characterize a rectangle.
```
the **_behavior_** of an object
- AKA its actions
  - is defined by methods
  - to invoke a method on an object is to ask the object to perform an action.
    - EXAMPLE

you may define methods named
```
getArea();
getPerimeter();
```
for Circle objects

A Circle object can invoke
```
getArea();
```
to return its area and
```
getPerimeter();
```
to return its perimeter

you may also define this method
```
setRadius(radius);
```
A Circle Object can invoke this method to change its radius.

----------------------------------------------------
# Contract / Objects
Objects of the same type are defined using a common _class_
Class
- A Template, blueprint, or contract that defines what an object's data fields and methods would be.

Object
- an instance of a class

You can create instances of a class. Creating a instance is reffered to as **_instantiation_**.

The terms object and instance are often interchangeable.

This Below shows a class named ```Circle``` and its 3 objects

![56280ef813d9bdffb8a9c8c8f89ee9e7](https://github.com/user-attachments/assets/381e84db-43a5-4ff8-9de4-d4d383edc836)

# Method 
A Java Class uses variables to define data fields and methods to define actions

In Addition, 
- a class provides methods of a special type
  - known as **_Constructors_**
    - which are invoked to create a new object

A Constructor can perform any action...**BUT**...constructors are designed to perfrom initializing actions
- SUCH AS
  - initializing the data fields of objects

These code(s) below shows an EXAMPLE of defining the class for circle objects.

Remember:
- A Class is a Construct that Defines objects of the same type
```
class Circle {
```
```
  /** Data Fields */

  /** The Radius of the Circle */
  double radius = 1;
```
```
  /** Constructors */

  /** Construct a circle object */
  Circle() {              
  }

  /** Construct a circle object */
  Circle(double newRadius) {
    radius = newRadius;
  }
```
```
  /** Methods */

  /** Return the Area of this Circle */
  double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return the Perimeter of this circle */
  double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Set a new radius for this circle */
  void setRadius(double newRadius) {
    radius = newRadius;
  }
}
```
# Main Class
The ```Circle``` Class is different from all of the other classes you have seen thus far

It does not have the ```main``` Method, and therefore, cannot be run; it is merely a definition for circle objects. The class that contains the ```main``` Method will be referred to in his book, for convinience, as the main class.

# Class Diagram
The illustration of class templates and objects in the image above can be standardized using **_Unified Modeling Language (UML)_** notation.

This notation as shown below is called a UML Class diagram...

Or

simply a _class diagram_. in the class diagram, the data field is denoted as
```
dataFieldName: dataFieldType
```
REMEMBER:
- Classes and Objects can be represented using UML notation.

![18a472d42bf404dec3d766f8317e6c83](https://github.com/user-attachments/assets/d940e22e-727f-478d-af2a-d3a579fb5525)

The constructor is denoted as:
```
ClassName(parameterName: parameterType)
```
The Method is denoted as
```
methodName(parameterName: parameterType): returnType
```
# 9.3 were just examples
# 9.4
# Constructing Objects Using Constructors

**Key Point**
- A **_Constructor_** is invoked to create an object using the new operator.

-----------------------------
Constructors are a special kind of method

There are 3 kinds of pecularities
- **Constructor's Name**
  - A constructor must have the same name as the ```class``` itself
- **no return type**
  - Constructors do not have a return type-not even ```void```
- ```new``` **operator**
  - Constructors are invoked using the ```new``` operator when an object is created. Constructors play the role of initializing objects.

-------------------------------------------------
# Overloade constructors
The constructor had exactly the same name as its defining class.

Like regular methods
  - Constructors can be overloaded, making it easy to construct objects with different initial data values
    - EXAMPLE
      - Multiple constructors can have the same name but different signatures

------------------------------

# No ```void```
it is a common mistake to put the ```void``` keyword in front of a constructor

Like this one right here
```
public void Circle() {
}
```
in this case, ```Circle``` is a **Method, NOT AS A CONSTRUCTOR**

-------------------------------------------------------------------
# Constructing objects 
Constructors are used to construct oobjects. to construct an object from a class, invoke a constructor of the class using the ```new``` operator

As Shown Below:
```
new ClassName(arguments);
```
EXAMPLE:
- ```new Circle()``` creates an objects of the ```Circle``` class using the first constructor defined in the ```Circle``` class, and ```new Circle(25)``` creates an object using the second constructor defined in the ```Circle``` class

A class normally provides a constructor without arguments

EXAMPLE
- ```Circle()```

Such a coonstructor is reffered to as a "_no-arg_" or "_no-argument_ constructor" 

A class may be defined without constructors. In this case, a public no-arg constructor with an empty body is implicitly defined in the class. This Construstor, called a _default_ constructor, is provided automatically _ONLY IF NO CONSTRUCTORS ARE EXPLICITLY DEFINED IN THE CLASS_.
