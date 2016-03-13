package ccw.elevens.a2;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	private List<Card> cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values)
	{
		for(int i = 0;i<suits.length; i++)
			for(int i2 = 0; i2<ranks.length && i2<values.length; i2++)
				cards.add(new Card(ranks[i2], suits[i], values[i2]));
		size = cards.size();
		shuffle();
	}

	public boolean isEmpty()
	{
		return size==0;
	}

	public int size()
	{
		return size;
	}

	public void shuffle()
	{
		//Not implemented until a4
	}

	public Card deal()
	{
		if(isEmpty())
			return null;
		size--;
		return cards.get(size);
	}

	@Override
	public String toString()
	{
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--)
		{
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
