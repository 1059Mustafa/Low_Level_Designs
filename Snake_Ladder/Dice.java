package Snake_Ladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min=1;
    int max=6;
    public Dice(int diceCount)
    {
        this.diceCount=diceCount;
    }

    public int rollDice()
    {
        int totalSum=0;
        int diceUsed=0; //diceCount>1 means scalable

        while(diceUsed<diceCount)
        {
            totalSum+= ThreadLocalRandom.current().nextInt(min,max+1);
            diceUsed++;
        }
        return totalSum;
    }
}
