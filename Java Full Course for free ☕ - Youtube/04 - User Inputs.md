there are many ways to use user inputs but the main one that were going to use today is a Scanner

The Scanner class is found in the JAVA Utility package of your library and we need to import that before we can use the scanner so outside of the class at the very top of our program were going to type ```import java.util.Scanner```

As Shown Down below 
```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  }
}
```
Now we can use the scanner class to create a scanner object 

sooo

were going to be performing a little bit of object oriented programming...

So lets add our scanner in our source code

soo

```
public class Main {

    public statis void main(String[] args) {

        Scanner
```
we neede a name FOR the Scanner

which well go for ```scanner``` but in lower case
```
        Scanner scanner = new Scanner();
```
and INSIDE the parentheses we need to add ```System.in```

sooo
```
        Scanner scanner = new Scanner(System.in)
```
and wouold you look at that

we have our Scanner!!

we can use the Scanner to accept SOME user input

so lets let the use know that we would like to type in something like oh idk...maybe your full name??

actually

yeah

lets give that a go
```
import java.util.Scanner

public class Main{

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? "):
```
Next, 

What well do is take our user input and assign it to a variable, like ```String```
```
    String name
```
Now, after putting the variable ofc you need to add ```=``` & Were going to use our scanner 
```
    String name = Scanner. ...
```
and when we want to enter a line of text. Were going to use a Certain Method of the Scanner.

it is the next line method, and when we type in user we type this
```
    scanner.nextline();
```
and now lets finally add this all these code together as one
```
import java.util.Scanner

public class Main{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? "):
    String name = scanner.nextline();

  }
}
```
and now lets add some spice and would out what we type from the console Window
```
    System.out.println("Hello " + name);
```
and right here is the output
```
What is your name?
Andy
Hello Andy
```
thats for string... TIME FOR ```int```

------------------------------------------

for int is very similar

but not as much thou...

see

obviously when you use a string ```.nextline();``` can only read letters

but for integers it's ```.nextint();``` 

```.nextint``` can read WHOLE integers 
and just like using from thhe code above lets add that code there
```
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    System.out.println("How Old are you? ");
        int age = Scanner.nextInt();
        System.out.println("damn youre " + age + " years old...nigga youre old LMAO");
        
  }
}
```
now lets see the output
```
What is your name?
Andy Alonso
Hello Andy Alonso
How Old are you?
22
damn youre 22 years old...nigga youre old LMAO
```
now

lets see if we DONT put a number on the ```.nextInt();```

like when they ask whats our age

you add oh idk "Your Moms Age"...

this what theyll give you 
```
What is your name? 
Andy Alonso
Hello Andy Alonso
How Old are you? 
Your moms Age
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:964)
        at java.base/java.util.Scanner.next(Scanner.java:1619)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
        at Main.main(Main.java:14)
```
we encountered an exception...we encountered an input mismatch exception because when our scanner is LOOKING for an integer...we typed in a string so we need to make sure that the input type the data type matches

# Common Errors 
this is a common error when you use ```nextLine();``` to ```nextInt();``` to ```nextLine();```

lets say for the next command is your favorite Video game
```
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
        String name = scanner.nextLine();

    System.out.println("How Old are you? ");
        int age = scanner.nextInt();
        

    System.out.println("What is your favorite Game? ");
        String game = scanner.nextLine();
        
    System.out.println("Hello " + name);
    System.out.println("damn youre " + age + " years old...nigga youre old LMAO");
    System.out.println("Peak game Right there");

  }
}

=======================
Output
=======================
What is your name? 
Andy
How Old are you?
18
What is your favorite Game?
Hello Andy
damn youre 18 years old...nigga youre old LMAO
Peak game Right there

```
huh...
when i put my age and pressed enter it skipped our answer and went straight to it

why is that?
```
We have The Command and the Scanner

the command of NextLine and the Scanner being our answer
when asked whats your name
there is no next line because there was no resoonse
but once you ADD a response on the Scanner
it adds a \n on the scanner section
so when i add

             Scanner
=======================
nextLine() || Andy
=======================
* Pressed Enter *
=======================
nextLine() || Andy\n
========================
if we added a new line with the same nextLine() it would be empty
however
since we added nextInt() in our section
its gonna be counted as a new line

             Scanner
=======================
nextInt() || 18
=======================
* Pressed Enter *
=======================
nextInt() || 18\n
========================
when we submit it on the next int
its still going to be there in the scanner
so
if we were to use our nextLine() scanner again:

             Scanner
=======================
nextLine() || \n
=======================

our next method thinks that were at the end because
there's this new line character within our Scanner
so we would need some way to clear out that new line
```
one easy way to fix this is that AFTER you call the next ```int``` method what we could do is call the next line method to clear our scanner
```
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
        String name = scanner.nextLine();

    System.out.println("How Old are you? ");
        int age = scanner.nextInt();

    scanner.nextLine();

    System.out.println("What is your favorite Game? ");
        String game = scanner.nextLine();
        
    System.out.println("Hello " + name);
    System.out.println("damn youre " + age + " years old...nigga youre old LMAO");
    System.out.println("Peak game Right there");

  }
}

=======================
Output
=======================
What is your name? 
Andy
How Old are you?
18
What is your favorite Game?
Hello Andy
damn youre 18 years old...nigga youre old LMAO
Peak game Right there

```
that new line were not really going to do anything with it really just to clear it out yk

soo

with that it should work now 
```
=======================
Output
=======================
What is your name? 
Andy
How Old are you?
18
What is your favorite Game?
Super Smash Bros. Melee
Hello Andy
damn youre 18 years old...nigga youre old LMAO
Peak game Right there
```
# IT WORKED!!!!!!!!!!!! :D
