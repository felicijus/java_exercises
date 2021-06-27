/*
 * Author: Felix Schneider
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

import java.util.Comparator;

public class ComparatorISBN implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2)
    {
        int r=0;
        if ( (b1.getISBN().compareTo(b2.getISBN())>0)) r=1;
        if ( (b1.getISBN().compareTo(b2.getISBN())==0)) r=1;
        if ( (b1.getISBN().compareTo(b2.getISBN())<0)) r=-1;
        return r;


        //return b1.getISBN() - b2.getISBN(); //ISBN no duplicates
    }
}

