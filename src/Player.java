
public class Player {
	private Score score;
	private String name;

	public Player(String name) {

		this.setScore(Score.values()[0]);
		this.name = name;
	}
	public Score getScore() {
		return score;
	}

	public void setScore(Score love) {
		this.score = love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void incrementScore() {
		Score scorenow[] = Score.values();
		Score current = getScore();
		switch(current) {
		case Love:
			this.setScore(Score.Fifteen);
			break;
			
		case Fifteen:
			this.setScore(Score.Thirty);
			break;
			
		case Thirty:
			this.setScore(Score.Forty);
			break;
		case Forty:
			this.setScore(Score.Deuce);
			break;
		}
	}
	
	
	
	
	
	
}
