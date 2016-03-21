/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};
		Deck deck1 = new Deck(ranks[], suits[], values[]);
	}
}
