package interfaces.player;

import java.util.List;

public interface Team extends PointHolder{
	/**
	 * Return all player that belong to the teamw
	 * @return
	 */
	public List<Player> getPlayers();
}
