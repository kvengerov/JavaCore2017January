package com.company.HW2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Stas on 29.01.2017.
 */
public class Gamer2Bones {
    public static void main(String[] args) {
        System.out.println("Please enter the number of shots!");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Random random = new Random();
        int[] shots = new int[count];
        int[] counter = new int[13];
        for (int i = 0; i < shots.length; i++) {
            int a = (1 + random.nextInt(6));
            int b = (1 + random.nextInt(6));
            shots[i] = a + b;
            counter[shots[i]]++;
        }
        int maxCombination = 0;
        int repeats = 0;
        int minCombination = 2;
        for (int i = minCombination; i < counter.length; i++) {
            if(counter[i] > repeats) {
                repeats = counter[i];
                maxCombination = i;
            }
            System.out.println("число " + i + " встретилось " + counter[i] + " раз");
        }
        System.out.println("наиболее часто встретившаяся комбинация: " +  maxCombination);
    }
}
