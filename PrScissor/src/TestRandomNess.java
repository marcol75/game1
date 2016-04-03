//tests enum RandomPlayStuff
public class TestRandomNess 
{
	//tests "randomness" of getRandomPlayStuffValue
	public static void main (String[] args)
	{
		int papers = 0;
		int rocks = 0;
		int scissors = 0;
		
		for (int i=1; i <= 100000; i ++)
		{
			PlayStuff randomPlayStuff = RandomPlayStuff.getRandomPlayStuffValue();
			System.out.println("Run " + i +  ". chosen : " + randomPlayStuff);
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
		int maxValue = Math.max(Math.max(rocks, papers), scissors); //most chosen
		int minValue = Math.min(Math.min(rocks, papers), scissors); //least chosen
		int minMaxDifference = maxValue - minValue;	//difference between least and most chosen
		int percentageDifference = minMaxDifference * 100 / maxValue; // diff in %
		
		System.out.println("************************************************");
		if (percentageDifference < 2)
		{
			System.out.println("OK - less than 2 percent deviation : " + minMaxDifference + " of " + maxValue);
		}
		else
		{
			System.out.println("More than 2 percent deviation : " + minMaxDifference + " of " + maxValue);
		}
	}
}
