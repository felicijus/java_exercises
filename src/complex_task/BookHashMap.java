/*
 * Author: Felix Schneider
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

import java.util.HashMap;


public class BookHashMap extends HashMap<String,Book>
{
    BookHashMap()
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


            BookHashMap.this.put(key, b);
        }
    }

    protected void output_HashMap()
    {
        for (HashMap.Entry entry : BookHashMap.this.entrySet())
        {
            System.out.print(entry.getKey() + ":        " + entry.getValue());
        }
    }
}
