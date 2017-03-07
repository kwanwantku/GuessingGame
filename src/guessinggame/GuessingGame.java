
package guessinggame;

import java.util.Random;

/**
 * Game of guessing a secret number.This is the game console that showing this game.
 * @author Kwanwan Tantichartkul 
 */

public class GuessingGame {
	
	/*properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	private int count;
	
	/**             
	 * Initialize a new game.
	 * @param upperbound is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number betwwen 1 and "+this.secret+".";	
	}
	
	/**
	 * Checking the number input is equal to the secret number in the game.
	 * @param the number input to the game console.
	 * @return a boolean of the number is equal or not.
	 */         
	public boolean guess(int number){
		if(number == secret){
			setHint("Correct. The secret is ");
			this.count++;
			return true;
		}
		
		else if(number > secret){
			setHint("Sorry,your guess is too large.");
			this.count++;
			return false;
		}
		
		else {
			setHint("Sorry,your guess is too small.");
			this.count++;
			return false;
		}
	}
	
	/**
	 * Getting the hint from the guessing game.
	 * @return a hint text that tell the number input too small or too large or that's secret number.
	 * 
	 */
	public String getHint(){
		return this.hint;
	}
	
	/**
	 * Setting the hint for number input in the game.
	 * @param the String of the hint that tell the number input too small or too large or that's secret number.
	 * 
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}
	
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number.
	 * @return a random number between 1 and limit. (inclusive)
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) +1;
	}
	
	/**
	 * Counting the number input for guessing the number in one round of game.
	 * @return a count number that counted the number input in the game.
	 * 
	 */
	public int getCount(){
		return this.count;
	}

}
