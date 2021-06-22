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
        put(b.getISBN(),b);
    }

    public void putArrayList(BookArrayList al)
    {
        for (Book temp : al)
        {
            BookHashMap.this.put(temp.getISBN(), temp);
        }
    }

    protected void output_HashMap()
    {
        for (Map.Entry o : BookHashMap.this.entrySet())
        {
            System.out.print(o.getKey() + ":" + o.getValue());
        }
    }
}
