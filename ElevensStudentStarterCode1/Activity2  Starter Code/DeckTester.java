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
		String[] ranks1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int[] values1 = {1,2,3,4,5,6,7,8,9,10};
		String[] suits1 = {"Diamonds", "Clubs", "Spades", "Hearts"};
		Deck deck1 = new Deck(ranks1[], suits1[], values1[]);
		String[] ranks2 = {"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		int[] values2 = {1,2,3,4,5,6,7,8,9,10};
		String[] suits2 = {"Diamonds", "Clubs", "Spades", "Hearts"};
		Deck deck2 = new Deck(ranks2[], suits2[], values2[]);
		Deck deck3 = new Deck (ranks1[], suits2[], values2[]);
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.size());
		int life = 0
		while(life == 0){
		    System.out.println(deck3.deal());
		    if(deck3.size() == -1){
		        life
		  }
		while(deck3.size
		
	}
}
