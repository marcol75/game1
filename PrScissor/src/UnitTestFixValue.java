import junit.framework.TestCase;

//tests if player chooses PlayStuff.ROCK
public class UnitTestFixValue extends TestCase 
{
	private static final PlayStuff ExpectedValue = PlayStuff.ROCK; //must return PlayStuff.ROCK
	//tests if rock will be returned
	public void testFixValue()
	{
		assertEquals(ExpectedValue, FixValue.getValue());
	}

}
