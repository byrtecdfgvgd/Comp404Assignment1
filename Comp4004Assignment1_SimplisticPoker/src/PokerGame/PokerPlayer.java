package PokerGame;

public class PokerPlayer {

	private String id;
	private Card hand[];
	public HandData handValue;
	
	//GET and SET Methods
	public String getID()
	{
		return id;
	}
		
	public Card getCard(int index)
	{
		return hand[index];
	}
	
	public void setID(String newID)
	{
		id = newID;
	}
	
	//initialized card objects, and sets hand and id from the input string
	public void setPlayer(String input)
	{
	}
	//End GET and SET methods
	
}
