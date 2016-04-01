//play modes: always choosing rock/scissor/paper or randomly choosing one of them
public enum PlayModes 
{
	ROCK(PlayStuff.ROCK), 
		SCISSOR(PlayStuff.SCISSOR), 
		PAPER(PlayStuff.PAPER), 
		RANDOM_ROCK_SCISSOR, RANDOM_ROCK_STONE, RANDOM_STONE_SCISSOR, RANDOM_ALL;
    private PlayStuff playStuff = PlayStuff.ROCK;
    
    PlayModes()
    {
    	playStuff = RandomPlayStuff.getRandomPlayStuffValue();
    }
    
    PlayModes(PlayStuff _playStuff)
    {
    	playStuff = _playStuff;
    }

	public PlayStuff getPlayStuff() 
	{
		return playStuff;
	}

	public void setPlayStuff(PlayStuff playStuff) 
	{
		this.playStuff = playStuff;
	}

}
