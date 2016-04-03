import java.util.function.IntPredicate;


//tests enum RandomPlayStuff
public class TestRandomNess 
{
	//tests "randomness" of getRandomPlayStuffValue
	public static void main (String[] args)
	{
		int papers = 0;
		int rocks = 0;
		int scissors = 0;
		
		for (int i=0; i < 100000; i ++)
		{
			PlayStuff randomPlayStuff = RandomPlayStuff.getRandomPlayStuffValue();
			System.out.println(randomPlayStuff);
			switch (randomPlayStuff) {
			case PAPER:	
			{
				papers++;
				break;
			}
			
			case ROCK:
			{
				rocks++;
				break;
			}

			case SCISSOR:				
			{
				scissors++;
				break;
			}
			default:
				break;
			}
		}
		
		int maxValue = Math.max(Math.max(rocks, papers), scissors);
		int minValue = Math.min(Math.min(rocks, papers), scissors);
		
		int minMaxDifference = maxValue - minValue;
		
		int percentageDifference = minMaxDifference * 100 / maxValue;
		
		if (percentageDifference < 2)
		{
			System.out.println("OK - Less than 2 percent deviation : " + minMaxDifference + " of " + maxValue);
		}
		else
		{
			System.out.println("More than 2 percent deviation : " + minMaxDifference + " of " + maxValue);
		}

	}

}
