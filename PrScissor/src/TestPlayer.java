import junit.framework.TestCase; //junit test case
//tests enum Player via junit
public class TestPlayer extends TestCase 
{	
	//tests if Player values not null
	public void testEnumNotNullPlayer()
	{
		assertNotNull(new Player().play());
		assertNotNull(new Player().getPlayMode());

		assertNotNull(new Player());
		assertNotNull(new Player().getNumber());
		assertNotNull(new Player().getName());
		
		assertNotNull(new Player("Bob", 15));
		assertNotNull(new Player("Bob", 15).getNumber());
		assertNotNull(new Player("Bob", 15).getName());
	}
	
	//tests if player number equal
	public void testEnumPlayerNumber()
	{		
		assertEquals(new Player().getNumber(), 1);
		assertEquals(new Player("Bob", 15).getNumber(), 15);
	}

	
	//tests if Player names equal
	public void testEnumPlayerNames()
	{		
		assertEquals(new Player().getName(), "Player 1");
		assertEquals(new Player("Bob", 15).getName(), "Bob");
	}

}
