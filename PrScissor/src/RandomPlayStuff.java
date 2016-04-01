import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPlayStuff 
{
	static Random randomNo = new Random();
	private static PlayStuff playStuff;

	//gets randomly rock, paper or scissor
	public static PlayStuff getRandomPlayStuffValue()
	{
		List<PlayStuff> listPlayStuff = new ArrayList<PlayStuff>();				
		initPlayStuffList(listPlayStuff);	
	    int randomly_chosen = new Random().nextInt(PlayStuff.values().length);
	    playStuff = PlayStuff.values()[randomly_chosen];
	    return playStuff;    
	}

	//inits the list
	private static void initPlayStuffList(List<PlayStuff> _listPlayStuff) 
	{
		for (PlayStuff currentPlayStuff : PlayStuff.values())
		{
			_listPlayStuff.add(currentPlayStuff);
		}
	}
}
