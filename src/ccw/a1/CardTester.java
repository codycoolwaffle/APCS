package ccw.elevens.a1;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card card1 = new Card("Sammy", "Twyla", 69);
		Card card2 = new Card("Twyla", "Sammy", 96);
		Card card3 = new Card("Sammy", "Twyla", 69);
		System.out.println(card1);
		System.out.println(card1.pointValue());
		System.out.println(card1.rank());
		System.out.println(card1.suit());
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
	}
}
