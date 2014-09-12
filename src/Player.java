
public class Player {
	
	private String name;

	private Score score; 
	public int getSimpleScore() {
		return score.getSimpleScore();
	}
	public void setSimpleScore(int simpleScore) {
		this.score.setSimpleScore(simpleScore);
	}
	public Player(String name) {
		this.score = new Score(0);
		this.name = name;
	}
	public String getScore() {
		return this.score.getScore();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void incrementScore() {
		this.score.setSimpleScore(this.score.getSimpleScore() + 1);
	}
	

	
	
	
	
	
}
