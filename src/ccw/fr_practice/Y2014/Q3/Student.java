package ccw.fr_practice.Y2014.Q3;

public class Student
{
	private String name;
	private int absenceCount;

	/* Constructor */
	public Student(String n, int cnt)
	{
		name = n;
		absenceCount = cnt;
	}

	/**
	 * Returns the name of this Student.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns the number of times this Student has missed class.
	 */
	public int getAbsenceCount()
	{
		return absenceCount;
	}
}