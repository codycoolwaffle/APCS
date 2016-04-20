package ccw.fr_practice.Y2009.Q1;

public class NumberCubeRunner
{
	/**
	 * Returns an array of the values obtained by tossing a number cube numTosses times.
	 *
	 * @param cube      a NumberCube
	 * @param numTosses the number of tosses to be recorded
	 *                  Precondition: numTosses > 0
	 * @return an array of numTosses values
	 */
	public static int[] getCubeTosses(NumberCube cube, int numTosses)
	{
		int[] out = new int[numTosses];

		for(int i = 0; i < numTosses; i++)
		{
			out[i] = cube.toss();
		}

		return out;
	}

	/**
	 * Returns the starting index of a longest run of two or more consecutive repeated values
	 * in the array values.
	 *
	 * @param values an array of integer values representing a series of number cube tosses
	 *               Precondition: values.length > 0
	 * @return the starting index of a run of maximum size;
	 * -1 if there is no run
	 */
	public static int getLongestRun(int[] values)
	{
		return -1;
	}

	public static void main(String[] args)
	{
		NumberCube cube = new NumberCube();
		int[] expt1;
		int[] expt2;

		//  Experiment 1
		expt1 = getCubeTosses(cube, 10);

		System.out.print("Experiment 1: ");
		for(int n = 0; n < expt1.length; n++)
		{
			System.out.print(expt1[n] + " ");
		}
		System.out.println("");

		System.out.println("    The longest run starts at " + getLongestRun(expt1));

		//  Experiment 2
		expt2 = getCubeTosses(cube, 20);

		System.out.print("Experiment 2: ");
		for(int n = 0; n < expt2.length; n++)
		{
			System.out.print(expt2[n] + " ");
		}
		System.out.println("");

		System.out.println("    The longest run starts at " + getLongestRun(expt2));
	}
}