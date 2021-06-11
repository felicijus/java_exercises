package calc;

import java.util.Scanner;

public class Binary
{

    static String bin_imp(int dez)
    {
        String bin = "";
        while (dez != 0)
        {
            bin = (dez % 2) + bin;
            dez = dez / 2;
        }
        return bin;
    }

    static void bin_rec(int dez)
    {
        if (dez > 0)
        {
            bin_rec(dez / 2); //Rekursiver Teil es wird immer weiter "hineingegangen"
        }                         //am Ende der Rekursion wird dann der Modulo von hinten nach vorn gebildet
        System.out.print(dez % 2);
    }

    public static void main(String[] args)
    {
        // write your code here

        System.out.print("Bitte eine zu umwandelnde Zahl eingeben\n");
        Scanner scan = new Scanner(System.in);
        int dez;
        dez = scan.nextInt();


        System.out.print("Dezimale Zahl:    " + dez + "\n");
        System.out.print("Binäre Zahl Imperativ:    " + bin_imp(dez) + "\n\n");
        System.out.print("Binäre Zahl Rekursiv:    ");
        bin_rec(dez);


    }
}
