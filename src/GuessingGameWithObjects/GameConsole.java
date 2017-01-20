package GuessingGameWithObjects;
import java.util.Scanner;


/**
 * Game console that control the Guessing game and interact with a user.
 * @author Kwanwan Tantichartkul
 *
 */
public class GameConsole {
	
	/**
	* The play method plays a game using input from a user. 
	* @param Create objects for game.
	* @return the guessed secret from the game.(the solution of game)
	*/
	public int play(GuessingGame game){
		String title = "Guessing Game";
		String prompt = "Your guess?";
		System.out.println(title);
		System.out.print(prompt+" ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		while(game.guess(number)){
            game.getCount();
			game.getHint();
			System.out.println(game.getHint());
			System.out.print(prompt+" ");
			number = scan.nextInt();
		}
		System.out.println(game.getHint()+number+".");
		System.out.println("Correct.  You used "+game.getCount()+" guesses.");
		return 0;
	}
	
}
