package board;
import players.Players;

public class Goal_Pit extends Pit {
	
	private Players player;
	
	// each goal pit is assigned a player
	public Goal_Pit(Players player) { this.player = player; }
	
	public Players get_player() { return this.player; }
	
}
