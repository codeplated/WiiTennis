package session2.sqat.tol.oulu.fi;

public class Game {
	private static final String ADVANTAGE = "Advantage";
	private static final String DEUCE = "Deuce";
	private static final int ONE_POINT = 1;
	private static final Score FORTY = new Score(3);
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
		else if (isAdvantage(p2, p1)) result.append(ADVANTAGE).append(SPACE).append(p2.getName());
		else if (isAdvantage(p1, p2)) result.append(ADVANTAGE).append(SPACE).append(p1.getName());
		else if (isWinner(p1)) result.append(p1.getName()).append(SPACE).append(WINS);
		else if (isWinner(p2)) result.append(p2.getName()).append(SPACE).append(WINS);
		this.gameStatus = result.toString();
	}
	
	private boolean isWinner(Player player) {
		if (player.getScore().compareTo(FORTY)>0) return true;
		return false;
	}

	public String getGameStatus(){
		return this.gameStatus;
	}

	private boolean isNotAnAdvantageGame() {
		return p1.getScore().compareTo(FORTY)<0 && p2.getScore().compareTo(FORTY)<0;
	}

	private boolean isAdvantage(Player first, Player second) {
		Score firstScore = first.getScore();
		Score secondScore = second.getScore();
		return firstScore.compareTo(secondScore) == ONE_POINT && secondScore.compareTo(FORTY)>=0;
	}

	private boolean isDeuce() {
		return p1.getScore().compareTo(p2.getScore())==0
				&& p1.getScore().compareTo(FORTY)>=0;
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