package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stas on 23.01.2017.
 */
public class BinarySearchByHands {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int max = 42000000;
        System.out.println("Я попытаюсь угадать какое число от 0 до " + max + " Вы загадали!");

        int countAttempt = 0;
        System.out.println("Загадайте число!");
        int randomNumber = Integer.parseInt(reader.readLine().trim());
        for (; ; ) {
            int myAnsver = min + ((max - min) / 2);
            if (myAnsver < randomNumber) {
                min = myAnsver;
                countAttempt++;
            } else if (myAnsver > randomNumber) {
                max = myAnsver;
                countAttempt++;
            } else if (myAnsver == randomNumber) {
                System.out.println("Я угадал! c попытки № " + countAttempt + ", число - " + randomNumber);
                break;
            }
        }
    }

}

