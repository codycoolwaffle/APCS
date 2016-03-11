package ccw.a14;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




public class Bitmap 
{
  String image[][] = new String[10][10];
  
  public Bitmap(int a[])
  {
    int aPos = 0;
    for(int i = 0; i < 10; i++)
    {
      for(int i2 = 0; i2 < 10; i2++)
      {
        if(aPos != a.length && i == a[aPos] && i2 == a[aPos+1])
        {
          image[i][i2] = "*";
          aPos += 2;
        }
        else
          image[i][i2] = "-";
      }
    }
  }
  
  public void flipHorizontal()
  {
    for(int i = 0; i < 10; i++)
    {
      for(int i2 = 0; i2 < 5; i2++)
      {
        String temp = image[i][i2];
        image[i][i2] = image[i][9-i2];
        image[i][9-i2] = temp;
      }
    }
  }
  
  public void flipVertical()
  {
    for(int i = 0; i < 10; i++)
    {
      for(int i2 = 0; i2 < 5; i2++)
      {
        String temp = image[i2][i];
        image[i2][i] = image[9-i2][i];
        image[9-i2][i] = temp;
      }
    }
  }
  
  public void reverse()
  {
    for(int i = 0; i < 10; i++)
    {
      for(int i2 = 0; i2 < 10; i2++)
      {
        if(image[i][i2].equals("-"))
          image[i][i2] = "*";
        else
          image[i][i2] = "-";
      }
    }
  }
  
  public String toString()
  {
    String out = "";
    
    for(int i = 0; i < 10; i++)
    {
      for(int i2 = 0; i2 < 10; i2++)
        out += image[i][i2];
      out += "\n";
    }
    
    return out;
  }
  
}
