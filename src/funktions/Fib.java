package funktions;

import java.util.Scanner;

public class Fib
{
    private static int rek;


    private static double fib_rek(double n)
    {
        rek++;

        if (n == 0 ) return 0;
        else if (n == 1) return 1;

        else if (n >= 2 && n%2 == 1)
        {
            return pw2(fib_rek(fceil(n))) + pw2(fib_rek(fceil(n)-1));
        }

        else if (n >= 2 && n%2 == 0)
        {
            return pw2(fib_rek(fceil(n)))+ 2*(fib_rek(fceil(n)))*(fib_rek(fceil(n)-1));
        }
        else return 0;
    }

    private static double pw2(double base)
    {
        return Math.pow(base,2);
    }

    private static double fceil(double i)
    {
        return Math.ceil(i/2);
    }



    public static void main(String[] args)
    {
        double n;

        System.out.println("Type in an Integr");
        Scanner s = new Scanner(System.in);
        n = s.nextDouble();



        System.out.println(fib_rek(n) + "\t" + rek);
    }
}
