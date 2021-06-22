package data_sets;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        int i = InOut.input();
        RandomData data = new RandomData(i);

        InOut.output(data);

        System.out.println();
        System.out.println("Which number will you be searching ?");
        SequenzSearch isearch = new SequenzSearch();
        System.out.println(isearch.sequenz(data));



    }

}
