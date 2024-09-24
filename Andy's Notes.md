# COP 2800 & 2805C - Java I & II Notes

# Key Points
## Chapter 1
- The Central theme of this is to learn how to solve problems by writing a program
- A Computer is an Electric device that stores and process data
- Computer programs, known as Software, are instructors that tell a computer what to do
- The Operating System (OS) is the most important program that runs on a computer. The OS manages and controls a computer activities
- Java is a powerful and versatile programming language for developing software running on mobile devices, desktop computers, and servers
- Java Syntax is defined in the java language specification, and the Java library is defined inthe Java application program interface (API). The JDK is the software for compiling and running java programs. An IDE in integrated development environment for rapidly developing programs.
- A Java Program is executed from thr ```main``` method in the class
## Chapter 9
- Object-oriented programming enables you to develop large-scale software and GUIs effectively.
- A class defines the properties and behaviors for objects
- Classes are definitions for objects and Objects are created from classes.
## Chapter 10
- The focus of this chapter is on class design and to explore the differences between procedural programming and object-oriented programming
- Class Abstraction is seperation of class implementation from the use of a class. the details of implementation from the use of a class. The details of implementation are encapsulated and hidden from the user. This is known as class encapsuation

# Chapter I - Intro to Computers, Programs & Java
## I.I - Intro
What is Programming?
- Programming
  - To create/develop software
    - Also called Program
  - In basic terms,
    - Software contains instructions that tell a computer–or a computerized device–what to do.

Software
- Its all around you
- Ofc you expect to find and use software on a personal computer
- It also plays a role in running
  - Airplanes
  - Cars
  - Cell phones
    - Android Specifically
  - EVEN TOASTERS
- On your personal computer
  - You use word processors
    - To write documents
  - Web browsers
    - To explore the internet
  - Email Programs
    - To send and receive messages

