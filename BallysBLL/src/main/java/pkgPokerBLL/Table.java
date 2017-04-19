
package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;

public class Table implements Serializable {

	@XmlElement
	private UUID TableID;

	@XmlElement
	private HashMap HashMapPlayers = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public UUID getTableID() {
		return TableID;
	}
	
	public HashMap getHashPlayers(){
		return HashMapPlayers;
	}
	
	
	public Table AddPlayerToTable(Player p) {
		HashMapPlayers.put(p.getPlayerID(), p);
		return this;
	}

	
	public Table RemovePlayerFromTable(Player p) {
		HashMapPlayers.remove(p.getPlayerID());
		return this;
	}
	

}
