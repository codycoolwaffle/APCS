//Start Person Class
public class Person
{
  private String firstName;
  private String lastName;
  
  public Person()
  {
    firstName = "John";
    lastName = "Smith";
  }
  
  public Person(String fName, String lName)
  {
    firstName = fName;
    lastName = lName;
  }
  
  public String toString()
  {
    return lastName + ", " + firstName;
  }
  
}
//End Person Class



//Start Student Class
public class Student extends Person
{
  private int studentId;
  private static int nextId;
  private int level;
  
  public Student()
  {
    level = 0;
  }
  
  public Student(String fName, String lName, int gLevel)
  {
    super(fName, lName);
    nextId++;
    studentId = nextId;
    if(gLevel >= 0 && 12 >= gLevel)
      level = gLevel;
  }
  
  public int getLevel()
  {
    return level;
  }
  
  public String toString()
  {
    return super.toString() + "\n   Grade Level:" + level + "\n   ID#:" + studentId;
  }
}
//End Student Class



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
      if(s.getLevel()==level)
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