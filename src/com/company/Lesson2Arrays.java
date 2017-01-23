package com.company;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Stas on 23.01.2017.
 */
public class Lesson2Arrays {


    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubles = new double[10];
        String[] strings = new String[10];
        int[] intArray1 = {1,1,12,3,1,21,21,2,12,12,};
        Object[] objects = {1,"22q212",2.0};
        Random random = new Random();
//        for (int i = 0; i < intArray.length; i++) {
//          intArray[i] = 1 + random.nextInt(6); //1 + Math.random()*6;
//        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(objects));
//        for (int i : intArray) { //итерироваться
//            System.out.println(i);
//        }

    }
}
