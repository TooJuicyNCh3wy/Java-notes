## Andy's Java Notes

## Would Recommend looking at the Table of Contents 

If you cant see ANY of Source Codes...Or read them...[Click on me](https://github.com/aalons012/Java-notes/tree/main/COP_2800_and_2805C/Source%20Codes)
# [Vocabulary](https://quizlet.com/946298625/java-vocabulary-flash-cards/?funnelUUID=01255e6f-adf7-440a-9f08-a111d5e187c9)
# Key Points
Chapter 1
- [1.1](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#ii---introduction) - The Central theme of this is to learn how to solve problems by writing a program
- [1.2](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iii---what-is-a-computer) - A Computer is an Electric device that stores and process data
- [1.3](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iiii---programming-languages) - Computer programs, known as Software, are instructors that tell a computer what to do
- [1.4](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iiv---operating-systems) - The Operating System (OS) is the most important program that runs on a computer. The OS manages and controls a computer activities
- [1.5](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iv---java-the-world-wide-web-and-beyond) - Java is a powerful and versatile programming language for developing software running on mobile devices, desktop computers, and servers
- [1.6](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#ivi---the-java-language-specifications-api-jdk-jre--ide) - Java Syntax is defined in the java language specification, and the Java library is defined inthe Java application program interface (API). The JDK is the software for compiling and running java programs. An IDE in integrated development environment for rapidly developing programs.
- [1.7](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#ivii---a-simple-java-program) - A Java Program is executed from thr ```main``` method in the class
- [1.8](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iviii-creating-compiling-and-executing-a-java-program) - You save a Java program in a ```.java``` file and compile it in a ```.class``` file. the ```.class``` file is executed by the Java Virtual Machine (JVM)
- [1.9](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#iix---programming-style-and-documentation) - Good Programming Style and paper documentation make a program easy to read and helkp prorammers prevent errors
- [1.10](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#ix---programming-errors) - Programming errors can be categorized into 3 types: _syntax, runtime, and logic errors_
- [1.11]() - You can edit, compile, run, and debug Java Programs using **NetBeans**.
- [1.12]() - You can edit, compile, run, and debug Java Programs using **Eclipse**.
  
Chapter 2
- o

Chapter 3
- The Program can decide which statments to execute based on a condition
  
Chapter 9
- Object-oriented programming enables you to develop large-scale software and GUIs effectively.
- A class defines the properties and behaviors for objects
- Classes are definitions for objects and Objects are created from classes.

Chapter 10
- The focus of this chapter is on class design and to explore the differences between procedural programming and object-oriented programming
- [10.2](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xii---class-abstraction-and-encapsulation) - Class Abstraction is seperation of class implementation from the use of a class. the details of implementation from the use of a class. The details of implementation are encapsulated and hidden from the user. This is known as class encapsuation
- [10.3](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xiii---thinking-in-objects) - The procedural paradigm focuses on designing methods. The object-oriented paradigm couples data and methods together into objects. Software design using the object-oriented paradigm focuses on objects and operations on objects.
- [10.4](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xiv---class-relationships) - To design Classes, you need to explore the relationships among classes. The common relationships among classes are association, aggregation, composition, and inheritance
- [10.5 & 10.6](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xv--vi-case-studies) - Case Studies
- [10.7](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xvii---processing-primitive-data-type-values-as-objects) - A primitive-type is not an object, but it can be wrapped in an object using a wrapper class in the Java API
- [10.8](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xviii---automatic-conversion-between-primitive-types-and-wrapper-class-types) - A Primitive type value can be automatically converted to an object using a wrapper class, and vice versa, depending the context
- [10.9](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xix---the-biginteger-and-bigdecimal-classes) - The ```BigInteger``` and ```BigDecimal``` classes can be used to represent integers or decimal numbers of any size and precision
- [10.10](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xx---the-string-class) - A ```String``` object is immutable; its contents cannot be changed once the string is created
- [10.11](https://github.com/aalons012/Java-notes/blob/main/Andy's%20Notes.md#xxi---the-stringbuilder-and-stingbufferclasses) - The StringBuilder and StringBuffer classes are similar to the String class except that the String class is immutable

Chapter 13
- [10.1]() A superclass defines common behavior for related subclasses. An interface can be used to define common behavior for classes (including unrelated classes)

-----------------------------------------------------
# I - Intro to Computers, Programs & Java
Trust me no one needs to understand this unless like if you really wanna know heres a summary 

[W3 Schools](https://github.com/aalons012/Java-notes/blob/main/W3%20Schools/1%20-%20Java%20Tutorial/02%20-%20Intro.md)

-----------------------------
## I.I - Introduction
This section provides an overview of the chapter and sets the stage for understanding how computers and Java programming work together.

## I.II - What is a Computer?
A computer is an electronic device designed to process and store data. Computers include both hardware (the physical components you can touch) and software (the invisible programs that control the hardware).

Key components discussed include:
- Central Processing Unit (CPU): Known as the brain of the computer, it retrieves instructions from memory and executes them.
- Memory (RAM): Stores instructions and data for the CPU. It’s volatile, meaning data is lost when the computer is turned off.
- Storage Devices: Such as hard drives and USB flash drives, are non-volatile and hold data permanently until deleted.
- Input/Output Devices: Includes keyboards, mice, monitors, and printers, allowing users to interact with the computer.
## I.III - Programming Languages
Computers use programming languages to perform tasks. The chapter explains the types of programming languages:
- Machine Language: The computer's native binary language.
- Assembly Language: A low-level language that uses mnemonics instead of binary codes.
- High-Level Languages: These include Java, Python, and C++, which are more human-readable and must be translated into machine code by a compiler.
## I.IV - Operating Systems
The Operating System (OS) is the software that manages the hardware and other software on a computer. Examples include Windows, macOS, and Linux. Java programs can be run on any operating system that has a Java Virtual Machine (JVM), which provides Java's platform independence.
## I.V - Java, the World Wide Web, and Beyond
Java was originally designed to run on web browsers via applets, but due to security concerns, applets are no longer used. However, Java is now widely used for building web applications on servers, processing data, and generating dynamic web pages.
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
## I.VII - A Simple ```.java``` Program

- [Java Full Course for free ☕ - Youtube](https://github.com/aalons012/Java-notes/blob/main/Java%20Full%20Course%20for%20free%20%E2%98%95%20-%20Youtube/01%20-%20Java%20-%20Tutorial%20%26%20Basic%20Inputs.md)
- [W3 Schools](https://github.com/aalons012/Java-notes/blob/main/W3%20Schools/1%20-%20Java%20Tutorial/03%20-%20Getting%20Started.md)

if you dont think these work then well do it here then

Let’s begin with a simple Java program that displays the message Welcome to Java! on the console. (The word console is an old computer term that refers to the text entry and display device of a computer. Console input means to receive input from the keyboard, and console output means to display output on the monitor.) The program is given below ↓↓↓

![image](https://github.com/user-attachments/assets/39f8c9d0-2198-4da7-96d7-497547a6f7f1)

REMEMBER!!!!
> the line numbers are for reference purposes only; IT IS NOT PART OF THE PROGRAM
>
> so please dont write that down
>
> you should fucking know that if you already know a coding language fucking idiot LOL kidding anyways
>

from the image above ↑↑↑
- Line 1 defines a class
  - Every Java program must have at least one class. Each class has a name. By convention, class names start with an uppercase letter. In this example, the class name is Welcome.
- Line 2 defines the ```main``` method
  > Would recommend using this video on why the ```main``` method is like that
  >
  > [main Method Explained](https://www.youtube.com/watch?v=P-_Nzi_mCRo&t=272s&ab_channel=CodingwithJohn)
  - The program is executed from the main method. A class may contain several methods. The main method is the entry point where the program begins execution.
  - A method is a construct that contains statements. The main method in this program contains the System.out.println statement. This statement displays the string ```Welcome to Java!``` on the console (line 4).
    
String is a programming term meaning a sequence of characters. A string must be enclosed in double quotation marks. Every statement in Java ends with a semicolon (;), known as the statement terminator.

Keywords have a specific meaning to the compiler and cannot be used for other purposes in the program. For example, when the compiler sees the word class, it understands that 

 the word after class is the name for the class. Other keywords in this program are public, 
static, and void.
 Line 3 is a comment that documents what the program is and how it is constructed. Comments help programmers to communicate and understand the program. They are not programming statements, and thus are ignored by the compiler. In Java, comments are preceded by two slashes (//) on a line, called a line comment, or enclosed between /* and */ on one or several lines, called a block comment or paragraph comment. When the compiler sees //, it ignores all text after // on the same line. When it sees /*, it scans for the next */ and ignores 
any text between /* and */. Here are examples of comments:
```
 // This application program displays Welcome to Java!
 /* This application program displays Welcome to Java! */
 /* This application program
   displays Welcome to Java! */
```
A pair of braces in a program forms a block that groups the program’s components. In Java, each block begins with an opening brace ({) and ends with a closing brace (}). Every class has a class block that groups the data and methods of the class. Similarly, every method has a method block that groups the statements in the method. Blocks can be nested, meaning that one block can be placed within another, as shown in the following code:

![image](https://github.com/user-attachments/assets/0325a1fb-3189-47e1-b32c-4aa93eae585c)

-----------------------------------------------
Tip

An opening brace must be matched by a closing brace. Whenever you type an opening 
brace, immediately type a closing brace to prevent the missing-brace error. Most Java 
IDEs automatically insert the closing brace for each opening brace.

---------------------------------------------
!!!CAUTION!!!

Java source programs are case sensitive. It would be wrong, for example, to replace main in the program with Main.

--------------------------------------------

You have seen several special characters (e.g., { }, //, ;) in the program. They are used in almost every program. Table 1.2 summarizes their uses.

The most common errors you will make as you learn to program will be syntax errors. Like any programming language, Java has its own syntax, and you need to write code that conforms to the syntax rules. If your program violates a rule—for example, if the semicolon is missing, a brace is missing, a quotation mark is missing, or a word is misspelled—the Java compiler will report syntax errors. Try to compile the program with these errors and see what the compiler reports

![image](https://github.com/user-attachments/assets/f0419264-f16d-4bd6-a8a7-9debc886262c)


## I.VIII Creating, Compiling, and Executing a Java Program
Java programs are saved in .java files, compiled into .class files, and executed by the JVM. The process involves:
- Writing the program.
- Compiling it using the ```javac``` command.
- Running it using the ```java``` command.
  
## I.IX - Programming Style and Documentation
Good programming style is essential for readability and maintenance. It includes writing clear, concise code, using proper indentation, and documenting the code with comments. The chapter also introduces Javadoc comments, which can generate HTML documentation from code comments.

## I.X - Programming Errors
The chapter introduces three types of programming errors:
- Syntax Errors: Detected by the compiler, these occur when code doesn’t conform to the Java language rules.
- Runtime Errors: These happen during program execution and can cause the program to crash.
- Logic Errors: These are errors in the program’s logic that result in incorrect output, even if the program runs successfully.

------------------------------------------------------
# III - Selections
## III.I Intro


------------------------------------------------------
# IX - Objects and Classes
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
# X - Object-oriented Thinking
## Introduction 
The preceding chapter introduced objects and classes. You learned how to define classes, create objects, and use objects. This book’s approach is to teach problem solving and fundamental programming techniques before object-oriented programming. This chapter shows how procedural and object-oriented programming differ. You will see the benefits of object-oriented 
programming and learn to use it effectively.

Our focus here is on **class design**. We will use several examples to illustrate the advantages of the object-oriented approach. The examples involve designing new classes and using them in applications and introducing new classes in the Java API.
## X.II - Class Abstraction and Encapsulation
The Creator of a class 
- **DESCRIBES** the Functions of the class
- lets the user know how the class is used

The collection of like
- Constructore
- methods
- fields
  - all these 3 that are accessible from outside the class
    -  **TOGETHER** with the description of how these members are **Expected** to behave...
      - Serves as the class contract
        - As Shown in 10.1 ↓↓↓↓

The Details of implementation are encapsulated and hidden from the user
- This is known as _class encapsulation_
  - Example
    - you can create a ```Circle```object and fine the data of the circle **WITHOUT** knowing how the area is computed
      - Because of this reason, A class is **ALSO KNOWN AS**
        - abstract data type (ADT)

---------------------------------------------------------------------
#### 10.1 - Class Abstraction seperated class implementation from the use of the class

![image](https://github.com/user-attachments/assets/9e737387-7260-48b9-b30b-b230f8a8bad9)

------------------------------------------------------
Class Abstraction and Encapsulation are two sides of the same coin. 

Many real-life examples illustrate the concept of Class Abstraction

Like building a Computer. It has many components
- CPU
- RAM
- SSD
- Motherboard
- Cooling Fan
- Exhaust Fans

Each component can be viewed as an object that has properties and methods. To get the components to work together
- need to know how **EACH component** is used and how it interacts with others
  - **YOU DONT NEED TO KNOW HOW THE COMPONENTS WORK INTERNALLY**

Internal implementation is encapsulated and hidden for you

The Computer-parts-building system analogy precisely mirrors the Object-Oriented approach
- Each component can be viewed as an object of the class for the component
  - EXAMPLE
    - might have a class that models all kinds of fans for the use of a computer
      - with properties such as fan size and speed and methods such as start and stop
      - A Specific fan is an instance of this class with specific property values
  - ANOTHER EXAMPLE
    - Getting a Loan
      - Specific loan that can be viewed as an object of a ```Loan``` class.
        - Interest Rate
        - Loan Amount
        - Loan Period
          - these 3 are its data properties
          - and
          - computing the monthly and total payments are its methods
    
---------------------------------------------------------
Listing 2.9, ComputeLoan.java, presented a program for computing loan payments. 

That program **cannot** be reused in other programs **because** the code for computing the payments is in the ```main``` method. 

One way to fix this problem is to **define static** methods for computing the monthly payment and the total payment. 

However, this solution has limitations. 
- Suppose that you wish to associate a date with the loan. There is no good way to tie a date with a loan without using objects. 

The traditional procedural programming paradigm is action-driven, and data are separated from actions. The object-oriented programming paradigm focuses on objects, and actions are defined along with the data in objects. To tie a date with a loan, you can define a loan class with a date along with the loan’s other properties as data fields. A loan object now contains data and actions for manipulating and processing data, and the loan data and actions are integrated in one object. 

↓↓↓ 10.2 shows the UML class diagram for the Loan class. ↓↓↓

------------------------------------------------------------------------
#### 10.2 - The ```Loan``` class models the properties and behaviors of loans
![image](https://github.com/user-attachments/assets/127e9ef8-dc6c-4e45-8e38-6d536b859209)

---------------------------------------------------------------------------
This Above...
Serves as the contract for the ```Loan``` class

Rember that a class user can use the class without knowing how the class is implemented

Assume that the ```Loan``` class is available. The Program **Listing 10.1** uses that class.

----------------------------------------------------------------------------
### ```TestLoanClass.java```

![image](https://github.com/user-attachments/assets/3b6c7f5b-c03e-42ad-adaa-ca491c822c0d)

--------------------
The ```main``` method ONLY reads the interest rate the payment period, in years, and the loan amount
- Thus Creating a ```Loan``` Object
- Which by then, obtains the monthly payment (Line 24)
- And the total Payment (Again 24)

if you press run it...doesnt run right?

**its because its missing the ```Loan``` Class**

its the main reason why it cant run at the moment, soo, its add it shall we??

----------------------------------------
### ```Loan.java```

![image](https://github.com/user-attachments/assets/277668a2-631d-4463-8d3b-e1a1122cf6a8)

---------------------------------------------
Lets Break it Down

```
public class Loan {
```
it defines a public class named ```Loan```
```
private double annualInterestRate;
private int numberOfYears;
private double loan Amount
private java.util.Date loanDate;
```
First ```private```
- Private means that these fields **CAN ONLY BE ACCESSED BY ONLY THIS CLASS...NO ONE ELSE BUT** ```public class Loan```
- And these private variables that are exclusively to ```Loan```, are for the loan's annual interest rate, number of years, amount, and the date of when it has been locked and loaded
```
public Loan(){
  this(2.5,1,1000);
}
```
This is a no-arg constructor that makes the variables from ```Loan``` with default values
- 2.5 for default interest rate, for ```double```
- 1 for how many year(s), for ```int```
- 1000 for the default loan amount, for ```double``` only because if someone decides to add a decimal point on the loan amount

and by using ```this```, it refers to the current object, ```Loan```, in a method or constructor
```
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }
```
this right here is the Main Constructor having the public with the class, being ```Loan``` with the parameters that are under ```TestLoanClass.java```, which will then initialize those parameters to initialize the corresponding fields. Also, sets ```loanDate``` to current date and time.
```
public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public int getNumberOfYears() {
    return numberOfYears;
  }

  public void setNumberOfYears(int numberOfYears){
    this.numberOfYears = numberOfYears;
  }

  public Double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount){
    this.loanAmount = loanAmount;
  }
```
Provides getter and setter methods for each field, allowing controlled access and modification of these fields from outside the class. This encapsulation protects the integrity of the data.
```
public double getMonthlyPayment(){
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;
  }
```
Calculates the monthly payment using the formula for amortizing a loan based on the compound interest rate formula. The interest rate is divided by 1200 to convert from an annual percentage to a monthly fraction.
```
public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
  }
```
Computes the total payment over the life of the loan by multiplying the monthly payment by the total number of payments (12 months times the number of years).
```
  public java.util.Date getLoanDate() {
    return loanDate;
  }
```
Provides a method to retrieve the date when the loan was created.
This class is a typical example of a well-encapsulated Java class that defines a specific business entity, in this case, a loan. It uses private fields to protect its data and public methods to provide controlled access and functionality based on that data.

-------------------------
And after all this 

FINALLY

you can now run it

lets run it shall we

for this example well use the following
- 3 for interest rate
- 3 for years
- 20,000 for the amount

this is the result
```
Enter your annual interest rate: 3
Enter the number of years AS A WHOLE NUMBER (Integer): 3
How much would you like for the loan:20000
The loan was created on Wed Oct 02 14:39:09 EDT 2024
The monthly payment is 581.62
The total payment is 20938.47
```
WOOOOWWWWW

-----------------------------------
now
from a class developer's perspective
- a class is designed for use by many different customers

In order to make a class useful in a wide range of applications
- it should provide a variety of ways for customization through...
  - constructors
  - properties
  - methods

The ```loan``` class contains 2 constructors
- 4 getters
- 3 setters
- The methods for finding the monthly payment and the total payment

-------------------------------------------------
#### Important Pedagogical Tip
Use the UML diagram for the Loan class shown in **10.2** to write a test program that uses the ```Loan``` class even though you don’t know how the ```Loan``` class is implemented. This has three benefits:
- It demonstrates that developing a class and using a class are two separate tasks.
- It enables you to skip the complex implementation of certain classes without interrupting the sequence of this book.
- It is easier to learn how to implement a class if you are familiar with it by using the class.

For all the class examples from now on, create an object from the class and try using its methods before turning your attention to its implementation

----------------------------------
## X.III - Thinking in Objects
Chapter's I - VIII were apparently showing them the techniques for using loops, methods and arrays

Knowing these 3...
- lays a solid foundation for OOP

Classes provide more flexibility and modularity for building reusable software. 

In chapter III.IV there was a program for computing the body mass index (BMI) called ```ComputeAndInterperetBMI.java```
[click here](https://github.com/aalons012/Java-notes/blob/main/COP_2800_and_2805C/Source%20Codes/2805C%20-%20Java%20II/Chapter%20III%20Source%20Codes/ComputeAndInterpretBMI.java)

when you see how its been formated it is only on the ```main``` method
- meaning that it cannot be reused in other programs

Lets change that :))

To make it reusable,
- define a static method to compiute BMI as follows
```
public static void double getBMI(double weight, double height)
```
This is useful for computing the BMI for a specified weight and height but has limitations
> Suppose you need to associate the weight and height with a person’s name and birth date. You could declare separate variables to store these values, but these values would not be tightly coupled.

The Ideal way to couple them is...
- creating an object that contains them all.

Since they are tied to individual objects, they should be stored instance data fields
- you can define a class named ```BMI``` as shown in 10.3

------------------------------------------------------------------
10.3 - The ```BMI``` class encapsulates BMI information
![image](https://github.com/user-attachments/assets/413958f4-8830-45b6-905e-73a67a3510e5)

-------------------------
Assume that the ```BMI``` class is available. ```UseBMIClass.java``` gives a test program that uses this class

-------
### ```UseBMIClass.java```
![image](https://github.com/user-attachments/assets/e1e8ba4c-921c-4b13-bed1-85e2f730d2f2)

Line 3 creates the object for the person "Kim Yang"

Line 7 creates the object for the perosn "Susan King"

and then below creating the objects you get to see the instance methods like ```.get name()```,```.getBMI()```, and ```getStatus()``` to return the BMI's Infromation in both objects

ANNNNDDDDDDDD ```BMI.java``` class can be implemented...dont believe me? look at the program below

-------------------------------------
### ```BMI.java```
> THIS IS HOW I CODE SORRY IF IT LOOKS CONFUSING
> and sorry for being too zoomed out if you cant see [look here]()

![image](https://github.com/user-attachments/assets/5936f3f8-d5ad-4972-9ada-e3dba97a6377)

---------------------------------------
the mathematical formula for computing the BMI uising weight and height is given in 3.8

The instance method 
- ```getBMI()```

Returns BMI

Since the weight and height are instance data fields in the object
- ```getBMI()``` method can use these properties to compute the BMI for the object

The instance method 
- ```getStatus```

Returns a string that interprets the BMI
> This example demonstrates the advantages of the object-oriented paradigm over the procedural paradigm. The procedural paradigm focuses on designing methods. The object-oriented paradigm couples data and methods together into objects. Software design using the object-oriented paradigm focuses on objects and operations on objects. The object-oriented approach combines the power of the procedural paradigm with an added dimension that integrates data with operations into objects

In procedural programming, data and operations on the data are separate, and this methodology requires passing data to methods. Object-oriented programming places data and the operations that pertain to them in an object

This approach solves many of the problems inherent in procedural programming. The object-oriented programming approach organizes programs in a way that mirrors the real world, in which all objects are associated with both attributes and activities. Using objects improves software reusability and makes programs easier to develop and easier to maintain. 

Programming in Java involves thinking in terms of objects; 
- a Java program can be viewed as a collection of cooperating objects

--------------------------------------
## X.IV - Class Relationships
This Section explores:
- association
- aggregation
- composition

The inheritance relation will be introduced in [Chapter 11]()
### X.IV.I - Association
It is a general binary relationship that describes an activity between 2 classes

for Example
>  a student taking a course is an association between the ```Student``` class and the ```Course``` class, and a faculty member teaching a course is an association between the ```Faculty``` class and the ```Course``` class

As these associations can be represented in UML graphical notation, as shown below, 10.4

----------------
10.4 - This UML diagram shows that a student may take any number of courses, a faculty member may teach at most 3 courses, a course may from 5 to 60 students, and a course is taught by only one faculty member

![image](https://github.com/user-attachments/assets/9da79705-eadb-4544-9855-48c0a9c94c84)

-------------------
An association is illustrated by a solid line between 2 classes with an optional label that can describe the relationship. In the Image above, 10.4, the labels are _Take_ and _Teach_. Each relationship may have an optional small black triangle that indicates the direction of the relationship
- In this figure, the ► indicates that a student takes a course (as opposed to a course taking a student).
- Each class involved in the relationship may have a role name that describes the role it plays in the relationship. In Figure 10.4, _teacher_ is the role name for ```Faculty```.
- Each class involved in an association may specify a _multiplicity_, which is placed at the side of the class to specify how many of the class’s objects are involved in the relationship in UML. A multiplicity could be a number or an interval that specifies how many of the class’s objects are involved in the relationship. The character * means an unlimited number of objects, and the interval ```m..n``` indicates that the number of objects is between ```m``` and ```n```, inclusively

In Figure 10.4, each student may take any number of courses, and each course must have at least 5 and at most 60 students. Each course is taught by only one faculty member, and a faculty member may teach from 0 to 3 courses per semester.
- In java
  - you can implement associations by using data fields and methods
    - Example, The relationships in 10.4 may be implemented in 10.5 (image below the texts)
      - The relation “a student takes a course” is implemented using the ```addCourse``` method in the ```Student``` class and the ```addStudent``` method in the ```Course``` class. The relation “a faculty teaches a course” is implemented using the ```addCourse``` method in the ```Faculty``` class and the ```setFaculty``` method in the ```Course``` class. The ```Student``` class may use a list to store the courses that the student is taking, the ```Faculty``` class may use a list to store the courses that the faculty is teaching, and the Course class may use a list to store students enrolled in the course and a data field to store the instructor who teaches the course.
     
--------------------------
10.5 - The associations relations are implemented using data fields and methods in classes

![image](https://github.com/user-attachments/assets/b5d4a0ce-c27a-4293-98fd-9f3706fb98f2)

------------------------
**NOTE** - Many possible implementations

There are many possible ways to implement relationships. 

For example, 
- the student and faculty information in the Course class can be omitted, since they are already in the Student and Faculty class.
  - Likewise, if you don’t need to know the courses a student takes or a faculty member teaches,
    - the data field courseList and the addCourse method in Student or Faculty can be omitted

----------------
### X.IV.II - Aggregartion and Composition
Aggregation
- a special form of association that represents on ownership relationship between 2 objects
- Aggregation models _has-a_ relationship

The **owner** object is called an _aggregating object_, and its class is an _aggregating class_

The **subject** object is called an _aggregated object_, and its class is an _aggregated class_

In java, we refer aggregation between 2 objects as _composition_

if the existance of the aggregated object is dependent on the on the aggregating object. In other words, _if a relationship is composition_ 
- the aggregated object cannot exist on its own

EXAMPLE
-  “a student has a name” is a composition relationship between the ```Student``` class and the ```Name``` class because ```Name``` is dependent on Student,

whereas
- “a student has an address” is an aggregation relationship between the ```Student``` class and the ```Address``` class because an address can exist by itself.

Composition implies exclusive ownership. One object owns another object

When the owner object is destroyed, 
- the dependent object is destroyed as well.

In UML, 
- a filled diamond is attached to an aggregating class...
  - (in this case, ```Student```)
- ...to denote the composition relationship with an aggregated class (```Name```)
- and an empty diamond is attached to an aggregating class (```Student```) to denote the aggregation relationship with an aggregated class (```Address```)

As shown in Figure 10.6.

-------------------
10.6 - Each student has a name and an address

![image](https://github.com/user-attachments/assets/02ee564a-244e-420d-a724-e43ee9ae42d0)

In Figure 10.6, each student has only one multiplicity—address—and each address can be shared by up to 3 students. Each student has one name, and the name is unique for each student

An aggregation relationship is usually represented as a data field in the aggregating class.

EXAMPLE
- the relationships in Figure 10.6 may be implemented using the classes in Figure 10.7 (image Below).
- The relation “a student has a name” and “a student has an address”
  - are implemented in the data field name and address in the ```Student``` class.

---------------------------
10.7 - The Composition relations are implemented using data fields in classes.

![image](https://github.com/user-attachments/assets/94ca8455-ab26-4b59-b762-ae285e22d7c3)

--------
Aggregation may actually exist between objects of the same class

Example,
a person may have a supervisor

As shown in 10.8 ↓↓↓

--------
10.8 - A person may have a supervisor.

![image](https://github.com/user-attachments/assets/15cc3d21-96c7-4ac5-a857-f83051c9a366)

--------
In the realtionship "a person has a supervisor", a supervisor can be represented as a data field in the ```Person``` class, as follows:
```
public class Person {
  // The type for the data is the class itself
  private Person supervior;
}
```
If a person can have several supervisors, you may use an array to store supervisors
- as shown below ↓↓↓

------------------------
10.9 - A person can have several supervisors

![image](https://github.com/user-attachments/assets/a3ee2733-108c-463e-a28a-19ca6715f882)

-----------------------
**IMPORTANT NOTE** - Aggregation or composition
Since aggregation and composition relationships are represented using classes in the same way, we will not differentiate them and call both compositions for simplicity

----------------------
## X.V & VI Case Studies
### X.V - Designing the Course Class
This section designs a class for modeling courses.

> This book’s philosophy is teaching by example and learning by doing. The book provides a wide variety of examples to demonstrate object-oriented programming. This section and the next offer additional examples on designing classes.

Suppose you need to process course information. Each course has a name and has students enrolled. You should be able to add/drop a student to/from the course. You can use a class to model the courses, as shown below ↓↓↓

--------------------------------------
10.10 - The ```Course``` class models the courses.

![image](https://github.com/user-attachments/assets/e4ea8b05-13f2-4b13-8401-63fdf3730267)
> A Course object can be created using the constructor Course(String name) by passing a course name. You can add students to the course using the addStudent(String student) method, drop a student from the course using the dropStudent(String student) method, and return all the students in the course using the getStudents() method. Suppose that the Course class is available;

```TestCourse.java``` gives a test class that creates 2 courses and adds students to them

----------------------------------------
### ```TestCourse.java```

![image](https://github.com/user-attachments/assets/42b46f51-b99e-4064-ab82-c8615dc7d733)
The Course class is implemented in Listing 10.6. 
> It uses an array to store the students in the course. For simplicity, assume the maximum course enrollment is 100. The array is created using new String[100]. The addStudent method adds a student to the array. Whenever a new student is added to the course, numberOfStudents is increased. The getStudents method returns the array. The dropStudent method is left as an exercise.

--------------------------------------
### ```Course.java```

![image](https://github.com/user-attachments/assets/ba06e978-286d-4153-b439-7520d962c581)
> The array size is fixed to be 100, so you cannot have more than 100 students in the course. When you create a Course object, an array object is created. A Course object contains a reference to the array. For simplicity, you can say the Course object contains the array. The user can create a Course object and manipulate it through the public methods addStudent, dropStudent, getNumberOfStudents, and getStudents. However, the user doesn’t need to know how these methods are implemented. The Course class encapsulates the internal implementation. This example uses an array to store students, but you could use a different data structure to store students. The program that uses Course does not need to change as long as the contract of the public methods remains unchanged.

----------
### X.VI - Designing a Class for Stacks
This section designs a class for modeling stacks.

Recall that a stack is a data structure that holds data in a last-in, first-out fashion, as shown in Figure 10.11.

------------
10.11 - A Stack holds data in a last-in, first-out fashion

![image](https://github.com/user-attachments/assets/b7456fba-d035-4773-a39f-0a512b2f8d88)
Stacks have many examples

Example
- the compiler uses a stack to process method invocations. When a method is invoked, its parameters and local variables are pushed into a stack. When a method calls another method, the new method’s parameters and local variables are pushed into the stack. When a method finishes its work and returns to its caller, its associated space is released from the stack.

You can define a class to model stacks. For simplicity, assume the stack holds the int values. Thus, name the stack class StackOfIntegers. The UML diagram for the class is shown in Figure 10.12.

-----------------------
10.12 - The StackOfIntegers class encapsulates the stack storage and provides the operations for manipulating the stack.

![image](https://github.com/user-attachments/assets/ef16db00-c00b-4534-b790-ea98b05418ca)
Suppose the class is available. The test program in Listing 10.7 uses the class to create a stack, store 10 integers 0, 1, 2, . . . , and 9, and displays them in reverse order...hmmmmmm

----------------------
### ```TestStackOfIntegers.java```

![image](https://github.com/user-attachments/assets/c16ac313-b9e1-4f0e-ae23-2a7d094f5196)

How do you implement the StackOfIntegers class? The elements in the stack are stored in an array named elements. When you create a stack, the array is also created. The no-arg constructor creates an array with the default capacity of 16. The variable size counts the number of elements in the stack, and size – 1 is the index of the element at the top of the stack, as shown in Figure 10.13. For an empty stack, size is 0.

------------------
10.3 - The ```StackOfIntegers``` uses an array to store the elements in a stack

![image](https://github.com/user-attachments/assets/4d1f4799-cb12-4a94-bee7-7ce11bb41ced)
The StackOfIntegers class is implemented in Listing 10.8. The methods empty(), peek(), pop(), and getSize() are easy to implement. To implement push(int value), assign value to elements[size] if size < capacity. If the stack is full (i.e., size >= capacity), create a new array of twice the current capacity, copy the contents of the current array to the new array, and assign the reference of the new array to the current array in the stack. Now you can add the new value to the array.

------------
### ```StackOfIntegers.java```

![image](https://github.com/user-attachments/assets/b1074136-ebec-4811-8f53-768886ed5996)

-------------------------
## X.VII - Processing Primitive Data Type Values as Objects
> (At this point im just copying straight from the book)

Owing to perfomance considerations
- Primitive data type values are not objects in Java
  - Because of the overhead of processing objects, the language's performance would be adversely affected IF the primitive data type values were treated as objects
- However
  - many Java methods require the use of objects as arguments


Java offers a convinient way to incorporate, or wrap, a primative data type value to an object

Example - Wrapping an..
- ```int``` into an ```Integer``` object
- ```double``` into an ```Double``` object
- ```char``` into an ```Character``` object

By using a wrapper class.
- you can process data types values as objects

Java provides
- ```Boolean```
  - The ```Boolean``` class wraps a Boolean value ```true``` or ```false```
- ```Charcter```
- ```Double```
- ```Float```
- ```Byte```
- ```Short```
- ```Integer```
- ```Long```

All these wrapper classes can be done in the ```java.lang``` package for primitive data types

---------------------
**NOTE** - Naming Convention

Most wrapper class names for a primitive type are the same as the primitive data type name with the first letter capitalized. The exceptions are 
- ```Integer``` for ```int```
- ```Character``` for ```char```.

---------------------------------
Numeric wrapper classes are very similar to each other. Each contains the methods 
- ```doubleValue()```
- ```floatValue()```
- ```intValue()```
- ```shortValue()```
- ```byteValue()```
  - all these methods "CONVERT" objects into primitive-type values

You can construct a wrapper either from a data type value or from a string representing the numeric value

Like these Examples
```
Double.valueOF(5.0), Double.valueOf("5.0"), Integer.valueOf(5), & Integer.valueOf("5")
```
Wrapper class **DO NOT** have no-arg constructors
- The Instance of **ALL** wrapper classes are immutable
  - Meaning...
    - once the objects are created, **THE INTERNAL VALUES CANNOT BE CHANGED**
> The constructors in the wrapper classes are deprecated in Java 9. You should use the static ```valueOf``` method to create an instance. Java enables frequently used wrapper objects to be reused through the ```valueOf``` method. An instance created using ```valueOf``` maybe shared, which is fine because the wrapper objects are immutable.

Example, from the following code below,
- ```x1 and x2``` are different objects, but ```x3 and x4``` are the same objects created using the ```valueOf``` method. Note that Integer ```x5 = 32```, is same as ```Integer x5 = Integer.valueOf(32)```.
```
Integer x1 = new Integer(“32”);
Integer x2 = new Integer(“32”);
Integer x3 = Integer.valueOf(“32”);
Integer x4 = Integer.valueOf(“32”);
Integer x5 = 32; 
System.out.println(“x1 == x2 is” + (x1 == x2)); // Display false
System.out.println(“x1 == x3 is” + (x1 == x3)); // Display false
System.out.println(“x3 == x4 is” + (x3 == x4)); // Display true
System.out.println(“x3 == x5 is” + (x3 == x5)); // Display true
```
Note that the “frequently used wrapper objects are reused” in Java.
>  Which ones are frequently used are not well defined in Java. In JDK 11, the frequently used wrapper objects are the byte-size integers between −128 and 12 7.

Example, from the following code below,
- ```x1 and x2``` are not the same, although their ```int``` values are the same. However, it is preferred to use the ```valueOf``` method to create instances.
```
Integer x1 = Integer.valueOf("128");
Integer x2 = Integer.valueOf("128");
System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
```
-------------------
Constants

Each numeric wrapper class has the constants MAX_VALUE and MIN_VALUE. MAX_VALUE represents the maximum value of the corresponding primitive data type. For Byte, Short, Integer, and Long, MIN_VALUE represents the minimum byte, short, int, and long values. Float and Double, MIN_VALUE represents the minimum positive float and double values.
- The following statements display the maximum integer (2,147,483,647), the minimum positive float (1.4E–45), and the maximum double floating-point number (1.79769313486231570e + 308d):
```
System.out.println("The maximum integer is " + Integer.MAX_VALUE);
System.out.println("The minimum positive float is " +
 Float.MIN_VALUE);
System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);
```
-----------------------
Conversion methods

Each numeric wrapper class contains the methods doubleValue(), floatValue(), intValue(), longValue(), and shortValue() for returning a double, float, int, long, or short value for the wrapper object.

EXAMPLE
```
Double.valueOf(12.4).intValue() returns 12;
Integer.valueOf(12).doubleValue() returns 12.0;
```
---------------
```compareTo``` Method

Recall the String class contains the compareTo method for comparing two strings. The numeric wrapper classes contain the compareTo method for comparing two numbers and returns 1, 0, or –1, if this number is greater than, equal to, or less than the other number.

For Example,
```
Double.valueOf(12.4).compareTo(Double.valueOf(12.3)) returns 1;
Double.valueOf(12.3).compareTo(Double.valueOf(12.3)) returns 0;
Double.valueOf(12.3).compareTo(Double.valueOf(12.51)) returns –1;
```
------------------
Static ```valueOf``` mathods

The numeric wrapper classes have a useful static method, valueOf(String s). This method creates a new object initialized to the value represented by the specified string. 

For Example,
```
Double doubleObject = Double.valueOf("12.4");
Integer integerObject = Integer.valueOf("12");
```
------------------------
static parsing methods

You have used the parseInt method in the Integer class to parse a numeric string into an int value and the parseDouble method in the Double class to parse a numeric string into a double value. Each numeric wrapper class has two overloaded parsing methods to parse a numeric string into an appropriate numeric value based on 10 (decimal) or any specified radix 

(e.g., 2 for binary, 8 for octal, and 16 for hexadecimal).
```
// These two methods are in the Byte class
public static byte parseByte(String s)
public static byte parseByte(String s, int radix)

// These two methods are in the Short class
public static short parseShort(String s)
public static short parseShort(String s, int radix)

// These two methods are in the Integer class
public static int parseInt(String s)
public static int parseInt(String s, int radix)

// These two methods are in the Long class
public static long parseLong(String s)
public static long parseLong(String s, int radix)

// These two methods are in the Float class
public static float parseFloat(String s)
public static float parseFloat(String s, int radix)

// These two methods are in the Double class
public static double parseDouble(String s)
public static double parseDouble(String s, int radix)
```
For Example
```
Integer.parseInt("11", 2) returns 3;
Integer.parseInt("12", 8) returns 10;
Integer.parseInt("13", 10) returns 13;
Integer.parseInt("1A", 16) returns 26;
```
Integer.parseInt("12", 2) would raise a runtime exception because 12 is not a binary number

----------------
Converting decimal to hex

Note you can convert a decimal number into a hex number using the format method

For Example
```
String.format("%x", 26) returns 1A;
```
------------------------------------
## X.VIII - Automatic Conversion between Primitive Types and Wrapper Class Types

Converting a perimitive value to a wrapper object is called **_Boxing_**
- The Reverse conversion is called Unboxing.

Java allows primitive types and wrapper classes to be converted automatcally.
- The compiler will automatically box a primitive value that appears in a context requiring an object, and unbox an object that appears in a contex requiring a primitive value.
  - This is called _AutoBoxing & Auto**UN**boxing_

For Instance,
- the following statement in (a) can be simplified as in (b) using autoboxing.The following statement in (a) is the same as in (b) due to autounboxing.

![image](https://github.com/user-attachments/assets/cc90f3c5-707d-4a70-a9cb-78e520f457f6)

Consider this as the example ↓↓↓
![image](https://github.com/user-attachments/assets/b9039d2b-22d0-4d8b-8494-02b7ecabfbc0)
```
Integer[] intArray = {1, 2, 3};
System.out.println(intArray[0] + intArray[1] + intArray[2]);
```
In line 1, the primitive values 1, 2, and 3 are automatically boxed into objects Integer. valueOf(1), Integer.valueOf(2), and Integer.valueOf(3). In line 2, the objects intArray[0], intArray[1], and intArray[2] are automatically unboxed into int values that are added together.

------------------------
## X.IX - The BigInteger and BigDecimal Classes

By any chance if you need to compute a B I G number, oh, sorry, Integers, or high-precision floating point-values, you can use these 2 classes in the ```java.Math``` package
- ```BigInteger```
- ```BigDecimal```
  - THEY ARE BOTH IMMUTUABLE
 
Just a reminder
- the largest integer of the ```Long``` type is ```Long.MAX_VALUE``` (i.e., 9223372036854775807)

An instance of ```BigInteger```
- can represent an integer of **ANY** size LIKE
  - ```new BigInteger(String)```
  - ```BigInteger.valueOf(long)```
 
And Same goes to ```BigDecimal``` (it can be either or)
- new BigDecimal(String)
- BigDecimal.valueOf(double)

use the add, subtract, multiply, divide, and remainder methods to perform arithmetic operations, and use the compareTo method to compare two big numbers.

Like this code below ↓↓↓
```
BigInteger a = new BigInteger("9223372036854775807");
BigInteger b = new BigInteger("2");
BigInteger c = a.multiply(b); // 9223372036854775807 * 2
System.out.println(c);

OUTPUT:
 18446744073709551614
```
There is no Limit to the precision of a ```BigDecimal``` object
- the ```divide``` method may throw an ```artithmeticException```if the result cannot be determined.
- however,
  - youcan use the overloaded ```divide(BigDecimal d, int scale, RoundingMode roundingMode)``` method to specify a scale and a rounding mode to avoid this exception
    - where ```scale``` is the maximum number of digits after the decimal point

Example, the following code below  creates two BigDecimal objects and performs division with scale 20 and rounding mode RoundingMode.HALF_UP:
```
BigDecimal a = new BigDecimal("1.0");
BigDecimal b = new BigDecimal("3");
BigDecimal c = a.divide(b, 20, RoundingMode.HALF_UP);
System.out.println(c);

Output is 0.33333333333333333333333333334
```
Note the factorial of an integer can be very large. ```LargeFactprial.java``` gives a method that can return 
the factorial of any integer.

BUT BEFORE LOOKING AT THE CODE

NOTE THIS

-------
**NOTE** - ```BigDecimal(String)``` vs ```BigDecimal(Double)```

You can create a ```BigDecimal``` using either ```new BigDecimal(String)``` or ```new BigDecimal(double)```. Since a double value is approximated, so the result from ```new BigDecimal(double)``` is unpredictable. For example, ```new BigDecimal("1.0")``` is not ```1.0```, but is actually ```0.1000000000000000055511151231257827021181583404541015625```. Therefore, it is a good idea to use ```new BigDecimal(String)``` to obtain a predictable ```BigDecimal```.

-------------------------------------
### ```LargeFactorial.java```

![image](https://github.com/user-attachments/assets/5ad2613e-ba47-423b-93b1-6b035cd39532)
> ```BigInteger.ONE``` is a constant defined in the ```BigInteger``` class. ```BigInteger.ONE``` is the same as new ```BigInteger("1")```.
> A new result is obtained by invoking the multiply method.

---------------------------------
## X.X - The String Class
Strings were Introdued in **IV.IV**
- by now you should know that strings are objects.

You can invoke the ```charAt(index)``` Method to obtain a character at the specified index from a string

The ```length()``` method to return the size of a string

The ```indexOf``` and ```lastindexOf``` methods to return the first or last last index of a matching character or a substring

The ```equals``` and ```compareTo``` methods to compare two strings

&

The ```trim()``` method to trim whitespace characters from the two ends of a string

&

The ```toLowerCase()``` and ```toUpperCase()```  methods to return the lowercase and uppercase from a string.

The ```String``` class has **13 Constructors and more than 40 methods** for manipulating strings

Not only is that useful in programming
- its a good example for learning classes and objects.

You can createa string object from a string literal or from an array of characters.
- to create a string from a string literal, **USE THIS**
```
String newString = new String(stringLiteral);
```
> The argument stringLiteral is a sequence of characters enclosed in double quotes

The following statement creates a String object message for the string literal "Welcome to Java":
```
String message = new String("Welcome to Java");
```
Java treats a string literal as a ```String``` object. Thus, the following statement is valid:
```
String message = "Welcome to Java";
```
You can also create a string from an array of characters. LIKE the code below create the String "Good Day":
```
char[] = charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
String message = new String(charArray);
```
---------------------------------
**NOTE** - ```String``` Variable, ```String``` object, & ```String``` value

A String variable holds a reference to a String object that stores a string value. Strictly speaking, the terms String variable, String object, and string value are different, but most of the time the distinctions between them can be ignored. For simplicity, the term string will often be used to refer to String variable, String object, and string value

----------------------------
### X.X.I - Immutuable Strings and Interned Strings
A ```String``` object is immutable
- its contents CANNOT be changed

so uhhh

does this code change the contents of the String?
```
String s = "Java";
s = "HTML";
```
i swear if you said yes

...

NO!!!!!!!!!!

It cannot be changed

Why??
- The first statement creates a String object with the content "Java" and assigns its reference to s. 
- The second statement creates a new String object with the content "HTML" and assigns its reference to s.
- The first String object still exists after the assignment, but it can no longer be accessed, because variable s now points to the new object.

do you need a picture this too...fine look at 10.5 (Image Below ↓↓↓)

------------------------------
10.5 - Strings are immutable; once created, their contents cannot be changed
![image](https://github.com/user-attachments/assets/04b54b14-e5d1-4c10-9178-c1e716df0b20)

------------------------------------
Because strings are immutable and are ubiquitous in programming
- the JVM uses a unique instance for string literals with the same character sequence in order to improve efficiency and save memory.
  - Such an instance is called an interned string.
  
For example, the following statements:
![image](https://github.com/user-attachments/assets/1f80530f-2604-4f8d-b45f-c7fe4aa55b68)
```
OUTPUT:

s1 == s2 is false
s1 == s3 is true
s2 == s4 is false
```
In the preceding statements, ```s1``` and ```s3``` refer to the same interned string—```"Welcome to Java"```—so ```s1 == s3``` is ```true```. However, ```s1 == s2``` is ```false```, because ```s1``` and ```s2``` are two different string objects, even though they have the same contents. ``` S2 == s4``` is also false, because ```s2``` and ```s4``` are two different string objects. 

-----------------------------------
**TIP**

You can create a ```String``` using new ```String(stringLiteral)```. However, this is inefficient because it creates an unnecessary object. You should always simply use the ```stringLiteral```. For example, use ```String s = stringLiteral```; rather than ```String s = new String(stringLiteral)```;

-------------------------------
### X.X.II - Replacing And Splitting Strings
The ```String``` class provides the methods for replacing and splitting Strings, as shown in 10.16

-----------------------------------
10.16 - The ```String``` class contains the methods for replacing and splitting strings.

![image](https://github.com/user-attachments/assets/0cc70051-1263-48f7-b0d1-c4aa0656a39a)

-------------------------------------
Once a String is created
- IT CANNOT BE CHANGED

Methods
- ```replace```
- ```replaceFirst```
- ```replaceAll```

These 3 return a new string derived from the original string 
- WITHOUT CHANGING THE ORIGINAL STRING!

There are several versions of the ```replace``` methods are provided to replace a character or a substring in the string with a new character or a new substring

EXAMPLE
```
"Welcome".replace('e', 'A') returns a new string, WAlcomA.
"Welcome".replaceFirst("e", "AB") returns a new string, WABlcome.
"Welcome".replace("e", "AB") returns a new string, WABlcomAB.
"Welcome".replace("el", "AB") returns a new string, WABcome.
"Welcome".replaceAll("e", "AB") returns a new string, WABlcomAB.
```
> Note that ```replaceAll(oldStr, newStr)``` is the same as ```replace(oldStr, newStr) ``` when used to replace all oldStr with newStr.

The ```Split``` method
- can be used to ectract tokens from a string with the specified delimiters

Like this code right Below ↓↓↓
```
String[] tokens = "Java#HTML#Perl".split("#");
for (int i = 0; i < tokens.length; i++)
 System.out.print(tokens[i] + " ");

OUTPUT:

Java HTML Perl
```
--------------------------------
### X.X.III - Matching, Replacing, And Spittling by Patterns
Often you will need to write code that validates user input
- How do you write this type of code?
  - A simple and effective way to accomplish this task is to use the regular expression
 
Regular Expression
- a string that describes a pattern for matching a set of strings.

You can...
- match
- replace
- split

... a string by specifying a pattern. This is an extremely useful and powerful feature

soo

Lets start withthe matches method in the String class. At first glance, the matches
method is very similar to the equals method. For example, the following two statements both evaluate to true
```
"Java".matches("Java");
"Java".equals("Java");
```
However, the matches method is more powerful. It can match not only a fixed string, but 
also a set of strings that follow a pattern. For example, the following statements all evaluate to true:
```
"Java is fun".matches("Java.*")
"Java is cool".matches("Java.*")
"Java is powerful".matches("Java.*")
```
Java.* in the preceding statements is a regular expression. It describes a string pattern that begins with Java followed by any zero or more characters. Here, the substring matches any zero or more characters.
- The following statement evaluates to true:
```
"440–02–4534".matches("\\d{3}–\\d{2}–\\d{4}")
```
Here, \\d represents a single digit, and \\d{3} represents three digits.
The replaceAll, replaceFirst, and split methods can be used with a regular 
expression. 

For example, the following statement returns a new string that replaces $, +, or #
in a+b$#c with the string NNN.
```
String s = "a+b$#c".replaceAll("[$+#]", "NNN");
System.out.println(s);
```
Here, the regular expression [$+#] specifies a pattern that matches $, +, or #. Thus, the output is aNNNbNNNNNNc.
- The following statement splits the string into an array of strings delimited by punctuation marks.
```
String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
for (int i = 0; i < tokens.length; i++)
 System.out.println(tokens[i]);
```
In this example, the regular expression [.,:;?] specifies a pattern that matches ., ,, :, ;, or ?. Each of these characters is a delimiter for splitting the string. Thus, the string is split into Java, C, C#, and C++, which are stored in array tokens.
Regular expression patterns are complex for beginning students to understand. For this reason, simple patterns are introduced in this section. Please refer to Appendix H, Regular Expressions, to learn more about these patterns.

------------------
### X.X.IV - Conversion between Strings and Arrays
Strings are not arrays, but a string can be converted into an array and vice versa. To convert a string into an array of characters, use the toCharArray method. 

For example, the following statement converts the string Java to an array:
```
char[] chars = "Java".toCharArray();
```
Thus, chars[0] is J, chars[1] is a, chars[2] is v, and chars[3] is a.

You can also use the getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) method to copy a substring of the string from index srcBegin to index srcEnd–1 into a character array dst starting from index dstBegin. 

For example, the following code copies a substring "3720" in "CS3720" from index 2 to index 6–1 into the character array dst starting from index 4:
```
char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
"CS3720".getChars(2, 6, dst, 4);
```
Thus, dst becomes {'J', 'A', 'V', 'A', '3', '7', '2', '0'}.

To convert an array of characters into a string, use the String(char[]) constructor or the valueOf(char[]) method. 

For example, the following statement constructs a string from an array using the String constructor:
```
String str = new String(new char[]{'J', 'a', 'v', 'a'});
```
The next statement constructs a string from an array using the valueOf method.
```
String str = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
```
---------------------
### X.X.V - Converting Characters and Numeric Values to Strings
Recall that you can use Double.parseDouble(str) or Integer.parseInt(str) to convert a string to a double value or an int value, and you can convert a character or a number into a string by using the string concatenating operator. Another way of converting a number into a string is to use the overloaded static valueOf method.

This method can also be used to convert a character or an array of characters into a string, as shown in Figure 10.17.

---------------------------------
10.17 - The String class contains the static methods for creating strings from primitive-type values
![image](https://github.com/user-attachments/assets/79dd02ea-837f-4916-aeda-48496c75a57a)
> For example, to convert a double value 5.44 to a string, use String.valueOf(5.44). The return value is a string consisting of the characters '5', '.', '4', and '4'.

----------------------------------
### X.X.VI - Formatting Stage
The String class contains the static format method to return a formatted string. The syntax to invoke this method is
```
String.format(format, item1, item2, ..., itemk);
```
This method is similar to the printf method except that the format method returns a formatted string, whereas the printf method displays a formatted string. 

For example,
```
String s = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
System.out.println(s)
```
displays:
![image](https://github.com/user-attachments/assets/8118ad8d-d6d4-4bfa-9bee-31885c1321f3)

where the square box ![image](https://github.com/user-attachments/assets/16378491-8b75-43ac-84b1-c1e66692e6fd)
 denotes a blank space.

------------------------------------------
**Note**
```
System.out.printf(format, item1, item2, ..., itemk);
```
is equivalent to
```
System.out.print(
 String.format(format, item1, item2, ..., itemk));
```
----------------------------
## X.XI - The StringBuilder and StingBufferClasses
In general, the StringBuilder and StringBuffer classes can be used wherever a string is used. StringBuilder and StringBuffer are more flexible than String. You can add, insert, or append new contents into StringBuilder and StringBuffer objects, whereas the value of a String object is fixed once the string is created. The StringBuilder class is similar to StringBuffer except that the methods for modifying the buffer in StringBuffer are synchronized, which means that only one task is allowed to execute the methods. Use StringBuffer if the class might be accessed by multiple tasks concurrently, because synchronization is needed in this case to prevent corruptions to StringBuffer. Concurrent programming will be introduced in Chapter 32. Using StringBuilder is more efficient if it is accessed by just a single task, because no synchronization is needed in this case. The constructors and methods in StringBuffer and StringBuilder are almost the same. This 
section covers StringBuilder. You can replace StringBuilder in all occurrences in this 
section by StringBuffer. The program can compile and run without any other changes.
The StringBuilder class has three constructors and more than 30 methods for managing the 
builder and modifying strings in the builder. You can create an empty string builder using new StringBuilder() or a string builder from a string using new StringBuilder(String), as shown in Figure 10.18

----------------------------------------------
10.18 - The StringBuilder class contains the constructors for creating instances of StringBuilder
![image](https://github.com/user-attachments/assets/7b629e32-8ae2-4929-b8e9-1bdcde326288)

---------------
### X.XI.I - Modifying Strings in the StringBuilder
You can append new contents at the end of a string builder, insert new contents at a specified position in a string builder, and delete or replace characters in a string builder, using the methods listed in Figure 10.19

-----------------------------
10.19 - The StringBuilder class contains the methods for modifying string builders.
![image](https://github.com/user-attachments/assets/bac99b91-1cc4-4374-b8d0-99f8bdebc492)

------------------
The StringBuilder class provides several overloaded methods to append boolean, 
char, char[], double, float, int, long, and String into a string builder. 

For example, the following code appends strings and characters into stringBuilder to form a new string, Welcome to Java:
```
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Welcome");
stringBuilder.append(' ');
stringBuilder.append("to");
stringBuilder.append(' ');
stringBuilder.append("Java");
```
The StringBuilder class also contains overloaded methods to insert boolean, char, char array, double, float, int, long, and String into a string builder. Consider the following code:
```
stringBuilder.insert(11, "HTML and ");
```
Suppose stringBuilder contains Welcome to Java before the insert method is applied. This code inserts "HTML and " at position 11 in stringBuilder (just before the J). The new stringBuilder is Welcome to HTML and Java.

You can also delete characters from a string in the builder using the two delete methods, 
reverse the string using the reverse method, replace characters using the replace method, 
or set a new character in a string using the setCharAt method.

For example, suppose stringBuilder contains Welcome to Java before each of the 
following methods is applied:
```
stringBuilder.delete(8, 11) changes the builder to Welcome Java.
stringBuilder.deleteCharAt(8) changes the builder to Welcome o Java.
stringBuilder.reverse() changes the builder to avaJ ot emocleW.
stringBuilder.replace(11, 15, "HTML") changes the builder to Welcome to HTML.
stringBuilder.setCharAt(0, 'w') sets the builder to welcome to Java.
```
All these modification methods except setCharAt do two things:
1. Change the contents of the string builder
2. Return the reference of the string builder

For example, the following statement:
```
StringBuilder stringBuilder1 = stringBuilder.reverse();
```
reverses the string in the builder and assigns the builder’s reference to stringBuilder1. Thus, 
stringBuilder and stringBuilder1 both point to the same StringBuilder object. Recall 
that a value-returning method can be invoked as a statement, if you are not interested in the return value of the method. In this case, the return value is simply ignored. 

For example, in the following statement:
```
stringBuilder.reverse():
```
the return value is ignored. Returning the reference of a StringBuilder enables the StringBuilder methods to be invoked in a chain such as the following:
```
stringBuilder.reverse().delete(8, 11).replace(11, 15, "HTML");
```
----------------------
**TIP** - String or String StringBuilder?

If a string does not require any change, use String rather than StringBuilder. String is more efficient than StringBuilder.

------------------------------------
### X.XI.II - The toString, capacity, length, setLength, and charAt Methods

The StringBuilder class provides the additional methods for manipulating a string builder and obtaining its properties, as shown in Figure 10.20

------------------------------
10.20 - The StringBuilder class contains the methods for modifying string builders.
![image](https://github.com/user-attachments/assets/8a2f5cfe-2aae-493b-9bf2-865f68fff1ff)

----------------------------------
The capacity() method returns the current capacity of the string builder. The capacity 
is the number of characters the string builder is able to store without having to increase its size.

The length() method returns the number of characters actually stored in the string 
builder. The setLength(newLength) method sets the length of the string builder. If the 
newLength argument is less than the current length of the string builder, the string builder is truncated to contain exactly the number of characters given by the newLength argument. If the newLength argument is greater than or equal to the current length, sufficient null characters (\u0000) are appended to the string builder so length becomes the newLengthargument. The newLength argument must be greater than or equal to 0.

The charAt(index) method returns the character at a specific index in the string builder. 
The index is 0 based. The first character of a string builder is at index 0, the next at index 1, and so on. The index argument must be greater than or equal to 0, and less than the length of the string builder

--------------------
**NOTE** - Length and capacity 

The length of the string builder is always less than or equal to the capacity of the builder. The length is the actual size of the string stored in the builder, and the capacity is the current size of the builder. The builder’s capacity is automatically increased if more characters are added to exceed its capacity. Internally, a string builder is an array of characters, so the builder’s capacity is the size of the array. If the builder’s capacity is exceeded, the array is replaced by a new array. The new array size is 2 * (the previous array size + 1)

---------------------------------
**TIP** - Initial capacity

You can use new StringBuilder(initialCapacity) to create a StringBuilder with a specified initial capacity. By carefully choosing the initial capacity, you can make your program more efficient. If the capacity is always larger than the actual length of the builder, the JVM will never need to reallocate memory for the builder. On the other hand, if the capacity is too large, you will waste memory space. You can use the trimToSize() method to reduce the capacity to the actual size

-------------------------------------
# Chapter XIII 
yeah no i fucking give up fuck this shiit man
Look at the Outlines
