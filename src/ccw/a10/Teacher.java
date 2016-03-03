package ccw.a10;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




//Start Teacher Class
public class Teacher extends Person
{
	private String subject;

	public Teacher()
	{

	}

	public Teacher(String fName, String lName, String tSubject)
	{
		super(fName, lName);
		subject = tSubject;
	}

	public String toString()
	{
		return super.toString() + "\n   Subject:" + subject;
	}

}
//End Teacher Class