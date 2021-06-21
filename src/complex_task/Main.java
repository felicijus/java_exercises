package complex_task;

public class Main
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1233,"Felix",2001);
        Book b2 = new Book(563,"Vincent",2001);
        Book b3 = new Book(7685678,"Goethe",1873);
        Book b4 = new Book(96421,"Schiller",1835);

        System.out.println("Library : \n____________________________");


        BookArrayList booklist = new BookArrayList();
        booklist.add(b1);
        booklist.add(b2);
        booklist.add(b3);
        booklist.add(b4);
        booklist.add(new Book(2323,"REM", 1793));


        for (Book temp : booklist)
        {
            System.out.print(temp.toString());
        }

        System.out.print(booklist);
        System.out.println();


        booklist.sort_bubble();
        booklist.output();

    }
}
