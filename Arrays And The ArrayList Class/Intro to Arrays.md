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
An Array of any data type can be declared. The Following are all valid array declarations:
```
float[] temperatures = new float[100];
char[] letters = new char[41];
long [] units = new long[50];
double[] sizes = new double[1200];
```
An array’s size declarator must be a non-negative integer expression. It can be a literal value, as shown in the previous examples, or a variable. It is a common practice to use a final variable as a size declarator. Here is an example:
```
final int NUM_ELEMENTS = 6;
int[] numbers = new int[NUM_ELEMENTS];
```
This practice can make programs easier to maintain. When we store the size of an array in a variable, we can use the variable instead of a literal number when we refer to the size of the array. If we ever need to change the array’s size, we need only to change the value of the variable. The variable should be final so its contents cannot be changed during the program’s execution.

**NOTE**: Once an array is created, its size cannot be changed

Accessing Array Elements
=========================
Although an array has only one name, the elements in the array may be accessed and used as individual variables. This is possible because each element is assigned a number known as a **subscript**.

**Subscript**:
- is used when as an index to pinpoint a specific element within an array
- **ALWAYS** Starts at Zero
- The Subscript of the last element in an array is one **LESS** than the tital number of elements in the array.
  - Meaning that for the numbers array, which has 6 elements:
    - 5 is the Subscript for the last element.
   
Each Element in the numbers array,
- When accused by the subscript:
  - it can be used as an ```int``` variable
    -  EXAMPLE:
      - LOOK at the code below this, the first statement stores 20 in the first element of the array (Element 0), and the second statement stores 30 in the fourth element (Element 3).
        - ```
          numbers[0] = 20;
          numbers[3] = 30;
          ```
        - **Note**: The expression ```numbers[0]``` 
