WHAT IS JDK?
===============
JDK - (Java Development Kit) developers tool
- JRE - (Java Runtime Env.) Libraries
	- JVM - (Java Virtual Machine) Runs Java programs


WHAT IS IDE?
===============
- I - Intergrated
- D - Development
- E - Environment

(Software that help us Software)


STARTING A PROJECT
=====================
once starting your project it would start as is:

```
public class Main {

	public static void main(String[] args) {
		// TODO Auto-Generated method stub

	}

}
```

Without the inside code for "public class Main" the java code would not run at all no matter if it has codes inside it wont run without, Which is called 
"The Main Method".

	public static void main(String[] args) { }

in order to output anything on code you would have to put this code:

	System.out.Print("");


Coding Inputs & Outputs
==========================

with the parentheses you can add any text inside the parentheses and quotes.
soo like type any food you like as an example you would do this:

	System.out.Print("I love pizza");

also every code have to end with ';'
and when you click run code
it woud output:

	I love Pizza

Cool!
now we got our first coding for Java
now lets add another one
lets
add another text such as the one above:

```
	System.out.Print("I love pizza");
	System.out.Print("Its really Good!");

OUTPUT:

	I love PizzaIts really Good!
```

ummmm
I don't think that should happen right?
Correct!
the reason why this is all displaying as one long line is because after printing the first statement, our cursor does not move down to the next line
IN ORDER TO DO SO
we could use a "println" statement (SHORT FOR PRINT LINE) as is:

```

	System.out.Println("I love pizza");
	System.out.Println("Its really Good!");

OUTPUT:
	
	I Love pizza
	Its really Goood!
```
\ Inputs
===========
if you have experience from C++ this should be familiar
```
\n
```
this is exactly the same as putting a new line instead of putting "ln" as is from the Example below:

```
	System.out.Print("I love pizza\n");
	System.out.Println("Its really Good!");
OUTPUT:

	I love pizza
	Its really Good!

```

also if we do for the first code 

	System.out.Println("I love pizza\n");

nothing would happen it just adds another line as it will now gap the two lines
as shown below

```
	System.out.Println("I love pizza\n");
	System.out.Println("Its really Good!");
OUTPUT:

	I love pizza

	Its really Good!

```

for this input its the same backslash that we used for \n but for this time we use this if we ever want to output a tab 

```
\t
```

the differnce for \t and \n is that for \n it would be right by the end quote, but, for \t it would be in the starting quote
Soooo it should be like this

```
System.out.Println("\tI love pizza");

OUTPUT:
	I love pizza
Its really Good!
```
now lets try ouputting quotation marks
```
System.out.println(""I love Pizza"");
```
wait woah woah woah there
you cant just do that.
the compiler would be confused because we cannot normally add a set of quotes because our text already needs to be surrounded with quotes

SO
in order to literally display some quotes, we need to precede our double quotes with \\
thus had to type this code to output "\\"
like this
```
System.out.println("\"I love Pizza\"");

OUTPUT:

"I love Pizza"
```
Same goes to display a backslash("\\")
```
System.out.println("\\I love Pizza");

OUTPUT:

\I love Pizza
```
in summary a backslash is anything preceding with a backslash is the beginning of an escape Sequence and theres multitude of characters that could follow afterwards and depending on the character
this has special meaning for your compiler to do something specific.

/ Inputs
==========

NOW
.
anything that is following TWO Foward Slashes is the beginning of a single line comment
```
//
```
and you can basically write everything with those 2 foward slashes
```
// Learning JAVA is so much fun :))
```
that line of text would be ignored by the compiler so theres going to be NO CHANGE to this program with the additional comment 

ANYTHING THAT IS A COMMENT IS GONNA BE IGNORED BY THE COMPIILER 
If you need to leave yourself a note or for someone thats looking over your code

if you need a multi-line comment that right there is foward slash, followed by a asteriskas shown below
```
/*
```
and anything up to asterisk and foward slash
```
*/
```
will be the balance of this comment
```
/*
* Hi My Name is Andy 
* This Is My Java coding notes
* Random Fact of me is that i like to play a game thats over 20 years old on the 
* nintendo gamecube called Super Smash Bros. Melee
*/
```
all these lines would be ignored by the compiler and will not change anything whatsoever
