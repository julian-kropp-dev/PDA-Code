package grossuebungIV;
public class Team {
	
	private static final int DEFAULT_TEAM_SIZE = 15;
	
	private String name = "";
	private Player[] players = new Player[DEFAULT_TEAM_SIZE];
	private Goal goal;
	private int score = 0;
	
	public Team(String name) {
		this.name = name;
		goal = new Goal(this);
		for (int i = 1; i <= DEFAULT_TEAM_SIZE; i++) {
			players[i-1] = new Player(Integer.toString(i), this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public Player[] getPlayers() {
		return players;
	}
	
	/**
	 * Returns the player with the given number (1-15)
	 * @param number The number 1 through 15 (inclusive)
	 * @return The player with this number
	 */
	public Player getPlayer(int number) {
		return players[number - 1];
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void increaseScore() {
		score++;
	}

}
