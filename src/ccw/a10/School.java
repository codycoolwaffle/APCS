package ccw.a10;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




//Start School Class

import java.util.ArrayList;

public class School
{
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;

	public School()
	{

	}

	public School(ArrayList<Student> students, ArrayList<Teacher> teachers)
	{
		this.students = students;
		this.teachers = teachers;
	}

	public String getGradeLevel(int level)
	{
		String str = "";
		for(Student s : students)
		{
			if(s.getLevel() == level)
			{
				str += s + "\n";
			}
		}
		return str;
	}

	public String toString()
	{
		String s = "Faculty:\n";
		for(int i = 0; i < teachers.size(); i++)
		{
			s += teachers.get(i);
			s += "\n";
		}
		s += "Student Body:\n";
		for(int i = 0; i < students.size(); i++)
		{
			s += students.get(i);
			s += "\n";
		}
		return s;
	}

}
//End School Class