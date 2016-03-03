package ccw.a10;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




//Start HighSchoolStudent Class
public class HighSchoolStudent extends Student
{
  private double gpa;
  
  public HighSchoolStudent()
  {
    gpa = 2.0;
  }
  
  public HighSchoolStudent(String fName, String lName, int gLevel, double gpa)
  {
    super(fName, lName, gLevel);
    if(gpa >= 0.0 && 5.0 >= gpa)
      this.gpa = gpa;
  }
  
  public String toString()
  {
    return super.toString() + "\n   GPA:" + gpa;
  }
  
}
//End HighSchoolStudent Class