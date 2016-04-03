//player
public class Player 
{
	//variables
	private PlayModes playMode; //player's play mode
	private String name; 		//player's name
	private int number;  		//player's number
	
	//methods
	
	//returns player's number
	public int getNumber() 
	{
		return number;
	}

	//sets player's number
	public void setNumber(int _number) 
	{
		this.number = _number;
	}

	//returns player's name
	public String getName() 
	{
		return name;
	}

	//sets player's name
	public void setName(String _name) 
	{
		this.name = _name;
	}

	//constructor with params
	public Player(String _name, int _number) 
	{
		this.playMode = PlayModes.ROCK;
		this.number = _number;
		this.name = _name;
	}

	
	//simple constructor
	public Player() 
	{
		this("Player 1", 1);
	}
	
	//returns play mode
	public PlayModes getPlayMode() 
	{
		return playMode;
	}

	//sets play mode
	public void setPlayMode(PlayModes _playMode) 
	{
		this.playMode = _playMode;
	}

	//returns rock, paper or scissor (depending on mode)
	public PlayStuff play() 
	{
		//default init mode
		PlayStuff chosenPlayStuff = PlayStuff.ROCK;
		switch (this.playMode) 
		{
			case RANDOM_ALL:
			{
				chosenPlayStuff  = RandomPlayStuff.getRandomPlayStuffValue();
			}
			default:
			{
				chosenPlayStuff = this.playMode.getPlayStuff();
			}
		}	
		return chosenPlayStuff;			
	}
}
