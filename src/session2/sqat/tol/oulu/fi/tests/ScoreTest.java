package session2.sqat.tol.oulu.fi.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import session2.sqat.tol.oulu.fi.Player;
import session2.sqat.tol.oulu.fi.Score;


public class ScoreTest {

	@Test
	public void testCreateNewPlayer() {
		//Arrange
		Player p = new Player("Davide");
		//Act
		Score playerScore = p.getScore();
		//Assert
		assertEquals("Love", playerScore.toString());
	
	}

	@Test
	public void twoScoreWithSameSimpleScoreAreConsideredEqual(){
		Score oneScore = new Score(1);
		Score anotherOneScore = new Score(1);
		assertTrue(oneScore.compareTo(anotherOneScore)==0);
	}
	@Test
	public void twoScore3SimpleScoreAreConsideredEqual(){
		Score oneScore = new Score(3);
		Score anotherOneScore = new Score(3);
		Score loveScore = new Score();
		assertTrue(oneScore.compareTo(anotherOneScore)==0);
		assertEquals("Forty", oneScore.toString());
		assertEquals("Love", loveScore.toString());
	}
	
	@Test
	public void fortyIsBiggerThanFifteen(){
		Score fifteen = new Score(1);
		Score forty = new Score(3);
		assertEquals(-2,fifteen.compareTo(forty));

	}
	@Test
	public void whenAPlayerIsCreatedHasScore0akaLove(){
		Player player = new Player("Roger");
		assertEquals("Roger", player.getName());
		assertEquals("Love", player.getScore().toString());
	}
}
