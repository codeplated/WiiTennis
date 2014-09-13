package session2.sqat.tol.oulu.fi;

public class Game {
	private static final String ADVANTAGE = "Advantage";
	private static final String DEUCE = "Deuce";
	private static final String SPACE = " ";
	private static final String DASH = "-";
	private static final String WINS = "wins";

	private Player p1, p2;
	private String gameStatus;

	public Game() {
		p1 = new Player("name1");
		p2 = new Player("name2");
		setGameStatus();
	}

	public void setGameStatus() {
		StringBuilder result = new StringBuilder();
		if (isNotAnAdvantageGame()) {
			result.append(p1.getName()).append(SPACE).append(p1.getScore());
			result.append(SPACE).append(DASH).append(SPACE);
			result.append(p2.getName()).append(SPACE).append(p2.getScore());
		}
		

		else if (isDeuce()) result.append(DEUCE);
		else if (advantagePlayer()!=null) result.append(ADVANTAGE).append(SPACE).append(advantagePlayer().getName());
		else if (theWinner()!=null) result.append(theWinner().getName()).append(SPACE).append(WINS);
	
		
		this.gameStatus = result.toString();
	}
	
	private Player theWinner() {
		Player theWinner = null;
		if (p1.hasMoreThanFourtyPoints() && p1.hasTwoPointsAdvantageOn(p2)) theWinner = p1;
		else if(p2.hasMoreThanFourtyPoints() && p2.hasTwoPointsAdvantageOn(p1)) theWinner = p2;
		return theWinner;
	}



	public String getGameStatus(){
		return this.gameStatus;
	}

	private boolean isNotAnAdvantageGame() {
		return p1.hasLessThenFortyPoints() && p2.hasLessThenFortyPoints();
	}



	private Player advantagePlayer() {
		Player result = null;
		if (p2.hasAtLeastFortyPoints() && p1.hasAtLeastFortyPoints() && p1.hasOnePointAdvantageOn(p2)) result = p1;
		else if (p2.hasAtLeastFortyPoints() && p1.hasAtLeastFortyPoints() && p2.hasOnePointAdvantageOn(p1)) result = p2;
		return result;
	}



	private boolean isDeuce() {
		return p1.isTieWith(p2) && p1.hasAtLeastFortyPoints();
	}

	
	public void incrementPlayerScore(Player player) {
		if (player.equals(p1)) {
			p1.incrementScore();
		} else if (player.equals(p2)) {
			p2.incrementScore();
		}
		setGameStatus();
	}

}
