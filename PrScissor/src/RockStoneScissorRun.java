//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//main class - simulates a rock, paper, scissors game
public class RockStoneScissorRun 
{
	private static final int NoRounds = 100; //no of rounds
	static int roundsWithOutWinner = 0;
	static int roundsWonPlayer2 = 0;
	static int roundsWonPlayer1 = 0;

	static Random randomNo = new Random();
	private static PlayStuff playStuffPlayer1;
	
	//players
	private static Player player1 = new Player();
	private static Player player2 = new Player();
	
	static HashMap<Integer, Player> players = new HashMap<Integer, Player>(); //players map
	static HashMap<Integer, HashMap<PlayStuff, Integer>> hmChosenStuffs = new HashMap<Integer, HashMap<PlayStuff, Integer>>(); 
	
	//playing 100 rounds
	public static void main(String[] args)
	{
		initPlayers(); //inits
		playSeveralTimes(NoRounds); //100 times
		System.out.println("Player " + player1.getName()  + " won " + roundsWonPlayer1 + " / " + NoRounds + " times.");
		System.out.println("Player " + player2.getName()  + " won " + roundsWonPlayer2 + " / " + NoRounds + " times.");
		System.out.println("Nobody          won " + roundsWithOutWinner + " / 100 times.");
		System.out.println("**********************************************");
		
		if (roundsWonPlayer1 > roundsWonPlayer2)
		{
			System.out.println("Total winner after " + NoRounds + " rounds : Player " + player1.getName());
		}
		else if (roundsWonPlayer1 < roundsWonPlayer2) 
		{
			System.out.println("Total winner after " + NoRounds + " rounds : Player " + player2.getName());
		}
		
		int intPlayer1ChosenRock =  hmChosenStuffs.get(player1.getNumber()).get(PlayStuff.ROCK);
		int intPlayer1ChosenScissor =  hmChosenStuffs.get(player1.getNumber()).get(PlayStuff.SCISSOR);		
		int intPlayer1ChosenPaper =  hmChosenStuffs.get(player1.getNumber()).get(PlayStuff.PAPER);
		
		System.out.println("**********************************************");
		
		System.out.println("Player 1 chose rock " + intPlayer1ChosenRock + " times.");
		System.out.println("Player 1 chose scissor " + intPlayer1ChosenScissor + " times.");
		System.out.println("Player 1 chose paper " + intPlayer1ChosenPaper + " times.");
	}
	
	//some runs
	private static void playSeveralTimes(int _runs) 
	{
		initHMChosenStuff();
		for (int runNr = 1; runNr <= _runs; runNr ++)
		{
		    int pick = new Random().nextInt(PlayStuff.values().length);
		    playStuffPlayer1 = PlayStuff.values()[pick];
			playOnce(playStuffPlayer1);
		}
	}

