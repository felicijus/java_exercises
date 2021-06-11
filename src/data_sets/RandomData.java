package data_sets;

import java.util.ArrayList;
import java.util.Random;

public class RandomData extends ArrayList<Integer>
{
    private int n;

    public RandomData(int n)
    {
        this.n = n;
        prod();
    }

    private void prod()
    {
        Random r = new Random(1234);
        for (int i = 0; i < n; i++)
        {
            this.add(r.nextInt(1000));
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++)
            s += this.get(i) + " ";
        return s;
    }
}
