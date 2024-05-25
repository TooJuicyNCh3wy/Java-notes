the statements number++ and ++number increment the variable number, while the statements number-- and --number decrement the variable number. In these simple statements, it doesn’t matter whether the operator is used in postfix or prefix mode. The difference is important, however, when these operators are used in statements that do more than just increment or decrement. For example, look at the following code:

```
number = 4;
system.out.println(number++);
```
The statement that calls the println method does two things: (1) calls println to display the value of number, and (2) increments number. But which happens first? The println method will display a different value if number is incremented first than if number is incremented last. The answer depends upon the mode of the increment operator.

Postfix mode causes the increment to happen after the value of the variable is used in the expression. In the previously shown statement, the println method will display 4 and then number will be incremented to 5. Prefix mode, however, causes the increment to happen first. Here is an example:
```
number = 4;
System.out.println(++number);
```
In these statements, number is incremented to 5, then println will display the value in number (which is 5). For another example, look at the following code:
```
int x = 1, y;
y = x;
```
The first statement declares the variable x (initialized with the value 1) and the variable y. The second statement does the following:

- It assigns the value of x to the variable y.
- The variable x is incremented.

The value that will be stored in y depends on when the increment takes place. Because the ++ operator is used in postfix mode, it acts after the assignment takes place. So, this code will store 1 in y. After the code has executed, x will contain 2. Let’s look at the same code, but with the ++ operator used in prefix mode as follows:
```
int x = 1 - y;
y = ++x;        //prefix increment
```
The first statement declares the variable x (initialized with the value 1) and the variable y. In the second statement, the ++ operator is used in prefix mode, so it acts on the variable before the assignment takes place. So, this code will store 2 in y. After the code has executed, x will also contain 2.
