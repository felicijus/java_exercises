package complex_task;

import java.util.Comparator;

public class ComparatorAuthor implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2)
    {
        int ret=0;
        if ( (b1.getAuthor().compareTo(b2.getAuthor())>0)) ret=1;
        if ( (b1.getAuthor().compareTo(b2.getAuthor())==0)) ret=1;
        if ( (b1.getAuthor().compareTo(b2.getAuthor())<0)) ret=-1;
        //return ret;


        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}