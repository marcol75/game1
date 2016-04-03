import junit.framework.TestCase;

//tests some methods in RockStoneScissorRun
public class UnitTestRockStoneScissorRun extends TestCase 
{

	public void testWinnerNotNull()
	{
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.SCISSOR));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.PAPER));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.ROCK));
		
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.SCISSOR));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.PAPER));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.ROCK));
		
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.SCISSOR));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.PAPER));
		assertNotNull(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.ROCK));

	}
	
	//tests iof the right winner will be returned
	public void testWinnerCorrect()
	{
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.SCISSOR), 1);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.PAPER), -1);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.ROCK), 0);
		
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.SCISSOR), 0);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.PAPER), 1);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.ROCK), -1);
		
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.SCISSOR), -1);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.PAPER), 0);
		assertEquals(RockStoneScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.ROCK), 1);

	}


}
