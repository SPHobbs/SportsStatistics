
public class football {
	private static String teamName;
	private static int wins;
	private static int losses;
	public football(String TeamName, int Wins, int Losses) {
	    teamName = TeamName;
	    wins = Wins;
	    losses = Losses;
	}
	public String toString(){
		return "Team Name: " + teamName + ".\nTotal Wins: " + wins+ ".\nTotal Losses: " + losses;
	}
}
