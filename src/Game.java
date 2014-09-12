public class Game {
	private static final int ONE_POINT = 1;
	private static final int FORTY = 3;
	private Player p1, p2;

	public Game() {
		p1 = new Player("name1");
		p2 = new Player("name2");
	}

	public String getScoreBoard() {
		String result = "";
		
		if (isNotAnAdvantageGame()) 
			result  = p1.getName() + " " + p1.getScore() + " - " + p2.getName() + " " + p2.getScore();
		else if (isDeuce()) result =  "Deuce";
		else if (isAdvantage(p2, p1)) result = "Advantage " + p2.getName();
		else if (isAdvantage(p1, p2)) result = "Advantage " + p1.getName();

		return result;
			
	
	}

	private boolean isNotAnAdvantageGame() {
		return p1.getSimpleScore() < FORTY && p2.getSimpleScore() < FORTY;
	}

	private boolean isAdvantage(Player first, Player second) {
		int firstScore = first.getSimpleScore();
		int secondScore = second.getSimpleScore();

		return (firstScore - secondScore == ONE_POINT && secondScore >= FORTY);
	}

	private boolean isDeuce() {
		return p1.getSimpleScore() == p2.getSimpleScore()
				&& p1.getSimpleScore() >= FORTY;
	}

	public void incrementPlayerScore(int index) {
		if (index == 1) {
			p1.incrementScore();
		} else if (index == 2) {
			p2.incrementScore();
		}
	}

}
