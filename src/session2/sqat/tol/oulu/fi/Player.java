package session2.sqat.tol.oulu.fi;


public class Player {
	
	private static final Score FORTY = new Score(3);
	private static final int ONE_POINT = 1;
	private static final int TWO_POINTS = 2;
	private String name;
	private Score score; 
	

	public Player(String name) {
		this.score = new Score();
		this.name = name;
	}
	public Score getScore() {
		return this.score;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void incrementScore() {
		this.score.increment();
	}
	
	protected boolean isTieWith(Player opponent) {
		return this.getScore().compareTo(opponent.getScore())==0;
	}
	protected boolean hasAtLeastFortyPoints() {
		return this.getScore().compareTo(FORTY)>=0;
	}
	protected boolean hasOnePointAdvantageOn(Player opponent) {
		return this.getScore().compareTo(opponent.getScore()) == ONE_POINT;
	}
	
	protected boolean hasLessThenFortyPoints() {
		return this.getScore().compareTo(FORTY)<0;
	}
	
	protected boolean hasMoreThanFourtyPoints() {
		return this.getScore().compareTo(FORTY)>0;
	}
	
	protected boolean hasTwoPointsAdvantageOn(Player opponent) {
		return this.getScore().compareTo(opponent.getScore()) >= TWO_POINTS;
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
