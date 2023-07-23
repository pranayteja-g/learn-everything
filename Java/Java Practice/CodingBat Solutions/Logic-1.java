/* When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.
cigarParty(30, false) → false
cigarParty(50, false) → true */
public boolean cigarParty(int cigars, boolean isWeekend) {
  if((cigars >= 40 && cigars <= 60) && isWeekend == false){
    return true;
  }else if(cigars >= 40 && isWeekend == true){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/* You and your date are trying to get a table at a restaurant.
The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).
dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1*/
public int dateFashion(int you, int date) {
  if((you >= 8 && date > 2) || (date >=8 && you >2)){
    return 2;
  }else if(you <= 2 || date <= 2){
    return 0;
  }
  return 1;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/*The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true*/
public boolean squirrelPlay(int temp, boolean isSummer) {
  if((temp >=60 && temp <=90) && isSummer == false){
    return true;
  }else if(isSummer == true && (temp >= 60 && temp <=100)){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0*/
public int caughtSpeeding(int speed, boolean isBirthday) {
  
  if((isBirthday == false && speed <= 60)|| isBirthday == true && speed <=(60+5)){
      return 0;
    }else if((isBirthday == false && (speed >= 61 && speed <= 80))|| isBirthday == true &&(speed >=61 && speed <=(80+5))){
      return 1;
    }
      return 2;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21*/
public int sortaSum(int a, int b) {
  int c = a+b;
  if(c>=10 && c<=19){
    return 20;
  }
  return c;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//alarmClock
public String alarmClock(int day, boolean vacation) {
  if(vacation == false && (day >0 && day < 6)){
    return "7:00";
  }else if((vacation == true && (day >0 && day < 6)) || (vacation == false && (day == 0 || day == 6))){
    return "10:00";
  }
  return "off";
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//love6
public boolean love6(int a, int b) {
  int d = a+b;
  int e = a-b;
  if(d == 6 || Math.abs(e) == 6 || a == 6 || b==6){
    return true;
  }
  return false;
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//in1To10
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode == false){
    if(n<1 || n> 10){
      return false;
    }else if(n>=1 || n<=10){
      return true;
    }
  }else if(outsideMode == true){
    if(n<=1 || n>= 10){
      return true;
    }else{
      return false;
    }
  }
  return true;
}
//or
public boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
        return n <= 1 || n >= 10;
    } else {
        return n >= 1 && n <= 10;
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//specialEleven
public boolean specialEleven(int n) {
  int m = n%11;
  if(m==0 || m==1){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//more20
public boolean more20(int n) {
  int m = n%20;
  if(m == 1 || m==2){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//old35
public boolean old35(int n) {
  int m = n%3;
  int p = n%5;
  if(m == 0 && p == 0){
    return false;
  }else if(m == 0 || p == 0){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//less20
public boolean less20(int n) {
  int m = n%20;
  if(m==18 || m==19){
    return true;
  }
  return false;
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
