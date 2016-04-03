//tests enum RandomPlayStuff
public class TestRandomPlayStuff2 
{
	private static final int intNumberTestRuns = 10000; //10000 rounds

	//tests how often player 1 choose rock, scissors and paper
	public static void main (String[] args)
	{
		int papers = 0;
		int rocks = 0;
		int scissors = 0;
		for (int i=1; i <= intNumberTestRuns; i ++) //10000 test rounds
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
		System.out.println("*************************************");
		System.out.println("Rock chosen     : " + rocks + " / " + intNumberTestRuns + " times");
		System.out.println("Scissors chosen : " + scissors + " / " + intNumberTestRuns + " times");
		System.out.println("Paper chosen    : " + papers + " / " + intNumberTestRuns + " times");		
	}

}
