import junit.framework.TestCase; //junit test case

//tests enum PlayMode via junit
public class UnitTestPlayMode extends TestCase 
{
	//tests if PlayMode values not null
	public void testEnumNotNullPlayMode()
	{
		for (PlayModes currentPlayMode : PlayModes.values())
		{
			assertNotNull(PlayModes.valueOf(currentPlayMode.name()));
		}		
	}
	
	//tests if PlayMode names equal
	public void testEnumPlayModeNames()
	{
		assertEquals(PlayModes.valueOf("ROCK").name(), "ROCK");
		assertEquals(PlayModes.valueOf("SCISSOR").name(), "SCISSOR");
		assertEquals(PlayModes.valueOf("PAPER").name(), "PAPER");
		for (PlayModes currentPlayMode : PlayModes.values())
		{
			assertEquals(PlayModes.valueOf(currentPlayMode.name()).name(), currentPlayMode.name());
			assertEquals(PlayModes.valueOf(currentPlayMode.name()).name(), currentPlayMode.name());
		}		
	}

	//tests if PlayMode equal
	public void testEnumPlayMode()
	{			
		for (PlayModes currentPlayMode : PlayModes.values())
		{
			assertEquals(PlayModes.valueOf(currentPlayMode.name()), currentPlayMode);
		}
		assertEquals(PlayModes.ROCK.getPlayStuff().toString(), PlayModes.ROCK.toString());
	}
}