[W3 Schools](https://github.com/aalons012/Java-notes/blob/main/W3%20Schools/1%20-%20Java%20Tutorial/02%20-%20Intro.md)

-----------------------------
SKIPPING TO 1.6

------------------------------
## I.VI - The Java Language Specifications, API, JDK, JRE, & IDE
Computer languages have strict rules of usage.

If you dint follow the rules when wrint a program,
- The computer will not be able to understand
  - These 2 Define JAVA Standards
    - Java Language Specification
      - From [Vocabulary](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#j)
        > 1. a Technical definition of the Java Programming
        > 2. It Describes all aspects of the language, including the semantics of all types, statements, and expression as well as threads and binary compatibility
    - Java API
      - Also Known As Library
      - Contains predefined classes and interfaces for developeing Java programs
      - Still Expanding
     
Java is a Full Fledged and powerful language that be used i many ways. 

It comes in 3 Editions
- SE
  - Standard Edition
    - To develop applications
    - The applications can run on Desktop.
- EE
  - Enterprise Edition
    - to develop server-side applications
      - Such as
        - Java servlets
        - JavaServer Pages (JSP)
        - JavaServer Faces (JSF)
- ME
  - Micro Edition
    - to develop applications for mobile devices

----------------------------------------------------------------
## I.VII - A Simple ```.java``` Program

- [Java Full Course for free ☕ - Youtube](https://github.com/aalons012/Java-notes/blob/main/Java%20Full%20Course%20for%20free%20%E2%98%95%20-%20Youtube/01%20-%20Java%20-%20Tutorial%20%26%20Basic%20Inputs.md)
- [W3 Schools](https://github.com/aalons012/Java-notes/blob/main/W3%20Schools/1%20-%20Java%20Tutorial/03%20-%20Getting%20Started.md)

What is a Console?
- The word console is an old computer term that refers to the text entry and display device of a computer.

Console Inpute
> to recieve input into form the keyboard

Console Output
> to display output on the monitor 

#### Example 1 
A Basic Java Program that Displays ```Wdlcome to Java```

![image](https://github.com/user-attachments/assets/d1e37350-d7d0-4ca9-81ef-00e6ad04eff4)

OUTPUT:
```
Weclome to Java :))
```

```line numbers```
> Note the line numbers are for reference purposes only; they are not part of the program. So, don’t type line numbers in your program.

```class``` name
- Line 1 defines a class
- **EVERY JAVA PROGRAM** must have at least one class
- [Java QuickStart](https://github.com/aalons012/Java-notes/blob/main/W3%20Schools/1%20-%20Java%20Tutorial/03%20-%20Getting%20Started.md#java-quickstart)
  > The Class Must match with its file name
- Line 2 is the ```main``` Method
  - The program is executed from the ```main``` method
  - A class may contain several methods
    - The ```main``` method is the entry point where the program begins execution

The rests talks aboutg string and the basic inputs of Java and what its like that soo look at the 2 links, the ones that are colored blue

...

if you wanna know,
> string
> A method is a construct that contains statements. The main method in this program contains the System.out.println statement. This statement displays the string Welcome to Java! on the console (line 4). String is a programming term meaning a sequence of characters. A string must be enclosed in double quotation marks. Every statement in Java ends with a semicolon (;), known as the statement terminator.
>
> Keywords have a specific meaning to the compiler and cannot be used for other purposes in the program. For example, when the compiler sees the word class, it understands that the word after class is the name for the class. Other keywords in this program are public, static, and void.
>
> Line 3 is a comment that documents what the program is and how it is constructed. Comments help programmers to communicate and understand the program. They are not programming statements, and thus are ignored by the compiler. In Java, comments are preceded by two slashes (//) on a line, called a line comment, or enclosed between /* and */ on one or several lines, called a block comment or paragraph comment. When the compiler sees //, it ignores all text after // on the same line. When it sees /*, it scans for the next */ and ignores any text between /* and */. Here are examples of comments:
```
// This application program displays Welcome to Java!

/* This application program displays Welcome to Java! */

/* This application program 

    displays Welcome to Java! */
```
> A pair of braces in a program forms a block that groups the program’s components. In Java, each block begins with an opening brace ({) and ends with a closing brace (}). Every class has a class block that groups the data and methods of the class. Similarly, every method has a method block that groups the statements in the method. Blocks can be nested, meaning that one block can be placed within another

------------------------------------------------------
# Chapter IX - Objects and Classes
## IX.I & II - Defining Classes for Objects
Object-oriented programming (OOP)
- essentially a technology for developing reusable software
- involves using obejcts

Object
- represents an entity to the real world that can be distinctly identified
  - These **Examples** can all be viewed as objects:
    - student
    - desk
    - circle
    - button
    - loan
- It has a unique identity, state and behavior

State of an Object
> AKA its properties or atrributes
- represented by data fields with current values
- EXAMPLE
  - A ```circle``` object
    - has a data field ```radius```
      - the property that characterize a circle
  - A ```rectangle``` object
    - has a data fields ```width``` and ```height```
      - which are the properties that characterize a rectangle
- consists of a set of **Data Fields** with their current values

Behavior of an object
> AKA its actions
- defined by a set of methods
- To invoke a method to an object
  - to ask the object to perform an action
 
An object has **both** a **state** and **behavior**. The state defines the object, and the behavior defines what the object does.

Objects of the same type are defined using a common class.
- A ```class``` is a...
  - template
  - blueprint
  - contract
 - ...that defines what an object's data fields and methods will be

An object is an **instance** of a class
- creating an instance is reffered to as **instantiation**

The terms _Object_ and _instance_ are often interchangeable

A Java class uses variables to define data fields and methods to define actions.
- a class provides methods of a special type, ...
  - known as constructors
- ...which are invokes to create a new object.

A Constructor can perform any action, but Constructors are designed to perform initializing actions **SUCH AS**
- initializing the data fields of objects
  - Look at ```class Circle``` from the source code image below ↓↓↓

Classes are constructs that define object of the same type

------------------------------------------------------
#### 9.2 - A Class is a template for creating objects
![image](https://github.com/user-attachments/assets/f3f9239f-7719-444f-9516-fe36a2b421d3)

------------------------------------------------------
#### 9.3 - A Class is a construct that defines objects of the same type
![image](https://github.com/user-attachments/assets/f81a6fa4-b5d2-4407-a27e-84dbcf606d81)

------------------------------------------------------
The image right above... ↑↑↑

The ```Circle``` class is a bit different from all of the other classes you have seen thus far
- It doesnt have a ```main``` method
  - **THEREFORE**
    - cannot be run
      - its a definition for circle Objects

The class that contains the ```main``` method will be referred to in this notes, for convenience, as the main class

In 9.2
- The illustration of class templates and objects can be standardized using
  - is called **U**nified **M**odeling **L**anguage notation
    - **UML**
   
The image below (9.4) is called a UML class diagram
- or just call it a class diagram if youre a normal human being

In the class diagram
- the data field is denoted as:
```
dataFieldName: dataFieldType
```
- The constructor is denoted as:
```
ClassName(ParametherName: parameterType)
```
- The method is denoted as:
```
methodName(parameterName: parameterType): returnType
```
---------------------------------------
#### 9.4 - Classes and objects can be represented using UML notation
![image](https://github.com/user-attachments/assets/2486c017-be14-4997-83c4-e4d83c401b04)

-------------------------------------------------------
## IX.III Example - Defining Classes and Creating Objects
This section gives 2 examples of defining classes and use the classes to create objects

##### Listing 9.1
Is a program that defines ```Circle``` and uses it to create objects.
- This program Constructs 3 circle objects **with radius**...
  - 1
  - 25
  - 125

...and displays the ```radius``` and ```area``` of each of the 3 circles.

and it will then change the radius of the 2nd radius and will display its new radius and area

![image](https://github.com/user-attachments/assets/01d8b668-01c8-4c12-913f-c07239de29da) 

-------------------
Lets Break it down 

Line 1. ```public class TestCircle {}```
- Declares a public class named TestCircle.

Line 2. ```public static void main(String[] args)```
- Defines the main method, which is the entry point for any standalone Java application. It accepts an array of strings as arguments. without main...it willnot work

3-5. Creating and displaying area for a circle with radius 1:
- Line 4: A ```Circle``` object named ```circle1``` is created using the default constructor, which sets the radius to 1.
- Line 5: The area of ```circle1``` is calculated by calling getArea() and the result is printed.

7-9. Creating and displaying area for a circle with radius 25:

- Line 8: A ```Circle``` object named ```circle2``` is created using the constructor that accepts a double for radius, setting the radius to 25.
- Line 9: The area of ```circle2``` is calculated by calling ```getArea()``` and the result is printed.

11-13. Creating and displaying area for a circle with radius 125:
- Line 12: A ```Circle``` object named ```circle3``` is created with a radius of 125.
- Line 13: The area of ```circle3``` is calculated and printed.

15-17. Modifying the radius of circle2 and displaying the new area:
- Line 16: The radius of ```circle2``` is set to 100 using ```setRadius```.
- Line 17: The area of the modified ```circle2``` is calculated and printed.

21-23. Definition of the ```Circle``` class:
- Line 22: Declares a class named ```Circle```.
- Line 23: Defines a field ```radius``` of type double to store the radius of the circle.

25-29. Constructor for ```Circle``` with no arguments (default constructor):

- Line 26-28: Defines a constructor that does not take any arguments and sets the radius of any new ```Circle``` object to 1.

31-33. Constructor for ```Circle``` that specifies a radius:
- Line 32: Defines a constructor that accepts a ```double``` parameter and sets the ```radius``` of the ```Circle``` object to the passed value.

35-39. Method to return the area of the circle:
- Line 36-38: Defines ```getArea()```, a method that calculates and returns the area of the circle using the formula 𝜋𝑟<sup>2</sup>

41-45. Method to return the perimeter of the circle:
- Line 42-44: Defines ```getPerimeter()```, a method that calculates and returns the perimeter (circumference) of the circle using the formula 2𝜋𝑟

47-51. Method to set a new radius for the circle:
- Line 48-50: Defines ```setRadius(double newRadius)```, a method that sets the radius of the circle to a new value provided as an argument.

----------------------------------------------------------------------------
after all this...Its whole 


------------------------------------------------------
# Chapter X - Object-oriented Thinking
In **chapter VI**
- learned method abstraction and used it in stepwise refinement



------------------------------------------------------
# [Vocabulary](https://quizlet.com/946298625/java-vocabulary-flash-cards/?funnelUUID=01255e6f-adf7-440a-9f08-a111d5e187c9)
