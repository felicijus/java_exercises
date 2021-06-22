package complex_task;

import java.util.Map;
import java.util.TreeSet;

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

        TreeSet<Book> book_ts = new TreeSet<Book>(new ComparatorISBN());

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
