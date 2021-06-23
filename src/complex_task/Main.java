package complex_task;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1233, "Felix", 2001);
        Book b2 = new Book(5638, "Vincent", 2001);
        Book b3 = new Book(7685678, "Goethe", 1873);
        Book b4 = new Book(435, "Schiller", 1835);
        Book b5 = new Book(46, "Schiller", 1835);
        Book b6 = new Book(62, "Schiller", 1835);
        Book b7 = new Book(34, "Schiller", 1835);
        Book b8 = new Book(536, "Schiller", 1835);
        Book b9 = new Book(876, "Schiller", 1835);

        System.out.println("Library : \n____________________________");

        ComparatorISBN ISBNcomp = new ComparatorISBN();
        ComparatorAuthor authorcomp = new ComparatorAuthor();
        ComparatorYear yearcomp = new ComparatorYear();


        System.out.println("\nArrayList : \n____________________________");
        BookArrayList book_al = new BookArrayList();


        book_al.add(b1);
        book_al.add(b2);
        book_al.add(b3);
        book_al.add(b4);
        book_al.add(b5);
        book_al.add(b6);
        book_al.add(b7);
        book_al.add(b8);
        book_al.add(b9);

        //book_al.add(new Book(2323, "REM", 1793));

        for (Book temp : book_al)
        {
            System.out.print(temp.toString());
        }

        //System.out.print(book_al);
        System.out.println();

        //book_al.sort_bubble(yearcomp);
        //book_al.sort_quick(ISBNcomp);
        book_al.select_comperator_sort();

        book_al.output_ArrayList();


        System.out.println("\nHashTable : \n____________________________");

        BookHashTable book_ht = new BookHashTable();


        book_ht.put(b1.getISBN(),b1);
        book_ht.put(b2);

        book_ht.putArrayList(book_al);

        //System.out.println(book_ht.keySet());
        //System.out.println(book_ht.values());

        book_ht.output_HashTable();

        //System.out.println(book_ht.get(2323));



        System.out.println("\nTreeset : \n____________________________");

        Comparator comp = null;

        System.out.println("How should the TreeSet be sorted ?\n1 : ISBN\n2 : Author\n3 : Year");
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

        TreeSet<Book> book_ts = new TreeSet<Book>(comp);

        book_ts.addAll(book_al);

        for (Book b : book_ts)
        {
            System.out.print(b);
        }


        System.out.println("\nHashMap : \n____________________________");
        BookHashMap book_hm = new BookHashMap();

        //book_hm.put(b1.getISBN(),b1);

        book_hm.putArrayList(book_al);
        book_hm.output_HashMap();
    }
}
