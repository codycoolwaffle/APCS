package ccw.fr_practice.Y2013.Q4;

public class skyViewRunner
{
	public static void main(String[] args)
	{
		double[] array1 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
		double[] array2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};

		SkyView sk1 = new SkyView(4, 3, array1);
		System.out.println("Skyview 1 Sum should be 0.65.  Your answer = " + sk1.getAverage(2, 3, 0, 2));
		System.out.println(sk1);

		SkyView sk2 = new SkyView(3, 2, array2);
		System.out.println("Skyview 2 Sum should be 0.7.  Your answer = " + sk2.getAverage(0, 2, 0, 0));
		System.out.println(sk2);
	}
}