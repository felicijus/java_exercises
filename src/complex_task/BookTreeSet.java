package complex_task;

import java.util.Map;
import java.util.TreeSet;

public class BookTreeSet extends TreeSet<Book>
{
    //useless
    protected void output_TreeSet()
    {
        for (Book o : BookTreeSet.this)
        {
            System.out.print(o);
        }
    }
}
