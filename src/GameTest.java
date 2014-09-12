import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GameTest {
	Game g;
	@Before
	public void createGame(){
		g = new Game();
	}
	@Test
	public void gameInitTest() {
		//Arrange
		//Game g = new Game();
		//Act
		String actual = g.getScoreBoard();
		
		//Assert
		assertEquals("name1 Love - name2 Love", actual);
		
	}
	@Test
	public void gameIncrementTest() {
		//Arrange
		//Game g = new Game();
		//Act
		g.incrementPlayerScore(1);
		String actual = g.getScoreBoard();
		
		
		//Assert
		assertEquals("name1 Fifteen - name2 Love", actual);
		g.incrementPlayerScore(2);
		actual = g.getScoreBoard();
		assertEquals("name1 Fifteen - name2 Fifteen", actual);
				
	}
	
	@Test
	public void whenBothPlayersHaveThreePointsAndScoresAreEqualTheScoreIsLove()
	{
		
		//Arrage
		//Game game = new Game();
		
		//Act
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		
		//Assert 
		assertEquals("Deuce",g.getScoreBoard());
		
	}
	
	@Test
		public void whenBothPlayersHaveScoredThreePointsandOnePlayerScoresAgain()
	{
		//Arrange
		//Game game = new Game();
		//Act
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		//Assert
		assertEquals("Advantage name2",g.getScoreBoard());
	}
	
	@Test
		public void whenBothPlayersHaveScoredThreePointsAndPlayerOneScoresAgain(){
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		g.incrementPlayerScore(1);
		
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(2);
		g.incrementPlayerScore(1);
		
		//Assert
		assertEquals("Advantage name1",g.getScoreBoard());
	}
		
}
