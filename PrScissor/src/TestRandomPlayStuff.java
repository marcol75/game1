
import junit.framework.TestCase;

//tests enum PlayStuff
public class TestRandomPlayStuff extends TestCase 
{
	//tests if PlayStuff values not null
	public void testGetRandomPlayStuffValue()
	{
		assertNotNull(RandomPlayStuff.getRandomPlayStuffValue());
	}

}
