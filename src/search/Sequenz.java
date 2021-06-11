package search;

import java.util.Arrays;

public class Sequenz
{

    public static void main(String[] args)
    {
        int[] A = {0, 1, 2, 3, 2, 4, 5, 2, 4, 7, 9};
        Arrays.sort(A);
        int i;

        int s = 7;

        System.out.printf(A.length + "\n");

        for (i = 0; i < A.length; i++)
        {
            if (A[i] == s)
            {
                System.out.printf("Found s: " + A[i]);
                break;
            }
            System.out.printf(A[i] + "\n");
        }
    }
}