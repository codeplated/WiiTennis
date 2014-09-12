import static org.junit.Assert.*;

import org.junit.Test;


public class ScoreTest {

	@Test
	public void testCreateNewPlayer() {
		//Arrange
		Player p = new Player("Davide");
		//Act
		Score playerScore = p.getScore();
		//Assert
		assertEquals(Score.Love, playerScore);
	
	}

}
