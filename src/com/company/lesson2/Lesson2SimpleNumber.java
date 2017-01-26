package com.company.lesson2;

public class Lesson2SimpleNumber {
    public static void main(String[] args) {

        int i = 10000;

        for (int x = 2; x < i; x++) {
            int y = 0;
            for (int j = 1; j <= x; j++) {
                if (x % j == 0)
                    y++;
            }
            if (y <= 2)
                System.out.println(x);
        }
    }
}
