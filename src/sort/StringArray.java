package sort;

import java.util.ArrayList;

public class StringArray extends ArrayList<String>
{

    public StringArray()
    {
        this.add("Kant");
        this.add("Leibniz");
        this.add("Hegel");
        this.add("Hume");
        this.add("Locke");
        this.add("Socrates");
        this.add("Spinoza");
        this.add("Descartes");
        this.add("Carnap");
        this.add("Frege");
        this.add("Platon");
    }

    private static void String_BubbleSort(StringArray array, int n)
    {
        String temp;

        for (int k = 0; k < n - 1; k++)
        {
            for (int l = k + 1; l < n; l++)
            {
                if (array.get(k).compareTo(array.get(l)) > 0)
                { //wenn gleich = 0  erste höher = <1
                    temp = array.get(k);
                    array.set(k, array.get(l));
                    array.set(l, temp);
                }
            }
        }
    }

    private static void output(StringArray array)
    {
        for (String counter : array)
        {            //jeden Counter von String in der Collection philo
            System.out.println(counter);
        }
    }

    public static void main(String[] args)
    {
        StringArray philo = new StringArray();

        int n = philo.size();

        System.out.println("Before Sorting:");
        output(philo);


        String_BubbleSort(philo, n);
        System.out.println("\n\nAfter Sorting:");
        output(philo);
    }
}
