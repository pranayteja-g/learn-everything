# Single dimensional array

An array is used to store a collection of data or collection of variables.

## Declaring array variables:
syntax:
```
elementtype[] arrayRefVar;
```
element type can be any datatype and all the elements in the array will have the same datatype.

example:
```
double[] myList;
```
while the style ```elementType[] arrayRefVar``` is preffered,  ```elementType arrayRefVar[]``` can also be used to declare an array variable.

The declaration of array itself does not allocate any space in memory to the array variable. If a variable does not contain a reference to an array, the value of the variable is null.
Elements to an array cannot be assigned unless it has already been created.

## Creating an array
After the variable is declared, the array can be created using the 'new' variable.
syntax:
```
arrayRefVar = new elementType[arraySize];
```
```new elementType[arraySize]``` creates the array, then assigns the created array to the array variable

example:
```java
double[] myList = new double[10];
```
the above example creates an array of 10 elements of double datatype.

### Assigning values to the array
to assign values to the array we use the following syntax, ``` arrayRefVar[index] = value; ```

example: 
```java
myList[0] = 12.5;
myList[1] = 10.8;
```
this assigns the values 12.5 and 10.8 to the array at indices, 0 and 1.

#### NOTE: 
An array variable that appears to hold an array actually contains a reference to that array.
Strictly speaking, an array variable and an array are different, but most of the time the
distinction can be ignored. Thus it is all right to say, for simplicity, that myList is an
array, instead of stating, at greater length, that myList is a variable that contains a reference to an array of ten double elements.
