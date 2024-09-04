Its crazy how this guy did it lol

this man has 2 cups of water

one was labeled as x

and the other was labled y;

Y-Cup was filtered with a kool-aid powder

and X-cup was the same

what were trying to do is to swap variables from their code to swap 
```
public class Main{
    public static void main(String[] args) {

    String x = "Water";
    String y = "Kool-Aid";

    System.out.println("X: " + x);
    System.out.println("Y: " + y);
  }
}

OUTPUT:

X: Water
Y: Kool_Aid
```
as you can see nothing has changed...NOW Lets see if we use this to change
```
x=y;
y=x;
```
this wshould work right??
```
OUT{UT:

X: Kool-Aid
Y: Kool-Aid
```
ohhh noooo. Theyre the Same...BUT WHAT IF WE DO THE OPPOSITE??
```
y=x;
x=y;

OUTPUT:

X: Water
Y: Water
```
damn...thats Crazy

actually

why dont we tag some along 

oh i know
why dont we use a 3rd string to help out the swaping variables
```
String temp;
```
and with that it can help us swap the variables

lets add that up shall we?
```
public class Main{
    public static void main(String[] args) {

    String x = "Water";
    String y = "Kool-Aid";
    String temp;

    temp = x;
    x = y;
    y = temp;

    System.out.println("X: " + x);
    System.out.println("Y: " + y);
  }
}

OUTPUT:

X: Kool-Aid
Y: Water
```
# AND THATS HOW YOU DO IT
