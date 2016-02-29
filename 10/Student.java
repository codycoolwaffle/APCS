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