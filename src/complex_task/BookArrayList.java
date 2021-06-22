package complex_task;

import java.util.ArrayList;
import java.util.Comparator;

class BookArrayList extends ArrayList<Book>
{

    public BookArrayList()
    {

    }

    protected void output()
    {
        for (Book temp : BookArrayList.this)
        {
            System.out.print(temp.toString());
        }
    }


    public void sort_bubble(Comparator comp)
    {
        System.out.println("Sorting Books [Bubble]");
        int n = BookArrayList.this.size();
        BookArrayList a = BookArrayList.this;
        Book temp;

        for (int k = 0; k < n - 1; k++)
        {
            for (int l = k + 1; l < n; l++)
            {
                if (comp.compare(a.get(k), (a.get(l))) > 0)
                {
                    temp = a.get(k);
                    a.set(k, a.get(l));
                    a.set(l, temp);
                }
            }
        }
    }


    public void sort_quick(Comparator comp)
    {
        BookArrayList a = BookArrayList.this;
        int low = 0;
        int high = a.size()-1;

        if (low < high)
        {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(comp, low, high);

            // Separately sort elements before
            // partition and after partition
            sort_quick(comp, low, pi - 1);
            sort_quick(comp, pi + 1, high);
        }
    }

    public void sort_quick(Comparator comp, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(comp, low, high);

            sort_quick(comp, low, pi - 1);
            sort_quick(comp, pi + 1, high);
        }
    }

    private void swap(int i, int j)
    {
        BookArrayList a = BookArrayList.this;
        Book temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */

    private int partition(Comparator comp, int low, int high)
    {
        BookArrayList a = BookArrayList.this;
        // pivot
        Book pivot = a.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (comp.compare(a.get(j), pivot) < 0)
            {

                // Increment index of
                // smaller element
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }
}