CONCEPT: ++ and −− are operators that add and subtract one from their operands.

To increment a value means to increase it by one, and to decrement a value means to decrease it by one. Both of the following statements increment the variable number:
```
number = number + 1;
number += 1;
```
And number is decremented in both of the following statements:
```
number = number - 1;
number -= 1;
```
Java provides a set of simple unary operators designed just for incrementing and decrementing variables. The increment operator is ```++``` and the decrement operator is ```−−```. The following statement uses the ```++``` operator to increment number:
```
number++;
```
And the Following decrements number;
```
number--;
```
and to pronoune this is just how you expect it to be
```
number++ = number plus plus
number-- = number minus minus
```
Now lets Break it down

The program in the code below demotrates how ```++``` and ```--```works
```
public class IncrementDecrement
{ 
   public static void main(String[] args)           
       int number = 4; // number starts out with 4  
   
       // Display the value in number. 
       System.out.println("number is " + number);  
       System.out.println("I will increment number."); 
   
       // Increment number. 
       number++;                 
   
       // Display the value in number again. 
       System.out.println("Now, number is " + number); 
       System.out.println("I will decrement number."); 
   
       // Decrement number. 
       number--; 
   
       // Display the value in number once more. 
       System.out.println("Now, number is " + number); 
   } 
}

OUTPUT:

number is 4
I will increment number.
Now, number is 5
I will decrement number.
Now, number is 4

```
The program show the increment and decrement operators used in postfix mode, which means the operator is placed after the variable. The operators also work in prefix mode, where the operator is placed before the variable name as follows:
```
++number;
--number;
```
In both postfix and prefix mode, these operator add one to or subtract one from operand.
```
public class Prefix  
 {  
    public static void main(String[] args)  
    { 
       int number = 4; // number starts out with 4 
   
       // Display the value in number. 
       System.out.println("number is " + number); 
       System.out.println("I will increment number."); 
   
       // Increment number. 
       ++number; 
   
       // Display the value in number again. 
       System.out.println("Now, number is " + number); 
       System.out.println("I will decrement number."); 
   
       // Decrement number. 
       --number; 
   
       // Display the value in number once again. 
       System.out.println("Now, number is " + number); 
    } 
}

OUTPUT:

number is 4
I will increment number.
Now, number is 5
I will decrement number.
Now, number is 4

```

The Difference between Postfix and Prefix Modes
=================================================

