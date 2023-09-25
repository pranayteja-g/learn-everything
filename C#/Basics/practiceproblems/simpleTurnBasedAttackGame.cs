Random attack = new();
int heroHealth = 10;
int monsterHealth = 10;
bool heroTurn = true;

do
{
    //generate random number as attack value
    int heroAttack = attack.Next(1, 11);
    int monsterAttack = attack.Next(1, 11);

    if (heroTurn)
    {
        monsterHealth -= heroAttack;
        Console.WriteLine($"Hero attacks the monster, dealing {heroAttack} damage. Monster now has {(monsterHealth >= 0 ? monsterHealth : 0)} health.");
    }
    else if (monsterHealth > 0)
    {
        heroHealth -= monsterAttack;
        Console.WriteLine($"Monster attacks the hero, dealing {monsterAttack} damage. Hero now has {(heroHealth >= 0 ? heroHealth : 0)} health.");
    }

    heroTurn = !heroTurn; //to toggle between hero's and monster's to attack

} while (heroHealth > 0 && monsterHealth > 0); //the loop runs as long as both hero's and monster's health is above 0

// Check the outcome of the battle
Console.WriteLine((heroHealth == 0 ? "Monster Wins!" : "Hero Wins!")); //declares who won based on the health
