/*
 * Author: Vincent Becker
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

import java.util.HashMap;
import java.util.Hashtable;


public class BookHashTable extends Hashtable<String,Book>
{
    BookHashTable()
    {

    }

    protected void put(Book b)
    {
        String temp;
        temp = b.getISBN();

        String key = SHA1.get_SHA1(temp);//Hashing mit SHA1

        put(key,b);
    }

    protected void putArrayList(BookArrayList al)
    {
        for (Book b : al)
        {
            String temp;
            temp = b.getISBN();

            String key = SHA1.get_SHA1(temp);


            BookHashTable.this.put(key, b);
        }
    }

    protected void output_HashTable()
    {
        for (HashMap.Entry o : BookHashTable.this.entrySet())
        {
            System.out.print(o.getKey() + ":        " + o.getValue());
        }
    }
}
