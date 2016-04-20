package ccw.fr_practice.Y2010.Q1;

public class CookieOrderRunner
{
	public static void main(String[] args)
	{
		MasterOrder goodies = new MasterOrder();
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
		goodies.addOrder(new CookieOrder("Shortbread", 5));
		goodies.addOrder(new CookieOrder("Macaroon", 2));
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

		System.out.println(goodies);
		System.out.println("Total boxes = " + goodies.getTotalBoxes());
		System.out.println("");

		System.out.println("Removed: " + goodies.removeVariety("Brownie") + " Brownie orders ");
		System.out.println(goodies);

		System.out.println("Removed: " + goodies.removeVariety("Chocolate Chip") + " Chocolate Chip orders ");
		;
		System.out.println(goodies);

	}
}