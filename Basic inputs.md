WHAT IS JDK?
===============
JDK - (Java Development Kit) developers tool
	JRE - (Java Runtime Env.) Libraries
		JVM - (Java Virtual Machine) Runs Java programs 

WHAT IS IDE?
===============
I - Intergrated
D - Development
E - Environment

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
BONUS
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
```
