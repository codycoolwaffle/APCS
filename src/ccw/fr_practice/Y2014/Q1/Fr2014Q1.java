package ccw.fr_practice.Y2014.Q1;

/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/

import java.util.ArrayList;
import java.util.List;

public class Fr2014Q1
{

	/**
	 * Free Response 2014 Q1
	 */

	/**
	 * Scrambles a given word.
	 *
	 * @param word the word to be scrambled
	 * @return the scrambled word (possibly equal to word)
	 * Precondition: word is either an empty string or contains only uppercase letters.
	 * Postcondition: the string returned was created from word as follows:
	 * - the word was scrambled, beginning at the first letter and continuing from left to right
	 * - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
	 * - letters were swapped at most once
	 */

	public static String scrambleWord(String word)
	{
		List<Integer> usedChars = new ArrayList<Integer>();
		String out = "";
		Integer random = (Integer) ((int) (Math.random() * word.length()));

		out += word.charAt(random);
		usedChars.add(random);

		while(out.length() != word.length())
		{
			random = (Integer) ((int) (Math.random() * word.length()));
			boolean used = false;
			for(Integer i : usedChars)
			{
				if(i.equals(random)) used = true;
			}
			if(!used)
			{
				usedChars.add(random);
				out += word.charAt(random);
			}
		}

		return out;
	}

	/**
	 * Modifies wordList by replacing each word with its scrambled
	 * version, removing any words that are unchanged as a result of scrambling.
	 *
	 * @param wordList the list of words
	 *                 Precondition: wordList contains only non-null objects
	 *                 Postcondition:
	 *                 - all words unchanged by scrambling have been removed from wordList
	 *                 - each of the remaining words has been replaced by its scrambled version
	 *                 - the relative ordering of the entries in wordList is the same as it was
	 *                 before the method was called
	 */
	public static void scrambleOrRemove(List<String> wordList)
	{
		List<String> temp = new ArrayList<String>();
		for(String s : wordList)
		{
			temp.add(s);
		}

		for(int i = 0; i < wordList.size(); i++)
		{
			wordList.set(i, scrambleWord(wordList.get(i)));
		}

		for(int i = temp.size() - 1; i >= 0; i--)
		{
			if(temp.get(i).equals(wordList.get(i))) wordList.remove(i);
		}
	}

	public static void main(String[] args)
	{
		List<String> wl = new ArrayList<String>();

		wl.add("TAN");
		wl.add("ABRACADABRA");
		wl.add("WHOA");
		wl.add("APPLE");
		wl.add("EGGS");

		System.out.println("Before");
		for(String w : wl)
		{
			System.out.print(w + "   ");
		}
		System.out.println(" ");

		scrambleOrRemove(wl);

		System.out.println("After");
		for(String w : wl)
		{
			System.out.print(w + "   ");
		}
	}
}