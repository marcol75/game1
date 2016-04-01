import junit.framework.TestCase;


public class TestFixValue extends TestCase 
{

	private static final PlayStuff ExpectedValue = PlayStuff.ROCK;

	//tests if rock will be returned
	public void testFixValue()
	{
		assertEquals(ExpectedValue, FixValue.getValue());
	}

}
