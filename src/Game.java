
public class Game {
	private Player p1, p2;
	
	public Game(){
		p1=new Player("name1");
		p2=new Player("name2");
	}
	
	public String getScoreBoard(){
		String score = p1.getName() + " " + p1.getScore().toString();
		String score2 = p2.getName() + " " + p2.getScore().toString();
		if (isDeuce()) {
			return "Deuce";
		}
		else if (isAdvantage(p2, p1)) return "Advantage " + p2.getName();
		else if (isAdvantage(p1, p2)) return "Advantage " + p1.getName();
	
		else return score + " - " + score2;
	}
	
	private boolean isAdvantage(Player first, Player second)
	{
		int firstScore = first.getScore().ordinal();
		int secondScore = second.getScore().ordinal();
		
		return (firstScore > secondScore && secondScore > Score.Forty.ordinal());
	}
	private boolean isDeuce() {
		return p1.getScore() == p2.getScore() && p1.getScore().ordinal() >= Score.Forty.ordinal();
	}
	
	public void incrementPlayerScore(int index) {
		if (index == 1) {
			p1.incrementScore();
		} else if(index == 2) {
			p2.incrementScore();
		}
	}
		
		
}
