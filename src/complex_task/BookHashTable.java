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
        put(b.getISBN(),b);
    }

    public void putArrayList(BookArrayList al)
    {
        for (Book temp : al)
        {
            BookHashTable.this.put(temp.getISBN(), temp);
        }
    }

    protected void output_HashTable()
    {
        for (Map.Entry o : BookHashTable.this.entrySet())
        {
            System.out.print(o.getKey() + ":" + o.getValue());
        }
    }


}
