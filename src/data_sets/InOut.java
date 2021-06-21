package data_sets;

import java.util.ArrayList;
import java.util.Scanner;

public class InOut
{
    public static int input()
    {
        int d;
        System.out.println("Type in the amount of random integer");
        Scanner s = new Scanner(System.in);
        d = s.nextInt();

        return d;
    }

    protected static void output(ArrayList array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if(i%10 == 0)
            {
                System.out.printf("\n");
            }
            System.out.printf("%5s",array.get(i));
        }
        System.out.println();
    }
}
