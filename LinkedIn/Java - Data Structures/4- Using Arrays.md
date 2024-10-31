
Lets Start using arrays in java shall we?
```
public class ArrayExamples{
  public static void main(String[] args){

  }
}
```
remember the class name for this file is also the name of the file
so
public class ArrayExamples is also ArrayExamples.java

So in order to Make an Array you can make it any way possible
Either
  String
  Int
  Double
  Char
  Float
  etc etc

for this lesson we will be using (String)
To make an array of strings you will add ↓↓↓↓
```
public class ArrayExamples{
  public static void main(String[] args){

  String[] weekday = new String[];
  }
}
```
and inside of the square brackets on new String[], we can add the amount that we want
and this time, yes you can put the correct number amount that you'll like and since we are doing weekdays, well do 5 for Monday to Friday

so lets add 5 under the square bracket
```
public class ArrayExamples{
  public static void main(String[] args){

  String[] weekday = new String[5];
  }
}
```
lets run it shallwe?
by using System.out.println can output anything that you like
sooo
```
public class ArrayExamples{
  public static void main(String[] args){

    String[] weekday = new String[5];
    System.out.println(weekday);
  }
}
```
hmm
theres no input??
whys that??

well there are many reasons why it has been like that

1- the print is incorrect 

Instead of System.out.println(weekday) it should be ↓↓↓
  System.out.println(Arrays.toString(weekday);

& 2 we need to add from the beginning of the code file ↓↓↓
  import java.util.Arrays;
to make the arrays work functionally as theyre suppose to work

NOW
LETS BRING IT ALL TOGETHER

```
import java.util.Arrays;

public class ArrayExamples{
  public static void main(String[] args){

    String[] weekday = new String[5];
    System.out.println(Arrays.toString(weekday);
  }
}
```
RUN THAT SHIT
```
[null, null, null, null, null,]
```
↑↑↑
That right there is the out of that code and now adding what we were suppose to do 
it is now readable for a human being
but why "null"
whenever you create an array, IF YOU DONT SAY WHAT ANY OF THE VALUES ARE GOING TO BE. Java will just use the Default value for the type
