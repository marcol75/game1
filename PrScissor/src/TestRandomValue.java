import junit.framework.TestCase;

//tests random value class via junit
public class TestRandomValue extends TestCase 
{

	public void testNotNullRandomPlayStuff()
	{
		assertNotNull(RandomPlayStuff.getRandomPlayStuffValue());
	}
}
