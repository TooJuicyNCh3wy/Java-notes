# USING ECLIPSE
**GUI**

------------------------
- G = Graphical
- U = User
- I = Interface
- GUI is a visual program that we can see and interact with

-----------------------------------------

what we will be using the j.option.pane class and will be creating a few message dialog boxes

In order to start you program start with 
```
import javax.swing.jOptionPane;
```
now lets type in some user information into a dialog box, and store it as a ```String``` variable called name:
```
String name = jOptionPane.showInputDialog(message);
```
from the ```jOptionPane.showInputDialog(message)``` we can now type in a message 

and once we run it a popup will appear showing the message that you have typed in under the ```(message)``` 

![image](https://github.com/user-attachments/assets/cc549a88-dc66-406b-ad2c-889f56e59872)

since it is from Eclipse it shows already the 2 buttons showing 
OK and Cancel

if we use this code thats below us it will react when we click on ok

↓↓↓
```
JOptionPane.showMessageDialog(parentComponent, message)
```
parentComponent is determined where the frame in which the dialog is displayed
- if null, or if the parentComponent has no Frame, a default Frame is used. message - the Object to display in the middle of the box, the question to ask.

but for the moment, well use ```null``` first 
soo we add in the parentheses
```
(null,message)
```
and then from there add text under ```message```

giving a response once clicking OK

now

instead of using Strings now lets store this value within an integer

So instead of ```String name =...``` it woud something like...uh...your age → ```int age =```

and by there we copy what was after the "=" ```jOptionPane.showInputDialog(message);```

and bringing them together we have
```
int age = jOptionPane.showInputDialog(message);
```
but remember this isnt string

soo we need to add something else for the ```jOptionPane.showInputDialog(message);```

we need to add ```Integer.parseInt()``` and within inside the parentheses NOWWW you can add that code inside

AND NOW LETS ADD IT ALL TOGETHER
```
int age = Integer.parseInt(jOptionPane.showInputDialog(message));
```
and you can do it also on double but remember that you'll always have to change the variable in order to work
