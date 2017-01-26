package com.company.lesson2;

import java.util.Scanner;

public class Lesson2SpaceShip {
    public static void main(String[] args) {

        int box = 0;
        int container = 0;
        int ship = 0;

        System.out.println("Сколько ящиков будем перевозить?");
        Scanner sc = new Scanner(System.in);
        box = sc.nextInt();

        if (box != 0) {
            container = box % 34 == 0 ? box / 34 : box / 34 + 1;
        }
        if (container != 0) {
            ship = container % 11 == 0 ? container / 11 : container / 11 + 1;
        }

        int b = 1;
        int c = 1;
        for (int i = 1; i <= ship; i++) {
            System.out.printf("Корабль %d:\n", i);
            int j = 0;
            while (j < 11 && c <= container) {
                System.out.printf("Контейнер %2d: ", c);
                int k = 0;
                while (k < 34 && b <= box) {
                    System.out.printf("Ящик %3d ", b);
                    k++;
                    b++;
                }
                j++;
                c++;
                System.out.println();
            }
        }
    }

}
