# Summary of Chapter 9 (PowerPoint)
![image](https://github.com/user-attachments/assets/848a88c9-c75d-40fa-a4a8-3dc98880c757)

Object-oriented programming (O O P) involves programming using objects. An **object** represents an entity in the real world that can be distinctly identified. For example, a student, a desk, a circle, a button, and even a loan can all be viewed as objects. An object has a unique identity, state, and behaviors. The **state** of an object consists of a set of **data fields** (also known as **properties**) with their current values. The behavior of an object is defined by a set of methods.

-----------------
![image](https://github.com/user-attachments/assets/80899f0b-ce28-4157-8aff-9e47f8f88d5a)

![image](https://github.com/user-attachments/assets/4c90f30d-f03d-4401-8b5e-3a294cc68e3b)

An object has both a state and behavior. The state defines the object, and the behavior defines what the object does.

```
Class name, Circle.
Data fields. Radius is, blank space. Methods, getArea.
Three objects of the Circle class are as follows.
Circle object 1. Data fields, radius is 10.
Circle object 2. Data fields, radius is 25.
Circle object 3. Data fields, radius is 125.
```
-------------------------------------------
![image](https://github.com/user-attachments/assets/ca96c495-cb1b-4b4e-8223-45fd54676146)

**Classes** are constructs that define objects of the same type. A Java class uses variables to define data fields and methods to define behaviors. Additionally, a class provides a special type of methods, known as constructors, which are invoked to construct objects from the class.

![image](https://github.com/user-attachments/assets/bd0b925b-814f-4292-9176-4f1d03e75427)
```
Line 1, indicates class Circle open braces.
Line 2, slash forward address address The radius of this circle address slash forward.
Line 3, double radius equal to 1.0 semicolon.

The line 3 is Data field.

Line 4, Blank.
Line 5, slash forward address address Construct a circle object address slash forward.
Line 6, Circle open parenthesis close parenthesis open braces.
Line 7, close braces.
Line 8, Blank.
Line 9, slash forward address address Construct a circle object address slash forward.
Line 10, Circle open parenthesis double new Radius close parenthesis open braces.
Line 11, radius equal to new Radius semicolon.
Line 12, close braces.

The lines 5, 6, 7, 8, 9, 10, 11 and 12 are Constructors.

Line 13, Blank.
Line 14, slash forward address address Return the area of this circle address slash forward.
Line 15, double get Area open parenthesis close parenthesis open braces.

The line 15 is Method.

Line 16, return radius address radius address 3 period 14159 semicolon.
Line 17, close braces.
Line 18, close braces. 
```
---------------------------
![image](https://github.com/user-attachments/assets/14475017-00d1-449c-9ba8-9e1805beb4da)
![image](https://github.com/user-attachments/assets/fac8661e-f176-42f6-812e-0990fa6d7f90)

```
Row 1 shows the Class name (circle).
Row 2 shows the Data fields (radius: double).
Row 3 shows the computer coding of 6 lines for Constructors and methods.

Line 1, indicates Circle open parenthesis close parenthesis.
Line 2, Circle open parenthesis new Radius colon double close parenthesis.
Line 3, g e t Area open parenthesis close parenthesis colon double. L
ine 4, g e t Perimeter open parenthesis close parenthesis colon double.
Line 5, s e t Radius open parenthesis new Radius colon.
Line 6, double close parenthesis colon void. A left side text box shows the 2 rows of UML notation for objects.

Row 1 shows the Circle 1 colon Circle.
Row 2 shows the radius equal to 1.0. A middle text box shows the 2 rows of UML notation for objects.

Row 1 shows the Circle 2 colon Circle.
Row 2 shows the radius equal to 25. A right side text box shows the 2 rows of UML notation for objects.

Row 1 shows the Circle 3 colon Circle.
Row 2 shows the radius equal to 125.
```
--------------------------------
![image](https://github.com/user-attachments/assets/8f78c8e3-9656-4fb0-a687-9446d46499ae)

Objective: Demonstrate creating objects, accessing data, and using methods.

![image](https://github.com/user-attachments/assets/e7aad950-4067-4b94-aee3-712ad0ce35bd)

----------------------------
![image](https://github.com/user-attachments/assets/aad4281e-f0a7-4a06-9c30-619d603e8875)
![image](https://github.com/user-attachments/assets/a19c2aef-4dd3-4224-a8f8-9ac8aa84974e)
```
Row 1 shows the TV.
Row 2 shows the computer coding.

Line 1, indicates channel colon i n t.
Line 2, shows the volume Level colon i n t.
Line 3, shows the on colon boolean.

Row 3 also shows the computer coding for 9 lines and in this coding + sign indicates a public modifier.

Line 1, indicates plus TV open parenthesis close parenthesis.
Line 2, plus t u r n On open parenthesis close parenthesis colon void.
Line 3, plus tu r n Off open parenthesis close parenthesis colon void.
Line 4, plus s e t Channel open parenthesis new Channel colon i n t close parenthesis colon void.
Line 5, plus s e t Volume open parenthesis new Volume Level colon i n t close parenthesis colon void.
Line 6, plus channel Up open parenthesis close parenthesis colon void.
Line 7, plus channel Down open parenthesis close parenthesis colon void.
Line 8, plus volume Up open parenthesis close parenthesis colon void.
Line 9, plus volume Down open parenthesis close parenthesis colon void. 
```
TV.Java

![image](https://github.com/user-attachments/assets/8a9dcac7-dc1c-4835-ad1d-5aceb5bd1e1c)

TestTV.java

![image](https://github.com/user-attachments/assets/c73c01e8-1a70-4770-bc19-442f40a98263)

---------------
![image](https://github.com/user-attachments/assets/9b9012d5-27a5-46d5-b120-7cb3743170dd)
```
Circle() {
}
Circle(doube newRadius) {
  radius = newRadius;
}
```
Constructors are a special kind of methods that are invoked to construct objects.

A constructor with no parameters is referred to as a **no-arg constructor**.
* Constructors must have the same name as the class itself.
* Constructors do not have a return type—not even void.
* Constructors are invoked using the new operator when an object is created. Constructors play the role of initializing objects.

---------------------------------
![image](https://github.com/user-attachments/assets/72633d0e-9606-4bd7-9a39-d418e4059b8b)
```
new ClassName();
```
EXAMPLE:
```
new Circle();

new Circle(5.0);
```
---------------------------
![image](https://github.com/user-attachments/assets/2fbd7ad5-d1c1-402f-999a-1531f276a1ae)

A class may be defined without constructors. In this case, a no-arg constructor with an empty body is implicitly defined in the class. This constructor, called a **default** **constructor**, is provided automatically **only if no constructors are explicitly defined in the class**

--------------------------------
![image](https://github.com/user-attachments/assets/bb55dd9d-e8a2-4cf0-96aa-af079311938e)

To reference an object, assign the object to a reference variable.

To declare a reference variable, use the syntax:
```
ClassName objectRefVar;
```
Example:
```
Circle myCircle;
```
-------------------------
![image](https://github.com/user-attachments/assets/5b39befb-ad88-4977-90d6-d7276403db57)
```
ClassName objectRefVar = new ClassName();
```
Example:

![image](https://github.com/user-attachments/assets/d47ab80c-0bcb-4849-9d90-7ce3adb30d13)

An arrow from right side to the left side of = is labeled, assign object reference. The object new circle left parenthesis right parenthesis semi colon is labeled, create an object.

---------------------------------
![image](https://github.com/user-attachments/assets/7cfcd6d4-1a77-493c-916e-832c844f10b9)
* Referencing the Object's Data:
```
objectRefVar.data
```
EXAMPLE
```
myCircle.radius
```
* Invoking the object's method:
```
objectRefVar.methodName(arguments)
```
EXAMPLE
```
myCircle.getArea()
```
----------------------
![image](https://github.com/user-attachments/assets/8dee05ec-c6a9-47fa-94ee-eeba37be0ec8)
![image](https://github.com/user-attachments/assets/181853f0-f5b2-48bf-85c3-4273fd5d9baf)
```
Line 1, indicates Circle my Circle equal to new Circle open parenthesis 5.0 close parenthesis semicolon.
Line 2, blank.
Line 3, Circle my Circle equal to new Circle open parenthesis close parenthesis semicolon.
Line 4, blank.
Line 5, your Circle period radius equal to hundred semicolon. A right side text box shows the 1 Row for Declare my Circle i.e. no value.
```
![image](https://github.com/user-attachments/assets/1b6bce1b-ed3c-4a80-9b6a-c94fccaa7eea)
```
The computer code consists 5 lines.

Line 1, indicates Circle my Circle equal to new Circle open parenthesis 5.0 close parenthesis semicolon.
Line 2, blank.
Line 3, Circle my Circle equal to new Circle open parenthesis close parenthesis semicolon. Line 4, blank.
Line 5, your Circle period radius equal to hundred semicolon.

A right upward side text box shows 1 Row for my Circle i.e. no value. A right downward side text box shows the 2 rows.

Row 1 shows the Create a circle by coding i.e. colon Circle.
Row 2  shows the radius colon 5.0.
```
![image](https://github.com/user-attachments/assets/30cd9f70-5b35-47ea-bfc1-752d5f3f05b6)
```
The computer code consists 5 lines.

Line 1, indicates Circle my Circle equal to new Circle open parenthesis 5.0 close parenthesis semicolon.
Line 2, blank.
Line 3, Circle my Circle equal to new Circle open parenthesis close parenthesis semicolon. Line 4, blank.
Line 5, your Circle period radius equal to hundred semicolon.

A right upward side text box shows 1 Row for my Circle i.e. reference value and it also shows an arrow of red colour which is for Assign object reference to my Circle. A right downward side text box shows the 2 rows.

Row 1 shows the Create a circle by coding i.e. colon Circle.

Row 2  shows the radius colon 5.0. 
```
![image](https://github.com/user-attachments/assets/f374310e-f307-49e3-9169-31db8f8fe67d)
```
The computer code consists 5 lines.
Line 1, indicates Circle my Circle equal to new Circle open parenthesis 5.0 close parenthesis semicolon.
Line 2, blank.
Line 3, Circle my Circle equal to new Circle open parenthesis close parenthesis semicolon.
Line 4, blank.
Line 5, your Circle period radius equal to hundred semicolon.

A right upward side text box shows 1 Row for my Circle i.e. reference value and it also shows an arrow of red colour. A rightward middle text box shows the 2 rows.

Row 1 shows the Create a circle by coding i.e. colon Circle.
Row 2  shows the radius colon 5.0. A right downward side text box shows the 1 row for Declare your Circle i.e. no value.
```
