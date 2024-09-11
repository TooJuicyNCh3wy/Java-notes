# Java Syntax
i the last doc ```W3 Schools/1 - Java Tutorial/Intro.md```, we created a file called 
```
Main.java
```
and we used the following code to print ```Hello World``` to the screen:

--------------
**Main.java**
```
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
----------------
# Example explained

Every line of code that runs in Java must be inside a ```class```.
- The class name SHOULD ALWAYS Start with an Uppercase first letter

like the code above...```Main``` is the pefect example (Line 1)

---------------------------------
**Note:**

Java is case-sensitive: ```"MyClass"``` and ```"myclass"``` has different meaning.

---------------------------------

The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename.

The output should be:
```
Hello World
```
---------------------------
# Main Method
the main method is required and you will see it in EVERY Java Program

```
public static void main(String[] args)
```
Any code inside the ```main()``` method will be executed. 

DO NOT WORRY ABOUT THE KEYWORDS BEFORE AND AFTER...you'll get to know them hit by bit while reading here :))

For now, just remember that every Java Program has a ```class``` name which must match the```filename```, and that every program must contain the ```main()``` method.

------------------------------------------
# System.out.println()

inside the ```main()``` method, can use the ```println()``` method to print a line of text to the screen
```
  public static void main(String[] args) {
      System.out.println("Hello World");
}
```

---------------------------------------------------------
**Note:** te curly braces ```{}``` marks the beginning and the end of a block of the code.
