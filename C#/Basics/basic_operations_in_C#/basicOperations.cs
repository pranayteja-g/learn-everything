//basic operations
int a,b;
a=7;
b=5;
int sum = 7+5;
int dif = 7-5;
int product = 7*5;
float quotient = (float)a/(float)b;
int remainder = a%b;
Console.WriteLine($"sum: {sum}\ndifference: {dif}\nproduct: {product}\ndivision: {quotient}\nremainder: {remainder}");

int value1 = 3 + 4 *5;
int value2 = (3+4)*5;
Console.WriteLine($"value1: {value1}\tvalue2: {value2}");

//increment and decrement
int value = 0;
value = value + 5;
value += 5;
Console.WriteLine("value = " + value);
value++;
Console.WriteLine("now value = "+ value);

int number = 1;
Console.WriteLine("number = "+number);
number = number + 1;
Console.WriteLine("number = "+number);
number += 1;
Console.WriteLine("number = "+ number);
Console.WriteLine("number = "+(++number));
Console.WriteLine("number = "+(number++));
number--;
Console.WriteLine("number = "+number);
number -= 1;
Console.WriteLine("number = "+number);
number = number - 1;
Console.WriteLine("number = "+number);
