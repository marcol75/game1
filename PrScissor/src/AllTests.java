

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests 
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite();

		suite.addTestSuite(TestFixValue.class);
		suite.addTestSuite(TestPlayer.class);
		suite.addTestSuite(TestPlayMode.class);

		suite.addTestSuite(TestPlayStuff.class);
		suite.addTestSuite(TestRandomPlayStuff.class);
		suite.addTestSuite(TestRandomValue.class);
		return suite;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		junit.textui.TestRunner.run(suite());
	}
}
