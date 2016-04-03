import junit.framework.TestCase;

//tests some methods in RockStoneScissorRun
public class UnitTestRockStoneScissorRun extends TestCase 
{

	public void testWinnerNotNull()
	{
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.SCISSOR));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.PAPER));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.ROCK));
		
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.SCISSOR));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.PAPER));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.ROCK));
		
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.SCISSOR));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.PAPER));
		assertNotNull(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.ROCK));
	}
	
	//tests iof the right winner will be returned
	public void testWinnerCorrect()
	{
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.SCISSOR), 1);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.PAPER), -1);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.ROCK, PlayStuff.ROCK), 0);
		
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.SCISSOR), 0);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.PAPER), 1);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.SCISSOR, PlayStuff.ROCK), -1);
		
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.SCISSOR), -1);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.PAPER), 0);
		assertEquals(RockPaperScissorRun.getWinner(PlayStuff.PAPER, PlayStuff.ROCK), 1);
	}
}
