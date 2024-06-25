**Concept:** An Array can hold multiple values of the same data type simultaneously.

The primitive variables you have worked with so far are designed to hold one value at a time. Each of the variable declarations in the image bwlow causes only enough memory to be reserved to hold one value of the specified data type.

![image](https://github.com/aalons012/Java-notes/assets/75342059/11e828c2-685e-433d-a7c8-e511964968f3)

An array, however, is an object that can store a group of values, all of the same type. Creating and using an array in Java is similar to creating and using any other type of object: You declare a reference variable and use the new keyword to create an instance of the array in memory. Here is an example of a statement that declares an array reference variable:

```
int[] numbers;
```
This statement declares numbers as an array reference variable. The numbers variable can reference an array of ```int``` values. Notice that this statement looks like a regular ```int``` variable declaration except for the set of brackets that appears after the keyword ```int```.

The brackets indicate that this variable is a reference to an ```int``` array. Declaring an array reference variable does not create an array. The next step in the process is to use the new keyword to create an array and assign its address to the numbers variable. The following statement shows an example:

```
numbers = new int[6];
```
Arrays of any data type can be declared. The following are all valid array declarations:

```
float[] temperatures = new float[100];  
char[] letters = new char[41];  
long[] units = new long[50];  
double[] sizes = new double[1200];
```
