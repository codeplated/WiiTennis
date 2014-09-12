public class Game {
	private Player p1, p2;

	public Game() {
		p1 = new Player("name1");
		p2 = new Player("name2");
	}

	public String getScoreBoard() {
		String result = "";
		
		if (p1.getSimpleScore() < 3 && p2.getSimpleScore() < 3) 
			result  = p1.getName() + " " + p1.getScore().toString() + " - " + p2.getName() + " " + p2.getScore().toString();
		else if (isDeuce()) result =  "Deuce";
		else if (isAdvantage(p2, p1)) result = "Advantage " + p2.getName();
		else if (isAdvantage(p1, p2)) result = "Advantage " + p1.getName();

		return result;
			
	
	}

	private boolean isAdvantage(Player first, Player second) {
		int firstScore = first.getSimpleScore();
		int secondScore = second.getSimpleScore();

		return (firstScore - secondScore == 1 && secondScore >= 3);
	}

	private boolean isDeuce() {
		return p1.getSimpleScore() == p2.getSimpleScore()
				&& p1.getSimpleScore() >= 3;
	}

	public void incrementPlayerScore(int index) {
		if (index == 1) {
			p1.incrementScore();
		} else if (index == 2) {
			p2.incrementScore();
		}
	}

}
