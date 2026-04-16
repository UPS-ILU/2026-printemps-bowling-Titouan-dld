package bowling;

public class Bowling {
	
	private int score = 0;
	private int tour = 0;
	
	public Bowling() {
		
	}
	
	public void roll(int NbQuilles) {
		score += NbQuilles;
		tour += 1;
	}
	
	public int score() {
		return score;
	}
}
