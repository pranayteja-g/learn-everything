// initialize variables - graded assignments 
int currentAssignments = 5;

int sophia1 = 93;
int sophia2 = 87;
int sophia3 = 98;
int sophia4 = 95;
int sophia5 = 100;
int sophiaSum = sophia1+sophia2+sophia3+sophia4+sophia5; // adding all the grades
decimal sophiaAVG = (decimal)sophiaSum/currentAssignments; // calculating the average

int nicolas1 = 80;
int nicolas2 = 83;
int nicolas3 = 82;
int nicolas4 = 88;
int nicolas5 = 85;
int nicolasSum = nicolas1 + nicolas2 + nicolas3 + nicolas4 + nicolas5; // adding all the grades
decimal nicolasAVG = (decimal)nicolasSum/currentAssignments; // calculating the average

int zahirah1 = 84;
int zahirah2 = 96;
int zahirah3 = 73;
int zahirah4 = 85;
int zahirah5 = 79;
int zahirahSum = zahirah1 + zahirah2 + zahirah3 + zahirah4 + zahirah5; // adding all the grades
decimal zahirahAVG = (decimal)zahirahSum/currentAssignments; // calculating the average

int jeong1 = 90;
int jeong2 = 92;
int jeong3 = 98;
int jeong4 = 100;
int jeong5 = 97;
int jeongSum = jeong1 + jeong2 + jeong3 + jeong4 + jeong5; // adding all the grades
decimal jeongAVG = (decimal)jeongSum/currentAssignments; // calculating the average

Console.WriteLine($"Total Scores:\n----------\nsophiaSum: {sophiaSum}\nnicolasSum: {nicolasSum}\nzahirahSum: {zahirahSum}\njeongSum: {jeongSum}");
Console.WriteLine("---------------------------------------");
Console.WriteLine($"Averages:\n----------\nsophia : {sophiaAVG} A\nnicolas: {nicolasAVG} B\nzahirah: {zahirahAVG} B\njeong  : {jeongAVG} A");
