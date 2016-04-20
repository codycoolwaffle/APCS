package ccw.fr_practice.Y2014.Q3;

import java.util.ArrayList;
import java.util.List;

public class SeatingChartRunner
{
	public static void main(String[] args)
	{
		List<Student> roster = new ArrayList<Student>();
		Student[][] s = new Student[3][4];
		int removed;

		roster.add(new Student("Karen", 3));
		roster.add(new Student("Liz", 1));
		roster.add(new Student("Paul", 4));
		roster.add(new Student("Lester", 1));
		roster.add(new Student("Henry", 5));
		roster.add(new Student("Rence", 9));
		roster.add(new Student("Glen", 2));
		roster.add(new Student("Fran", 6));
		roster.add(new Student("David", 1));
		roster.add(new Student("Danny", 3));

		SeatingChart introCS = new SeatingChart(roster, 3, 4);
		System.out.println("Printing seating chart...");
		System.out.println(introCS);

		removed = introCS.removeAbsentStudents(4);
		System.out.println("Printing seating chart after removing " + removed + " students...");
		System.out.println(introCS);
	}
}
