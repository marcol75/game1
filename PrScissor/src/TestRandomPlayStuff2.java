
//tests enum PlayStuff
public class TestRandomPlayStuff2 
{
	//tests if Random PlayStuff value not null
	public static void main (String[] args)
	{
		int papers = 0;
		int rocks = 0;
		int scissors = 0;
		
		for (int i=0; i < 10000; i ++)
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
		
		System.out.println("***************************");
		System.out.println(rocks);
		System.out.println(scissors);
		System.out.println(papers);
		
	}

}
