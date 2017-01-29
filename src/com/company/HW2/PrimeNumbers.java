package com.company.HW2;

/**
 * Created by Stas on 28.01.2017.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        final int capasity = 100000;
        int primeCount = 1;
        System.out.println(2);
        for (int i = 3; i < capasity; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j < Math.sqrt(i) + 1; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                primeCount++;
            }
        }
        System.out.println(" Primes: " + primeCount);
    }
}
