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

#### note: 
An array variable that appears to hold an array actually contains a reference to that array.
Strictly speaking, an array variable and an array are different, but most of the time the
distinction can be ignored. Thus it is all right to say, for simplicity, that myList is an
array, instead of stating, at greater length, that myList is a variable that contains a reference to an array of ten double elements.

When space for an array is allocated, the array size must be given, specifying the number of elements that can be stored in it. The size of an array cannot be changed after the array is created.
Size can be obtained using arrayRefVar.length.

when an array is created, its elements are assigned the default value of 0 for the numeric
primitive data types, \u0000 for char types, and false for boolean types

### Array indexed variables:
The array elements are accessed through the index. Array indices are 0 based; that is, they range from 0 to arrayRefVar.length-1.
for example, 'myList' holds ten double values, and the indices are from 0 to 9.
to access the 3rd element of the array myList, we write, 
```java
myList[2];
```
### Array initializer:
array initializer combines the declaration, creation, and initialization of an array in one statement using the following syntax:
```elementType[] arrayRefVar = {value0, value1, ..., valuek};```
For example, the statement,
```java
double[] myList = {1.9, 2.9, 3.4, 3.5};
```
declares, creates, and initializes the array myList with four elements, which is equivalent to
the following statements:
```java
double[] myList = new double[4];
myList[0] = 1.9;
myList[1] = 2.9;
myList[2] = 3.4;
myList[3] = 3.5;
```
#### Note:
he new operator is not used in the array-initializer syntax. Using an array initializer, you
have to declare, create, and initialize the array all in one statement. Splitting it would
cause a syntax error. Thus, the next statement is wrong:
```java
double[] myList;
myList = {1.9, 2.9, 3.4, 3.5};
```
### processing arrays:
processing array elements, you will often use a for loop—for two reasons:

■ All of the elements in an array are of the same type. They are evenly processed in the
same fashion repeatedly using a loop.

■ Since the size of the array is known, it is natural to use a for loop.
