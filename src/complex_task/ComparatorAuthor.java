package complex_task;

import java.util.Comparator;

public class ComparatorAuthor implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2)
    {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}