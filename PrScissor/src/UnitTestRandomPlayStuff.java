
import junit.framework.TestCase;

//tests enum PlayStuff
public class UnitTestRandomPlayStuff extends TestCase 
{
	//tests if PlayStuff values not null
	public void testGetRandomPlayStuffValue()
	{
		assertNotNull(RandomPlayStuff.getRandomPlayStuffValue());
	}

}
