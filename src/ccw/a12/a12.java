package ccw.a12;

import java.util.Scanner;
import java.util.ArrayList;

public class a12
{
    public void findAverage()
    {

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<Integer>();
        int in;
        while (true)
        {
            in = scan.nextInt();
            if (in==-1)
                break;
            scores.add(in);
        }
        System.out.println(scores);

        for(int i = 0; i < scores.size()-1; i++)
        {
            int lowNum = scores.get(i);
            int lowNumPos = i;
            for(int i2 = i; i2 < scores.size(); i2++)
            {
                if(lowNum > scores.get(i2))
                {
                    lowNum = scores.get(i2);
                    lowNumPos = i2;
                }
            }

            int temp = scores.get(i);
            scores.set(i, scores.get(lowNumPos));
            scores.set(lowNumPos, temp);
        }
        System.out.println(scores);


    }
}
