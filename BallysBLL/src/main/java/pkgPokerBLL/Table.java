package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;
public class Table implements Serializable {

	private UUID TableID;
	private int NoOfPlayers; 
	// Change this from ArrayList to HashMap.
	//private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	private HashMap<Double, Player> TablePlayers = new HashMap<Double, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
		NoOfPlayers= 0;
	}

	public Table AddPlayerToTable(Player p) {
		// TODO: Lab #4 Add a player to the table (should be pretty easy)
		NoOfPlayers = NoOfPlayers + 1;
		TablePlayers.put((double) NoOfPlayers, p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		// TODO: Lab #4 Remove a player from the table
		double k = 0.0;
		for (Entry<Double, Player> E: TablePlayers.entrySet())
			if (p.equals(E.getValue()))
				k = E.getKey();
		TablePlayers.remove(k);
		
		NoOfPlayers= NoOfPlayers - 1;
		
		return this;
	}
}
