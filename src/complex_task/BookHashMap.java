package complex_task;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap extends HashMap<Integer,Book>
{
    BookHashMap()
    {

    }

    public void put(Book b)
    {
        Integer temp;
        temp = b.getISBN();

        int key = b.hashCode();

        put(key,b);
    }

    public void putArrayList(BookArrayList al)
    {
        for (Book b : al)
        {
            Integer temp;
            temp = b.getISBN();

            int key = b.hashCode();

            BookHashMap.this.put(key, b);
        }
    }

    protected void output_HashMap()
    {
        for (Map.Entry o : BookHashMap.this.entrySet())
        {
            System.out.print(o.getKey() + ":        " + o.getValue());
        }
    }
}
