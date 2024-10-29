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
