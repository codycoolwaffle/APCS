package ccw.fr_practice.Y2014.Q4;

/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/

/**
 * Created by CeCe on 4/19/16.
 */
public class Trio implements MenuItem
{
	private String name;
	private double price;

	public Trio(Sandwich sw, Salad salad, Drink drink)
	{
		name = sw.getName() + ", " + salad.getName() + ", " + drink.getName() + " Trio";
		price = sw.getPrice() + salad.getPrice() + drink.getPrice();
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}
}
