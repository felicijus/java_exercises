package complex_task;

import java.util.Hashtable;
import java.util.Map;

public class BookHashTable extends Hashtable<Integer, Book>
{
    BookHashTable()
    {

    }

    public void put(Book b)
    {
        Integer temp;
        temp = b.getISBN();

        int key = b.hashCode();

        put(b.getISBN(),b);
    }

    public void putArrayList(BookArrayList al)
    {
        for (Book b : al)
        {
            Integer temp;
            temp = b.getISBN();

            int key = b.hashCode();

            BookHashTable.this.put(key, b);
        }
    }

    protected void output_HashTable()
    {
        for (Map.Entry o : BookHashTable.this.entrySet())
        {
            System.out.print(o.getKey() + ":        " + o.getValue());
        }
    }
}
