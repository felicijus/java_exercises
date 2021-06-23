package complex_task;

import java.util.Comparator;

public class ComparatorISBN implements Comparator<Book>
{
    @Override
    public int compare(Book b1, Book b2)
    {
        return b1.getISBN() - b2.getISBN(); //ISBN no duplicates
    }
}

