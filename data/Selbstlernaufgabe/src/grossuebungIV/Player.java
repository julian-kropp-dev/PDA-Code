package grossuebungIV;
public class Player {
	
	private String name = "";
	private Team team;
	private Ball ball = null;

	public Player(String name, Team team) {
		this.name = name;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean hasBall() {
		return ball != null;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void pass(Player other) {
		if (hasBall() && other.getTeam() == team) {
			other.setBall(ball);
			setBall(null);
		}
	}
	
	public void score(Goal goal) {
		if (hasBall() && goal.getTeam() != team) {
			goal.hit(ball);
			team.increaseScore();
			setBall(null);
		}
	}
	
	public void attack(Player other) {
		if (other.hasBall() && other.getTeam() != team) {
			setBall(other.getBall());
			other.setBall(null);
		}
	}

}