	//one run
	public static void playOnce(PlayStuff _playStuffPlayer1)
	{
		PlayStuff chosenStuffPlayer1 = _playStuffPlayer1;
		PlayStuff chosenStuffPlayer2 = player2.play(); //getting always rock
		try 
		{
			Integer intHowOftenChosenPlayer1 = hmChosenStuffs.get(player1.getNumber()).get(chosenStuffPlayer1) + 1; //counting
			hmChosenStuffs.get(player1.getNumber()).put(chosenStuffPlayer1, intHowOftenChosenPlayer1);
			Integer intHowOftenChosenPlayer2 = hmChosenStuffs.get(player2.getNumber()).get(chosenStuffPlayer2) + 1; //counting			 
			hmChosenStuffs.get(player2.getNumber()).put(chosenStuffPlayer2, intHowOftenChosenPlayer2);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

		int intWinner = getWinner(chosenStuffPlayer1, chosenStuffPlayer2);
//		showWinner(chosenStuffPlayer1, chosenStuffPlayer2, intWinner);
		
		if (intWinner > 0)
		{
			roundsWonPlayer1 ++;
		}
		else if (intWinner < 0)
		{
			roundsWonPlayer2 ++;
		}
		else
		{
			roundsWithOutWinner++;
		}		
	}

	private static void showWinner(PlayStuff _chosenStuffPlayer1,
			PlayStuff _chosenStuffPlayer2, int _intWinner) 
	{
		if (_intWinner > 0)
		{
			System.out.println("Winner: PLAYER 1!! : " + _chosenStuffPlayer1 + " beats " + _chosenStuffPlayer2);
		}
		else if (_intWinner < 0) 
		{
			System.out.println("Winner: PLAYER 2!! : " + _chosenStuffPlayer2 + " beats " + _chosenStuffPlayer1);
		}
		else
		{			
			System.out.println("NO WINNER!! : " + _chosenStuffPlayer1 + " equals " + _chosenStuffPlayer2);
		}
	}

	//returns if player1 or player2 has won
	protected static int getWinner(PlayStuff _chosenStuffPlayer1,
			PlayStuff _chosenStuffPlayer2) 
	{
		int result = -10;
		if (_chosenStuffPlayer1.equals(_chosenStuffPlayer2))
		{
			result = 0;
		}
		else switch(_chosenStuffPlayer1)
		{
			case ROCK: // player 1 chose rock
			{
				if (_chosenStuffPlayer2.equals(PlayStuff.PAPER)) // player 2 chose paper
				{
					result = -1; // 2 wins
					break;
				}
				else //player 2 chose scissor
				{
					result = 1; // 1 wins
					break;
				}
			}
			
			case SCISSOR: // player 1 chose scissor
			{
				if (_chosenStuffPlayer2.equals(PlayStuff.PAPER)) // player 2 chose paper
				{
					result = 1; // 1 wins
					break;
				}
				else //player 2 chose rock
				{
					result = -1; // 2 wins
					break;
				}
			}
			case PAPER:  // player 1 chose paper
			{
				if (_chosenStuffPlayer2.equals(PlayStuff.SCISSOR)) // player 2 chose scissor
				{
					result = -1; // 2 wins
					break;
				}
				else //player 2 chose rock
				{
					result = 1; // 1 wins
					break;
				}		
			}
			default: 
			{
				break; // result -10
			}
		}		
		return result;
	}

	//hash map inits
	private static void initHMChosenStuff() 
	{
		HashMap<PlayStuff, Integer> hmPlayStuff1 = new HashMap<PlayStuff, Integer>();
		HashMap<PlayStuff, Integer> hmPlayStuff2 = new HashMap<PlayStuff, Integer>();		
		for (PlayStuff currentPlayStuff : PlayStuff.values())
		{
			hmPlayStuff1.put(currentPlayStuff, 0); //rock, scissors, paper chosen 0 times
			hmPlayStuff2.put(currentPlayStuff, 0); //rock, scissors, paper chosen 0 times
		}	
		hmChosenStuffs.put(player1.getNumber(), hmPlayStuff1); //player 1 inits
		hmChosenStuffs.put(player2.getNumber(), hmPlayStuff2); //player 2 inits
	}

	//every player gets a number
	private static void initPlayerNumbers() 
	{
		int intPlayerNumber = 0;
		for (Player currentPlayer : players.values())
		{
			intPlayerNumber += 1;
			currentPlayer.setNumber(intPlayerNumber);
		}		
	}

	//adds players to list and inits their names and play modes
	private static void initPlayers() 
	{
		players.put(1, player1);
		players.put(2, player2);
		initPlayerPlayModes();
		initPlayerNumbers();
		try 
		{
			initPlayerNames();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	//inits play modes
	private static void initPlayerPlayModes() 
	{
		player1.setPlayMode(PlayModes.RANDOM_ALL);
		player2.setPlayMode(PlayModes.ROCK);
	}

	//reads and sets players' names
	private static void initPlayerNames() throws IOException 
	{
		for (int currentPlayerNumber : players.keySet())
		{
			String strPlayerName = "Player " + currentPlayerNumber;
			players.get(currentPlayerNumber).setName(strPlayerName);
		}		
	}

//	private static String readPlayerName(Player currentPlayer) throws IOException 
//	{
//		String StrNameText = "Name Player " + currentPlayer.getNumber() + " :";
//		System.out.println(StrNameText);
//	    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//	    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		String strPlayerName = bufferedReader.readLine();
//		System.out.println( strPlayerName );
//		return strPlayerName;
//	}
}
