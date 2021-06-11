package data_sets;

import java.awt.event.TextEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class SequenzSearch
{
    public boolean sequenz(ArrayList array)
    {
        int n = array.size();
        int index = 0;

        Scanner inputs = new Scanner(System.in);
        int s = inputs.nextInt();

        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).equals(s))
            {
                return true;
            }
        }
    return false;
    }
}
