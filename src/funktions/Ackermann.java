package funktions;

public class Ackermann
{
    public static long ack (long x, long y)
    {
        if (x==0)
        {
            return y += 1;
        }

        if (y==0)
        {
            return ack(x-1,1);
        }
        return ack(x-1, ack(x,y-1));

    }

    public static void main(String[] args)
    {
        System.out.println(ack(4,4));
    }
}
