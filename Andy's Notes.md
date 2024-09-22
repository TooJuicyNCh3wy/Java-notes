# COP 2800 & 2805C - Java I & II Notes
## Vocabulary
### A 
### B
Byte
- A group of binary digit or bits operated on as a bit
  - For bit it's usually eight
### C
Class
1. A set of objects which shares common characteristics/behavior and common properties/attributes
2. A blueprint for creating objects. It defines the properties and behaviors that the objects from the class will have.

Computer
- an Electric device that stores and process data

Console Inpute
- to recieve input into form the keyboard

Console Output
- to display output on the monitor 

Console
1. provides information about the Java version, user directory, and any error message that occurs while running an applet or application
2. an old computer term that refers to the text entry and display device of a computer.

Core
- is the part of the processor that performs the reading and executing of instructions.

### D 
### E
Encoding scheme 
- a set of rules that govern how a computer translates characters and numbers into data with which the computer can actually work. 
### F 
### G 
### H 
### I 
### J
Java Application Program Interface (API)
- a Set of predefined reules and specifications for accessing a web-based software applications or web tool

Java Language Specification
1. a Technical definition of the Java Programming
2. It Describes all aspects of the language, including the semantics of all types, statements, and expressions, as well as threads and binary compatibility

Java Development Kit (JDK)
- a Cross-platformed software development environment that offers a collection of tools and libraries necessary for developing Java-based software applications and applets.

Java Runtime Environment (JRE)
- a software layer that allows Java programs to run on any operating system wihout modification

Java Virtual Machine
- A runtime environment that allows Java Programs to run on different operating systems and platforms. Its am integral part of the **JRE**

### K 
### L
Line Numbers
- are for reference purposes only; they are not part of the program.
### M
Multicore
- is a single component with two or more independent cores.
### N 
### O
### P
Program & Programming
- To Create/Develop Software
### Q
### R
Random Access memory (RAM)
- A computer’s short term memory that stores data needed to run applications and open files
### S
Software
1. Contains instructions that tell a computer what to do
    - Or a computerized device
2. A set of instructions, data or programs that allow a computer to perform tasks
### T
### U
### V
### W
### X
### Y
### Z

# Key Points
## Chapter 1
- The Central theme of this is to learn how to solve problems by writing a progra
- A Computer is an Electric device that stores and process data
- Computer programs, known as Software, are instructors that tell a computer what to do
- The Operating System (OS) is the most important program that runs on a computer. The OS manages and controls a computer activities
- Java is a powerful and versatile programming language for developing software running on mobile devices, desktop computers, and servers
- Java Syntax is defined in the java language specification, and the Java library is defined inthe Java application program interface (API). The JDK is the software for compiling and running java programs. An IDE in integrated development environment for rapidly developing programs.
- A Java Program is executed from thr ```main``` method in the class
## Chapter 10
- The focus of this chapter is on class design and to explore the differences between procedural programming and object-oriented programming

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
   
------------------------------------------------------
# Chapter X - Object-oriented Thinking

