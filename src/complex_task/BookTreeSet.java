/*
 * Author: Vincent Becker
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

import java.util.*;


public class BookTreeSet extends TreeSet<Book>
{

    public BookTreeSet(Comparator comparator)
    {
        super(comparator);
    }



    protected static Comparator select_comperator()
    {
        Comparator comp = null;

        System.out.println("How should the TreeSet be sorted ?\n1 : ISBN\n2 : Author\n3 : Year");
        Scanner scan_comp = new Scanner(System.in);

        int select = scan_comp.nextInt();

        switch (select)
        {
            case 1:
                comp = new ComparatorISBN();
                return comp;
            case 2:
                comp = new ComparatorAuthor();
                return comp;
            case 3:
                comp = new ComparatorYear();
                return comp;
            default:
                System.out.println("End");
                return comp;
        }
    }


    protected void output_TreeSet()
    {
        for (Book o : BookTreeSet.this)
        {
            System.out.print(o);
        }
    }
}
