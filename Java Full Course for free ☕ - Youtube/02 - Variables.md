# Variables
A Place holder for a value that behaves as the value it contains

remember back in the school days of algebra where it would only have variables for numbers? 

its like that

but 
now adding words, texts and this below is called boolean
- Boolean
  - values which hold either true or false
```
x = 12
y = "Andy"
z = True
```

 # Data Types
 ```
Data Type  Size    Primitive / Reference    value
====================================================
*boolean   1 Bit         Primitive          True or false
byte       1 byte        Primitive          -128 to 127
short      2 bytes       Primitive          -32,768 to 32,767
*int       4 bytes       Primitive          -2 Billion to 2 Billion
long       8 bytes       Primitive          -9 Quintillion to 9 Quintillion
float      4 bytes       Primitive          Fractional number up to 6-7 Digits (3.141592f)
*double    8 bytes       Primitive          Fractional number up to 15 Digits
*char      2 bytes       Primitive          Single character/letter/ASCII Value (Ex. 'f')
*string    varies        Reference          A sequence of characters (ex. "Hello World!")
```
 There are 8 data types and a special reference data type called a string 
 the ones with the * are the more important ones

# Primitive VS Reference
Primitive
- 8 Types
  - boolean
  - byte
  - short
  - int
  - long
  - float
  - double
  - char
- stores data
- can only hold 1 value
- less memory
- fast
-------------
Reference
- unlimited
  - user defined
- stores an address
- could hold more that 1 value
- more memory
- slower

# how to make a Variable on the Compiler
```
int x; // Declaration
x = 123; // Assignment

OR

int x = 123; // initialization
```
either or is good :)
we could print this to the console window within a print or print line statement

with the classic
```
system.out.print();
```
but however in between the parentheses it shouldnt be with quotes 

instead it should be like this
```
system.out.print(x);
```
just remember not to put " " between the variable

however

you can add quotes with words and the variable within the same parenthesis
```
system.out.print("My Number is: " + x);

OUTPUT:

My Number is: 123

```
and remember that the largest that "int" can go is 2,000,000,000 (Billion) 

sooo

lets try going over the INT 's limit by going over 2 Billion
```
int x = 1232381590147713921790;
```
because its over 2 billion it wouldn t be read and would output an error code

sooo

we need to change int to long
```
long x = ...L;
```
with "LONG" we can now output a large number and for some reason you have to end with Capital "L" at the end

now lets go to a smaller input

"byte"

**REMEMBER**

byte stores a much smaller number than "long" and "int" so with "byte" we can only put numbers from -128 to 127 as shown below: 
```
byte x = 100;
```
so like literallly put a number above 127, like 130 it would output an error

...

god why even bother showing byte if we barely ever use this for a beginner because its just way more convinient to just use ```int``` 

However you might have to use ```long``` every once in a while but as beginners, we're mostly going to be sticking with intergers 

For ```double```, it would with decimals for ```int``` it would'nt be able to read the decimal giving us an error

```
int x = 123.01

OUTPUT:

ERROR!
```
but with a double or a float having a decimal number it does not affect them at all...soo lets give it a shot

```
public class Main {

  public static void main(String[] args){

    int x = 123;
    float y = 3.14f;

    System.out.println(y);

  }

}
```
a common convention for assigning numbers/values to ```float``` variables is that IT HAS TO END WITH A LOWER CASE F. So that you can store a number with a decimal portion wihin a float or a double.

now lets add it in the code source

```
public class Main {

  public static void main(string[] args){

    int x = 123;
    double y = 3.14;

    System.out.println(y);

  }

}
```
And as you can see you dont need a letter at the end of the number

just the decimal

nothing much

nothing else

----------------------

now for boolean...remember that you only have to only put either ```true``` or ```false```

and whenever we put that in our code source
```
boolean z = false;

System.out.println(z);

output:

false

```
And those are the ONLY 2 it can output 
EITHER
- True
- False

and that is it

----------------------

We Have Characters

```char``` for short 
we dont necessarily need to come up with a variable that's only one letter, we could have a name of something that is descriptive for ```char```

lets say we have a variable called ``` "symbol" ``` 

soo
```
char symbol = '@'; // within single quotes
```
so now we have 
- a variable called ```symbol``` that contains the @ sign

So,

if i were to display this variable symbol to the console window... I would have to put symbol in the parentheses on the ```System.out.println()```

outputing the symbol that was on single quotes...

as shown below
```
public class Main {
  public static void main{String[] args){

      char symbol = '@';

      System. out.println(symbol);
      }
}
OUTPUT:

@
```
and now we have ```string```, the thing about string is that it starts with a capital ```S``` instead of the other commands being lower cased...And also its a reference data type

ANYTHING THAT IS A REFERENCE DATA TYPE BEGINS WITH A CAPITAL LETTER

lets try it out shall we?

Look down below
```  
public class Main {

    public static void main (String[] args){

    String name = "Andy"

    System.out.println(name);
    }
}
OUTPUT:

Andy
```
You can also add quotes to the console window as well

like
```
    System.out.println("Hi "+name);
```
Let Me Explain What i just did
- I Added the Double Quotes to addd text to the console window to output the text thats inside the "" marks
- added the plus for basically saying "add this as well"
- and the "name" is the command that under the command ```String```

