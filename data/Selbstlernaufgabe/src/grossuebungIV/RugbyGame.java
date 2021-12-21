package grossuebungIV;
public class RugbyGame {
	public static void main(String[] args) {
		RugbyGame game = new RugbyGame();
		//TODO implement course of the game here



	}

	
	private Team teamA;
	private Team teamB;
	
	public RugbyGame() {
		teamA = new Team("A");
		teamB = new Team("B");
	}

	public void displayScore() {
		System.out.println(teamA.getScore() + ":" + teamB.getScore());
	}

}