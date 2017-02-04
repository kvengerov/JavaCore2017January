package com.company.lesson3.Cat;

import java.util.Scanner;

/*  Создать в классе Cat метод, который будет возвращать массу съеденной еды.
*   Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
*/
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.print("Enter cat's weight - ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        cat.weight(num);

        System.out.printf("Вес кота %.2f \n", cat.getWeight());
        //System.out.println("Кот сейчас: " + cat.changeWeight() + "\n");

//        cat.feed(220.0);
//        cat.drink(50.0);

        System.out.println("What are we doing?\n 1. Play\n 2. Eat\n 3. Rest");
//        Scanner sc1 = new Scanner(System.in);
        int answer = sc.nextInt();

//        for (int i = 1;;) {
//            cat.play();
//            System.out.println("Кот сейчас: " + cat.changeWeight());
//            for (int j = 2;;) {
//                double eat = sc.nextDouble();
//                cat.eaten(eat);
//                System.out.printf("Было съедено и выпито: %.2f \n", cat.totalAmount());
//                System.out.println("Кот сейчас: " + cat.changeWeight());
//                for (int k = 3;;){
//                    System.out.println(cat.rest());
//                    System.out.println("Кот сейчас: " + cat.changeWeight());
//                }
//            }
//        }
        int m = 0;
        for (int i = 1;;) {
            for (int j = 2;;) {
                for (int k = 3;;){
                    if (m == i) {
                        cat.play();
                        System.out.println("Кот сейчас: " + cat.changeWeight());
                    } else if(m == j){
                        double eat = sc.nextDouble();
                        cat.eaten(eat);
                        System.out.printf("Было съедено и выпито: %.2f \n", cat.totalAmount());
                        System.out.println("Кот сейчас: " + cat.changeWeight());
                    }else if(m == k) {
                        System.out.println(cat.rest());
                        System.out.println("Кот сейчас: " + cat.changeWeight());
                    }
                    else {
                        System.out.println("Cat dead");
                    }
                }
            }
        }
//        System.out.printf("Было съедено и выпито: %.2f теперь вес кота стал: %.2f \n", cat.totalAmount(), cat.getWeight());

//        System.out.println("Кот сейчас: " + cat.changeWeight());

//        for (int i = cat.getWeight(); i < ; i++) {
//
//        }
    }
}
