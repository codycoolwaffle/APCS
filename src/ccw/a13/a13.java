package ccw.a13;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




import java.util.Scanner;
import java.util.ArrayList;

public class a13
{
	public static String titleCase(String s)
	{
		return s.substring(0, 0).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Input:");
		String in = scan.nextLine();
		while(!in.toLowerCase().equals("stop"))
		{
			if(in.length()>=2)
				names.add(in);
			in = scan.nextLine();
		}
		if(names.size()==0)
			names.add("CeCe");

		for(String s : names)
		{
			System.out.print(s.toLowerCase());
			s = titleCase(s.toLowerCase());
		}
		System.out.println(names);
	}
}
