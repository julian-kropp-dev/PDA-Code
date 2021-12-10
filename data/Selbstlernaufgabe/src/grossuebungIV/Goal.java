package grossuebungIV;
public class Goal {
	
	private Team team;
	
	public Goal(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void hit(Ball ball) {
		team.getPlayer(1).setBall(ball);
	}

}
