package ccw.fr_practice.Y2014.Q3;

/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/

import java.util.List;

public class SeatingChart
{
	/**
	 * seats[r][c] represents the Student in row r and column c in the classroom.
	 */
	private Student[][] seats;

	/**
	 * Creates a seating chart with the given number of rows and columns from the students in
	 * studentList. Empty seats in the seating chart are represented by null.
	 *
	 * @param rows the number of rows of seats in the classroom
	 * @param cols the number of columns of seats in the classroom
	 *             Precondition: rows > 0; cols > 0;
	 *             rows * cols >= studentList.size()
	 *             Postcondition:
	 *             - Students appear in the seating chart in the same order as they appear
	 *             in studentList, starting at seats[0][0].
	 *             - seats is filled column by column from studentList, followed by any
	 *             empty seats (represented by null).
	 *             - studentList is unchanged.
	 */
	public SeatingChart(List<Student> studentList, int rows, int cols)
	{
		seats = new Student[rows][cols];
		int pos = 0;
		for(int r = 0; r < seats.length; r++)
		{
			for(int c = 0; c < seats[0].length; c++)
			{
				if(pos < studentList.size())
				{
					seats[r][c] = studentList.get(pos);
					pos++;
				}
			}
		}

	}

	/**
	 * Removes students who have more than a given number of absences from the
	 * seating chart, replacing those entries in the seating chart with null
	 * and returns the number of students removed.
	 *
	 * @param allowedAbsences an integer >= 0
	 * @return number of students removed from seats
	 * Postcondition:
	 * - All students with allowedAbsences or fewer are in their original positions in seat
	 * - No student in seats has more than allowedAbsences absences.
	 * - Entries without students contain null.
	 */
	public int removeAbsentStudents(int allowedAbsences)
	{
		int out = 0;
		for(int r = 0; r < seats.length; r++)
		{
			for(int c = 0; c < seats[0].length; c++)
			{
				if(seats[r][r] != null)
				{
					if(seats[r][c].getAbsenceCount() > allowedAbsences)
					{
						seats[r][c] = null;
						out++;
					}
				}
			}
		}
		return out;
	}

	public String toString()
	{
		String str = "";

		for(int r = 0; r < seats.length; r++)
		{
			for(int c = 0; c < seats[0].length; c++)
			{
				if(seats[r][c] == null)
				{
					str += "null" + "\t";
				}
				else
				{
					str += seats[r][c].getName() + ":" + seats[r][c].getAbsenceCount() + "\t";
				}
			}

			str += "\n";
		}

		return str;
	}
}
