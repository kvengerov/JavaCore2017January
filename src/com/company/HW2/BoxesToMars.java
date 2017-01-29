package com.company.HW2;

import java.util.Scanner;

/**
 * Created by Stas on 29.01.2017.
 */
public class BoxesToMars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countBoxes = in.nextInt();
        int boxesInContainer = 34;
        int conteinersInShip = 11;
        int containerCount = 0;
        int shipCount = 0;
        for (int i = 0; i < countBoxes; i++) {
            if(i%(conteinersInShip * boxesInContainer) == 0) {
                System.out.println("Космический  корабль" + (shipCount + 1));
                shipCount++;
            }
            if(i%boxesInContainer == 0){
                System.out.println("Контейнер " + (containerCount + 1));
                containerCount++;
            }

            System.out.println("Ящик " + (i+1));
        }
        System.out.println("Всего космических кораблей:" + shipCount);
        System.out.println("Всего контейнеров:" + containerCount);

    }




   
}
