package session2.sqat.tol.oulu.fi.tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import session2.sqat.tol.oulu.fi.Game;
import session2.sqat.tol.oulu.fi.Player;


public class GameTest {
	Game g;
	Player p1;
	Player p2;
	@Before
	public void createGame(){
		g = new Game();
		p1 = new Player("name1");
		p2 = new Player("name2");
	}
	@Test
	public void gameInitTest() {
		//Act
		String actual = g.getGameStatus();
		
		//Assert
		assertEquals("name1 Love - name2 Love", actual);
		
	}
	@Test
	public void gameIncrementTest() {

		//Act
		g.incrementPlayerScore(p1);
		String actual = g.getGameStatus();
		
		
		//Assert
		assertEquals("name1 Fifteen - name2 Love", actual);
		g.incrementPlayerScore(p2);
		actual = g.getGameStatus();
		assertEquals("name1 Fifteen - name2 Fifteen", actual);
				
	}
	
	@Test
	public void whenBothPlayersHaveThreePointsAndScoresAreEqualTheScoreIsLove()
	{
	
		//Act
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		
		//Assert 
		assertEquals("Deuce",g.getGameStatus());
		
	}
	
	@Test
		public void whenBothPlayersHaveScoredThreePointsandOnePlayerScoresAgain()
	{
		//Act
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		//Assert
		assertEquals("Advantage name2",g.getGameStatus());
	}
	
	@Test
		public void whenBothPlayersHaveScoredThreePointsAndPlayerOneScoresAgain(){
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		
		
		//Assert
		assertEquals("Advantage name1",g.getGameStatus());
	}
	
	@Test 
	public void firstPlayerHasAnEasyWin(){
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);
		
		assertEquals("name1 wins", g.getGameStatus());
		
	}
	
	@Test 
	public void secondPlayerHasAnEasyWin(){
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		
		assertEquals("name2 wins", g.getGameStatus());
		
	}
	

	@Test 
	public void secondPlayerWinsAtThirty(){
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);
		g.incrementPlayerScore(p2);

		g.incrementPlayerScore(p1);
		g.incrementPlayerScore(p1);

		
		assertEquals("name2 wins", g.getGameStatus());
		
	}
		
}
