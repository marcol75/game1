

import junit.framework.Test;
import junit.framework.TestSuite;


//all junit tests
public class AllUnitTests 
{
	//test suite  for all junit tests
	public static Test suite()
	{
		TestSuite suite = new TestSuite();

		suite.addTestSuite(UnitTestRockStoneScissorRun.class);
		suite.addTestSuite(UnitTestFixValue.class);
		suite.addTestSuite(UnitTestPlayer.class);
		suite.addTestSuite(UnitTestPlayMode.class);
		suite.addTestSuite(UnitTestPlayStuff.class);
		suite.addTestSuite(UnitTestRandomPlayStuff.class);
		suite.addTestSuite(UnitTestRandomValue.class);
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
