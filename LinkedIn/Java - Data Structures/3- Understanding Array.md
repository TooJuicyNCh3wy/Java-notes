# Array 
One of the simplest data structures in Java, and other languages too, is the array. 
- Arrays are objects that contain a fixed number of elements of the same type.

![image](https://github.com/user-attachments/assets/7ab8a61f-4a38-44b8-8b31-898ae16f0121)


- So when you create an array,
  - you have to say upfront how many elements are going to be in it.

If you change your mind later and decide you want to add some extra elements, you can't just make it bigger, you'd have to create a whole new array. 

Arrays can contain pretty much any type of value from primitive types like int and double, to object types like string or our own custom types. 

Every element in the array has to be the same type. 
- for example

![image](https://github.com/user-attachments/assets/655b4261-de3e-4705-a4e8-b63d4202f560)
  - you couldn't have an array where the first element is an int and the second element is a string, that wouldn't be allowed.

![image](https://github.com/user-attachments/assets/1cd3af0f-8c1d-4be3-8209-0a9bf6056a38)

Arrays are indexed, and they start at zero. So the index of the first element in the array is zero. And the index of the last element in the array is the length of the array minus one. So if an array has four elements in it, the first one is at index zero and the last one is at index three. ↑↑↑
```
System.out.println(lemons[4]);
```
↑↑↑ A really common bug with arrays is trying to access an elements that's out of bounds. 
For example
- trying to access index four in an array of four elements will cause an array index out of bounds exception because the last index is actually three.


In Java there's a class called the arrays class, which provides some utility methods that can be performed on arrays. This class can be used to do things like turn the array into a human readable string with a ```toString()``` method or turning a list into an array and also for searching and sourcing arrays with the sort and binary search methods. 
```
The Arrays Class Methods
======
toString();

asList();

sort()

binarySearch()
```
