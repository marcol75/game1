import junit.framework.TestCase;

//tests random value class via junit
public class UnitTestRandomValue extends TestCase 
{
	//tests if not null
	public void testNotNullRandomPlayStuff()
	{
		assertNotNull(RandomPlayStuff.getRandomPlayStuffValue());
	}
}
