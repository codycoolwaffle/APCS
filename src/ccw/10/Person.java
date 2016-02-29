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