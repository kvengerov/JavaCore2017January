package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[10000];

        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
          intArray[i] = 1 + random.nextInt(1000000); //1 + Math.random()*6;
        }
        for (int i = 0; i < intArray.length; i++) {
            if(333 == intArray[i])
                System.out.println("ура!!!" + 333);

        }

    }
}
