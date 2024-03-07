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
Data Type___Size___Primitive / Reference___value
*boolean   1 Bit   Primitive      True or false
byte       1 byte  Primitive      -128 to 127
short      2 bytes Primitive      -32,768 to 32,767
*int       4 bytes Primitive      -2 Billion to 2 Billion
long       8 bytes Primitive      -9 Quintillion to 9 Quintillion

float      4 bytes Primitive      Fractional number up to 6-7 Digits (3.141592f)
*double    8 bytes Primitive      Fractional number up to 15 Digits

*char      2 bytes Primitive      Single character/letter/ASCII Value (Ex. 'f')
*string    varies  Reference      A sequence of characters (ex. "Hello World!")
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
x = 12; // assignment
OR

int x = 12; // initialization
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
and remember taht the largest that "int" can go is 2,000,000,000 (Billion) 

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

REMEMBER

byte stores a much smaller number than "long" and "int"

so with "byte" we can only put numbers from -128 to 127

as shown below: 
```
byte x = 100;
```
so like literallly put a number above 127, like 130

it would output an error

...

god why even bother showing byte if we barely ever use this for a beginner because its just way more convinient to just use "int" 
