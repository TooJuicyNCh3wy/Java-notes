# Math Class

lets start with two numbers (from the video)

which will be 
```

double x = 3.14;
double y = -10;

```
the **FIRST** Useful method is the ```MAX``` method
- this will find the larger number of the 2 nummbers

so

**What should we use to find the larger number???**
```

Math.max(x, y);
```
theyre many ways to use the math class but were looking for the max number... and again there's many ways to use the ```max``` method so with that we used the max number from the 2 variables x and y.

and with that code it can either display the result or assign this to a new variable like ↓↓↓
```
double z = Math.max(x, y);

System.out.println(z);
```
im using the ```System.out.println``` so that it can display the largest number 
- and by no surprise the highest number is 3.14

And you can also display the minimum value or ```Math.min``` 
- and for the minimum number is -10

Another useful method of using math is the absolute function and all you have to do is to use ```Math.abs``` thats all you have to use ```abs```

sooo

lets change the ```double z = Math.min(x, y);``` → ```double z = Math.abs(y);```

since y is the only number that is a negative. And with that it will display the absolute value of y...which is 10.

we also have the Square root 
