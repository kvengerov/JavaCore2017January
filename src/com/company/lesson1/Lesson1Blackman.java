package com.company.lesson1;

public class Lesson1Blackman {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {

            if (i <= 4 && i >= 2){
                System.out.println("За столом " + i + " негритёнка.");
            }
            else if (i == 1){
                System.out.println("За столом " + i + " негритёнок.");
            }
            else if (i == 0){
                System.out.println("Нет больше негритят за столом.");
            }
            else{
                System.out.println("За столом " + i + " негритят.");
            }
        }
    }
}
