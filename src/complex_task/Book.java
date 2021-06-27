/*
 * Author: Felix Schneider
 * Source: none
 * Last Change: 27.06.21
 */

package complex_task;

public class Book
{
    private final String ISBN;
    private final String author;
    private final int year;

    public Book(String I, String a, int y)
    {
        if (y > 2100)
        {
            throw new IllegalArgumentException("Year is Invalid");
        }

        this.ISBN = I;
        this.author = a;
        this.year = y;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYear()
    {
        return year;
    }

    @Override
    public String toString()
    {
        return "Book    { " +
                "ISBN = " + ISBN +
                ", author = '" + author + '\'' +
                ", year = " + year +
                '}'+"\n";
    }
}
