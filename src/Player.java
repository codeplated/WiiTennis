
public class Player {
	private String score;
	private String name;
	private int simpleScore;
	public int getSimpleScore() {
		return simpleScore;
	}
	public void setSimpleScore(int simpleScore) {
		this.simpleScore = simpleScore;
	}
	public Player(String name) {

		this.setSimpleScore(0);;
		this.name = name;
	}
	public String getScore() {
		return Score.values()[this.getSimpleScore()].toString();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void incrementScore() {
		this.simpleScore++;
	}
	

	
	
	
	
	
}
