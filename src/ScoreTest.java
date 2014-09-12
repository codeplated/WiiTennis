import static org.junit.Assert.*;

import org.junit.Test;


public class ScoreTest {

	@Test
	public void testCreateNewPlayer() {
		//Arrange
		Player p = new Player("Davide");
		//Act
		String playerScore = p.getScore();
		//Assert
		assertEquals("Love", playerScore);
	
	}

	@Test
	public void twoScoreWithSameSimpleScoreAreConsideredEqual(){
		Score oneScore = new Score(1);
		Score anotherOneScore = new Score(1);
		assertTrue(oneScore.equals(anotherOneScore));
	}
}
