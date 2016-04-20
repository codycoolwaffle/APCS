package ccw.fr_practice.Y2014.Q4;

/**
 * This is a class that tests the Trio class.
 */
public class trioRunner
{

	public static void main(String[] args)
	{
		Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
		Sandwich clubSandwich = new Sandwich("Club Sandwich", 3.75);
		Salad spinach = new Salad("Spinach Salad", 1.25);
		Salad coleslaw = new Salad("Coleslas", 1.50);
		Drink orange = new Drink("Orange Soda", 1.25);
		Drink cappuccino = new Drink("Cappuccino", 3.50);

		Trio trio1 = new Trio(cheeseburger, spinach, cappuccino);
		System.out.println(trio1.getName() + " should cost $6.25 and your answers is $" + trio1.getPrice());

		Trio trio2 = new Trio(cheeseburger, coleslaw, orange);
		System.out.println(trio2.getName() + " should cost $4.25 and your answers is $" + trio2.getPrice());

	}
}
  