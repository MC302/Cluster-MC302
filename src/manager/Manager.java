package manager;

import game.*;

public class Manager {

	private static Manager instance = null;
	private IGame game;
	
	protected Manager() {
		      // Exists only to defeat instantiation.
	}
	
	public static Manager getInstance() {
		      if(Manager.instance == null) {
		         Manager.instance = new Manager();
		      }
		      return Manager.instance;
	}
	
	public void startGame(IGame game)
	{
		if (this.game != null && this.game.canFinish())
		{
			this.game.finishGame();
			this.game=game;
		}
	}
	
	
}
