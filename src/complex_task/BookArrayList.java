/*
 * Author: Felix Schneider
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class BookArrayList extends ArrayList<Book>
{

    public BookArrayList()
    {

    }

    protected void output_ArrayList()
    {
        for (Book temp : BookArrayList.this)
        {
            System.out.print(temp.toString());
        }
    }


    protected void sort_bubble(Comparator comp)
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


    protected void sort_quick(Comparator comp)
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

    protected void sort_quick(Comparator comp, int low, int high)
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

    protected void select_comperator_sort()
    {
        BookArrayList a = BookArrayList.this;
        Comparator comp = null;

        System.out.println("How should the ArrayList be sorted ?\n1 : ISBN\n2 : Author\n3 : Year");
        Scanner scan_comp = new Scanner(System.in);

        int select = scan_comp.nextInt();

        switch (select)
        {
            case 1:
                comp = new ComparatorISBN();
                break;
            case 2:
                comp = new ComparatorAuthor();
                break;
            case 3:
                comp = new ComparatorYear();
                break;
            default:
                System.out.println("End");
                return;
        }

        System.out.println("Which sorting algorithm should be used ?\n1 : bubble sort\n2 : quick sort");
        Scanner scan_sort = new Scanner(System.in);
        int sort = scan_sort.nextInt();

        if (sort == 1)
        {
            a.sort_bubble(comp);
        }
        else if (sort == 2)
        {
            a.sort_quick(comp);
        }
    }
}