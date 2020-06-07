package board;
import players.Players;

public class Board {
	
	public Board() {
		Players p1 = new Players();
		Players p2 = new Players();
		
		Pit [] p1_pits = new Pit[3];
		Pit [] p2_pits = new Pit[3];
		
		Goal_Pit p1_gpit = new Goal_Pit(p1);
		Goal_Pit p2_gpit = new Goal_Pit(p2);
	}
	

}
