Random dice = new Random();
int roll1 = dice.Next(1,7);
int roll2 = dice.Next(1,7);
int roll3 = dice.Next(1,7);

int total = roll1 + roll2 + roll3;

Console.WriteLine($"Dice roll: {roll1} + {roll2} + {roll3} = {total}");

if((roll1 == roll2) || (roll2 == roll3) || (roll3 == roll1)){

    if((roll1 == roll2) && (roll2 == roll3)){
        Console.WriteLine("you rolled triples! +6 bonus to total!");
        total += 6;
    }else{
        Console.WriteLine("you rolled doubles! +2 bonus to total!");
        total += 2;
    }
    
}

if(total >= 16){
    Console.WriteLine("You won a Car!");
}else if(total >= 10){
    Console.WriteLine("You won a laptop!");
}else if(total == 7){
    Console.WriteLine("you won a trip!");
}else{
    Console.WriteLine("You won a kitten");
}
