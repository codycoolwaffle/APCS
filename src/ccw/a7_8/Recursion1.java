package ccw.a7_8;


/**************************************************************
 * *
 * https://github.com/codycoolwaffle/APCS/tree/master/src/ccw *
 * *
 **************************************************************/




public class Recursion1 {
  
  public static int sum (int start, int end)
  {
    int out = start;
    if(start < end)
    {
      start++;
      out += sum(start, end);
    }
    return out;
  }
  
  public static void main(String[] args)
  {
    System.out.println ("This should print 75: " + sum (3, 12) );
    System.out.println ("This should print 1275: " + sum (1, 50) );
  }
}