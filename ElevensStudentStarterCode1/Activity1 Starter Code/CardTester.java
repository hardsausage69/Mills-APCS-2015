/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card hello = new Card("a", "spades", 2);
		System.out.println(hello.suit());
		System.out.println(hello.rank());
		System.out.println(hello.pointValue());
		
		Card killEm = new Card("b", "diamond", 5);
		System.out.println(killEm.toString());
		
		Card deez = new Card("b", "diamond", 5);
		System.out.println(deez.matches(killEm));
		System.out.println(deez.matches(hello));
		
	}
}
