package com.company.lesson2;

public class Lesson2Field {
    public static void main(String[] args) {

        int white = 9856;
        int black = 9724;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1)
                        System.out.print((char) white + " ");
                    else
                        System.out.print((char) black + " ");
                } else {
                    if (j % 2 == 1)
                        System.out.print((char) black + " ");
                    else
                        System.out.print((char) white + " ");
                }
            }
            System.out.println();
        }
    }
}
