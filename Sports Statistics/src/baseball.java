
public class baseball {

	private static String teamName;
	private static int wins;
	private static int losses;
	public baseball(String TeamName, int Wins, int Losses) {
	    teamName = TeamName;
	    wins = Wins;
	    losses = Losses;
	}
	public String toString(){
		return "Team Name: " + teamName + ".\nTotal Wins: " + wins+ ".\nTotal Losses: " + losses;
	}
}
