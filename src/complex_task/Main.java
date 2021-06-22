package complex_task;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1233, "Felix", 2001);
        Book b2 = new Book(563, "Vincent", 2001);
        Book b3 = new Book(7685678, "Goethe", 1873);
        Book b4 = new Book(96421, "Schiller", 1835);

        System.out.println("Library : \n____________________________");


        System.out.println("\nArrayList : \n____________________________");
        BookArrayList book_al = new BookArrayList();

        ComparatorISBN ISBNcomp = new ComparatorISBN();
        ComparatorAuthor authorcomp = new ComparatorAuthor();
        ComparatorYear yearcomp = new ComparatorYear();


        book_al.add(b1);
        book_al.add(b2);
        book_al.add(b3);
        book_al.add(b4);
        book_al.add(new Book(2323, "REM", 1793));


        for (Book temp : book_al)
        {
            System.out.print(temp.toString());
        }

        //System.out.print(book_al);
        System.out.println();

        //book_al.sort_bubble(yearcomp);
        //book_al.sort_quick(ISBNcomp);
        book_al.select_comperator_sort();

        book_al.output();



        System.out.println("\nHashtable : \n____________________________");

        Hashtable<Integer, Book> book_ht = new Hashtable<Integer, Book>();

        for (Book temp : book_al)
        {
            book_ht.put(temp.getISBN(), temp);
        }

        //book_ht.put(b1.getISBN(),b1);

        System.out.println(book_ht.keySet());
        System.out.println(book_ht.values());

        for (Map.Entry<Integer, Book> o : book_ht.entrySet())
            System.out.printf(o.getKey() + ":" + o.getValue());
        System.out.println();

    }
}
