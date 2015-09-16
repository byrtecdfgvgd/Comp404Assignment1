package JUnitTests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PokerGame.Card;
import PokerGame.PokerPlayer;



public class GameTests {

	@Test
	public void testCard() {
		Card testCard = new Card();

		//returnCardString() test1
		testCard.number = 14;
		testCard.suit = 1;
		assertEquals("AceClubs", testCard.toString());
		
		//returnCardString() test2
		testCard.number = 7;
		testCard.suit = 2;
		assertEquals("SevenHearts", testCard.toString());		

		//returnCardString() test3
		testCard.number = 11;
		testCard.suit = 3;
		assertEquals("JackSpades", testCard.toString());
		
		//setCard(String) test1
		assertEquals(0, testCard.setCard("TwoSpades"));
		
		//setCard(String) test2
		assertEquals(-1, testCard.setCard("OneSpades"));
		
		//setCard(String) test3
		assertEquals(-2, testCard.setCard("TwoHeads"));
	}
	
	@Test
	public void testPlayers() {
		PokerPlayer myPlayer = new PokerPlayer();
		//TESTING setPlayer()
		//set player data form an input string
		myPlayer.setPlayer("1 TwoHearts ThreeHearts FourHearts FiveHearts SixHearts");
		//checks that the data was all set correctly
		assertEquals("TwoHearts", myPlayer.getCard(0).toString());
		assertEquals("SixHearts", myPlayer.getCard(4).toString());
		assertEquals("1", myPlayer.getID());
	}

}
