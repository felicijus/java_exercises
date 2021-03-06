/*
 * Author: Felix Schneider und Vincent Becker
 * Source: none
 * Last Change: 27.06.21
 * */

package complex_task;

import java.util.ArrayList;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        //Konnte nicht wiederstehen den String zu benutzen :)

        Book b1 = new Book("0-3843-3619-1", "Lucinda Riley", 2001);
        Book b2 = new Book("0-5767-8397-8", "Juli Zeh", 2011);
        Book b3 = new Book("0-8937-3059-9", "Johann Wolfgang von Goethe", 1873);
        Book b4 = new Book("0-7090-6231-1", "Donna Leon", 2020);
        Book b5 = new Book("0-8861-0600-1", "Helga Schubert", 2020);
        Book b6 = new Book("0-2247-9546-5", "Benedict Wells", 2006);
        Book b7 = new Book("0-3959-8551-X", "Sebastian Fritzek", 2020);
        Book b8 = new Book("0-9181-7465-1", "Friedrich Schiller", 1786);
        Book b9 = new Book("0-1686-9153-1", "Friedrich Schiller", 1835);
        Book b10 = new Book("0-1959-0557-1", "Gotthold Ephraim Lessing", 1753);
        Book b11 = new Book();
        Book b12 = new Book("0-5959-0557-1");

        System.out.println("Library : \n____________________________");

        /*ComparatorISBN ISBNcomp = new ComparatorISBN();
        ComparatorAuthor authorcomp = new ComparatorAuthor();
        ComparatorYear yearcomp = new ComparatorYear();*/

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);
        list.add(b11);
        list.add(b12);

        for (Book temp : list)
        {
            System.out.print(temp.toString());
        }



        System.out.println("\nArrayList : \n____________________________");//Felix Schneider

        BookArrayList book_al = new BookArrayList();

        book_al.addAll(list);
        //book_al.add(new Book(2323, "REM", 1793));


        for (Book temp : book_al)
        {
            System.out.print(temp.toString());
        }

        //System.out.print(book_al);
        System.out.println();

        book_al.select_comperator_sort();//Auswahl Comperator und Sortieralgorthmus
        // book_al.sort_bubble(yearcomp);
        //book_al.sort_quick(ISBNcomp);

        book_al.output_ArrayList();



        System.out.println("\nHashTable : \n____________________________");//Vincent Becker

        BookHashTable book_ht = new BookHashTable();


        book_ht.put(b2);

        book_ht.putArrayList(book_al);

        //System.out.println(book_ht.keySet());
        //System.out.println(book_ht.values());
        book_ht.output_HashTable();



        System.out.println("\nTreeset : \n____________________________");//Vincent Becker

        BookTreeSet book_ts = new BookTreeSet(BookTreeSet.select_comperator());

        book_ts.addAll(book_al);

        /*for (Book b : book_ts)
        {
            System.out.print(b);
        }*/
        book_ts.output_TreeSet();



        System.out.println("\nHashMap : \n____________________________");//Felix Schneider

        BookHashMap book_hm = new BookHashMap();

        //book_hm.put(b1.getISBN(),b1);

        book_hm.putArrayList(book_al);
        book_hm.output_HashMap();

        //Key test
        /*String temp;
        temp = b1.getISBN();    //b1 == Book 1
        String key = SHA1.get_SHA1(temp);

        System.out.println(book_hm.get(key));*/
    }
}
