package bowling;

public class Bowling {
	
	private int score;
	
	public Bowling() {
		
	}
	
	public void roll(int NbQuilles) {
		score += NbQuilles;
	}
	
	public int score() {
		return score;
	}
}
