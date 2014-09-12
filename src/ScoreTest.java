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
		assertEquals(Score.Love.toString(), playerScore);
	
	}

}
