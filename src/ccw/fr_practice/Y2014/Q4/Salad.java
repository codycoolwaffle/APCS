package ccw.fr_practice.Y2014.Q4;

public class Salad implements MenuItem
{
	private String name;
	private double price;

	public Salad(String n, double p)
	{
		name = n;
		price = p;
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