package session2.sqat.tol.oulu.fi;
import java.util.HashMap;


public class Score implements Comparable<Score> {
	private int simpleScore;
	private HashMap<Integer, String> scoreMapping;
	
	public Score(int score) {
		initializeScoreMapping();
		this.simpleScore = score;
		
	}

	public Score(){
		initializeScoreMapping();
		this.simpleScore = 0;
	}
	
	private void initializeScoreMapping() {
		this.scoreMapping = new HashMap<Integer, String>();
		scoreMapping.put(0, "Love");
		scoreMapping.put(1, "Fifteen");
		scoreMapping.put(2, "Thirty");
		scoreMapping.put(3, "Forty");
	}

	private int getSimpleScore() {
		return simpleScore;
	}

	public void increment() {
		this.simpleScore++;
		
	}

	public String toString() {
		return this.scoreMapping.get(this.getSimpleScore());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + simpleScore;
		return result;
	}

	@Override
	public int compareTo(Score o) {
		 if (!(o instanceof Score))
		      throw new ClassCastException("A Score object expected.");
		    int anotherScore = ((Score) o).getSimpleScore();  
		    return this.simpleScore - anotherScore;   
	}
}