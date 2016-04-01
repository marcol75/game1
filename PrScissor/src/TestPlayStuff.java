
import junit.framework.TestCase;

//tests enum PlayStuff
public class TestPlayStuff extends TestCase 
{
	//tests if PlayStuff values not null
	public void testEnumNotNullPlayStuff()
	{
		assertNotNull(PlayStuff.valueOf("ROCK"));
		assertNotNull(PlayStuff.valueOf("SCISSOR"));
		assertNotNull(PlayStuff.valueOf("PAPER"));
		for (PlayStuff currentPlayStuff : PlayStuff.values())
		{
			assertNotNull(PlayStuff.valueOf(currentPlayStuff.name()));
		}		

	}
	
	//tests if PlayStuff names equal
	public void testEnumPlayStuffNames()
	{
		assertEquals(PlayStuff.valueOf("ROCK").name(), "ROCK");
		assertEquals(PlayStuff.valueOf("SCISSOR").name(), "SCISSOR");
		assertEquals(PlayStuff.valueOf("PAPER").name(), "PAPER");	
		
		for (PlayStuff currentPlayStuff : PlayStuff.values())
		{
			assertEquals(PlayStuff.valueOf(currentPlayStuff.name()).name(), currentPlayStuff.name());
		}		
	}

	//tests if PlayStuff equal
	public void testEnumPlayStuff()
	{				
		for (PlayStuff currentPlayStuff : PlayStuff.values())
		{
			assertEquals(PlayStuff.valueOf(currentPlayStuff.name()), currentPlayStuff);
		}
	}
}
