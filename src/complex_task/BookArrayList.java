package complex_task;

import java.util.ArrayList;

class BookArrayList extends ArrayList<Book>
{

    public BookArrayList()
    {

    }

    protected void output()
    {
        for (Book temp : BookArrayList.this)
        {
            System.out.print(temp.toString());
        }
    }


    public void sort_bubble()
    {
        System.out.println("Sorting Books [Bubble]");
        int n = BookArrayList.this.size();
        BookArrayList a = BookArrayList.this;
        Book temp;

        for (int k = 0; k < n - 1; k++)
        {
            for (int l = k + 1; l < n; l++)
            {
                if (a.get(k).compareTo(a.get(l)) > 0)
                { //wenn gleich = 0  erste höher = <1
                    temp = a.get(k);
                    a.set(k, a.get(l));
                    a.set(l, temp);
                }
            }
        }
    }

}
