package pkgPokerBLL;

import pkgPokerEnum.eAction;
import pkgPokerEnum.eGame;
import pkgPokerEnum.eDrawCount;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Action implements Serializable {

	@XmlElement
	private eAction eAction;

	@XmlElement
	private Player ActPlayer;
	
	private eGame eGame;
	
	private eDrawCount eDrawCount;
	
	public Action()
	{
		
	}
	public Action(eAction eAction, Player player) {
		super();
		this.eAction = eAction;
		this.ActPlayer = player;
		this.eDrawCount = eDrawCount.NONE;
	}


	public eAction getAction() {
		return eAction;
	}
	
	public void setAction(eAction action) {
		eAction = action;
	}
	public Player getPlayer() {
		return ActPlayer;
	}
	public void setPlayer(Player player) {
		this.ActPlayer = player;
	}
	public eGame geteGame() {
		return eGame;
	}
	public void seteGame(eGame eGame) {
		this.eGame = eGame;
	}
	public eDrawCount geteDrawCount() {
		return eDrawCount;
	}
	public void seteDrawCount(eDrawCount eDrawCount) {
		this.eDrawCount = eDrawCount;
	}
	
}