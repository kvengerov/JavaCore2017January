package com.company.lesson2;

import java.util.Arrays;

import static java.lang.Math.random;

public class Lesson2CubeGame {
    public static void main(String[] args) {

        int count = 10;

//        for (int i = 0; i < count; i++) {
//            int a = (int) (1 + random() * 6);
//            int b = (int) (1 + random() * 6);
//            int g = a + b;
//
//            System.out.println(a + " + " + b + " = " + g);
//
//        }

        int[] arr = new int[count];
        int[] counter = new int[13];

        for (int i = 0; i < arr.length; i++) {
            int a = (int) (1 + random() * 6);
            int b = (int) (1 + random() * 6);
            arr[i] = a + b;

            System.out.println(a + " + " + b);

            counter[arr[i]]++;
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < counter.length; i++) {
            System.out.println("число " + i + " встретилось " + counter[i] + " раз");
        }
    }
}
