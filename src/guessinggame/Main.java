package guessinggame;

/**
 * The main runs the Game and Game console objects.
 * @author Kwanwan Tantichartkul
 *
 */
public class Main {

	/** create objects and start the game */
	public static void main(String [] args){
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}

}
