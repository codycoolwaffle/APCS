package ccw.fr_practice.Y2013.Q2;

/**
 * This is a class that tests the TokenPass class.
 */
public class tokenPassRunner
{

	public static void main(String[] args)
	{
		TokenPass tp1 = new TokenPass(4);
		System.out.println("Pass 0: " + tp1);
		tp1.distributeCurrentPlayerTokens();
		System.out.println("Pass 1: " + tp1);

		TokenPass tp2 = new TokenPass(5);
		System.out.println("Pass 0: " + tp2);
		tp2.distributeCurrentPlayerTokens();
		System.out.println("Pass 1: " + tp2);

	}
}
  