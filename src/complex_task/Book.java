package complex_task;

public class Book
{
    private final int ISBN;
    private final String author;
    private final int year;

    public Book(int I, String a, int y)
    {
        if (I > 99999 || I < 00000)
        {
            throw new IllegalArgumentException("ISBN lenght can not be longer than 5 digits");
        }

        if (y > 2100)
        {
            throw new IllegalArgumentException("Year is Invalid");
        }

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
}
