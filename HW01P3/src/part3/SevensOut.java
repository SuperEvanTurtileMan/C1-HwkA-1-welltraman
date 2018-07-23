package part3;
import java.util.Random;

public class SevensOut
{
	int sum = 0;
	
	public String rollDice()
	{
		int die1 = new Random().nextInt(6) + 1;
		int die2 = new Random().nextInt(6) + 1;
		String scoreText = ". ";
		
		sum = die1 + die2;
		
		if (sum == 7) scoreText += "YOU LOSE.";
		else
		{
			if (die1 == die2) sum *= 2;
			scoreText += ("SCORE = " + sum);
		}
		
		return die1 + ", " + die2 + " This roll = " + sum + scoreText;
	}
}
