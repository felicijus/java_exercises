package advanced_programming;

import java.math.BigInteger;

public class Main {
    public static boolean lucasLehmer(BigInteger p) {
        BigInteger s = BigInteger.valueOf(4);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger m = two.pow(p.intValue()).subtract(BigInteger.ONE);
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(p) <= 0; i = i.add(BigInteger.ONE)) {
            s = s.pow(2).subtract(two).mod(m);
        }
        return s.equals(BigInteger.ZERO);
    }

    public static BigInteger nextMersennePrime(BigInteger p) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger pPrime = two.multiply(p).add(BigInteger.ONE);
        while (!lucasLehmer(pPrime)) {
            pPrime = pPrime.add(two);
        }
        return pPrime;
    }

    public static void main(String[] args) {
        int[] primes = new int[]{2, 3, 5, 7, 13, 17, 19, 31, 61, 89, 107, 127, 521, 607, 1279, 2203, 2281, 3217, 4253, 4423, 9689, 9941, 11213, 19937, 21701, 23209, 44497, 86243, 110503, 132049, 216091, 756839, 859433, 1257787, 1398269, 2976221, 3021377, 6972593, 13466917, 20996011, 24036583, 25964951, 30402457, 32582657, 37156667, 42643801, 43112609};

        BigInteger two = BigInteger.valueOf(2);
        BigInteger maxN = BigInteger.ZERO;

        for (int p : primes) {
            BigInteger n = two.pow(p).subtract(BigInteger.ONE);
            if (lucasLehmer(BigInteger.valueOf(p))) {
                BigInteger perfectNum = two.pow(p - 1).multiply(n);
                System.out.println("The perfect number based on Mersenne prime " + p + " is " + perfectNum);
                System.out.println("with " + perfectNum.toString().length() + " digits");
                maxN = maxN.max(perfectNum);
            }
        }

        System.out.println("The overall biggest perfect number based on Mersenne primes is " + maxN);
    }
}


