package ccw.a12;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




import java.util.Scanner;
import java.util.ArrayList;

public class a12
{
	public static double findAverage(ArrayList<Integer> scores)
	{
		double average = 0;
		for(int i : scores)
			average += i;
		return average/scores.size();
	}

	public static double findMedian(ArrayList<Integer> scores)
	{
		double median;
		if(scores.size()%2==1)
			median = scores.get((scores.size()/2));
		else
			median = (scores.get(scores.size()/2) + scores.get((scores.size()/2)-1))/2;
		return median;
	}

	public static int findRange(ArrayList<Integer> scores)
	{
		return scores.get(scores.size()-1)-scores.get(0);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.println("Input:");
		int in = scan.nextInt();
		while(in != -1)
		{
			if(in>=0 && in<=100)
				scores.add(in);
			in = scan.nextInt();
		}
		System.out.println("\nOutput:\n");
		System.out.println(scores);

		for(int i = 0; i < scores.size() - 1; i++)
		{
			int lowNum = scores.get(i);
			int lowNumPos = i;
			for(int i2 = i; i2 < scores.size(); i2++)
			{
				if(lowNum > scores.get(i2))
				{
					lowNum = scores.get(i2);
					lowNumPos = i2;
				}
			}

			int temp = scores.get(i);
			scores.set(i, scores.get(lowNumPos));
			scores.set(lowNumPos, temp);
		}
		System.out.println("Sorted:\n" + scores);

		System.out.println("Average: " + findAverage(scores));

		System.out.println("Median: " + findMedian(scores));

		System.out.println("Range: " + findRange(scores));

		scores.remove(scores.size()-1);
		scores.remove(0);

		System.out.println("Minimum and maximum values removed:\n" + scores);

		System.out.println("Average: " + findAverage(scores));

		System.out.println("Median: " + findMedian(scores));

		System.out.println("Range: " + findRange(scores));
	}
}
