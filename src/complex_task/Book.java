package complex_task;

import java.util.ArrayList;

public class Book implements Comparable<Book>
{
    private int ISBN;
    private String author;
    private int year;

    public Book(int I, String a, int y)
    {
        this.ISBN = I;
        this.author = a;
        this.year = y;
    }

    public int getISBN()
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
        return "Book{" +
                "ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}'+"\n";
    }

    @Override
    //public int compareTo(Book b)
    //{
    //    return this.ISBN - b.getISBN();
    //}

    public int compareTo(Book b)
    {
        return getAuthor().compareTo(b.getAuthor());
    }

    //public int compareTo(Book b)
    //{
    //    return this.year - b.getYear();
    //}
}
