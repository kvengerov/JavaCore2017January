package com.company.lesson3.Cat;
/*  Создать в классе Cat метод, который будет возвращать массу съеденной еды.
*   Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-нибудь печатать.
*/
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.printf("Вес кота %.2f \n", cat.getWeight());
        System.out.println("Кот сейчас: " + cat.getStatus() + "\n");

        cat.feed(220.0);
        cat.drink(50.0);

        System.out.printf("Было съедено и выпито: %.2f теперь вес кота стал: %.2f \n", cat.totalAmount(), cat.getWeight());


        System.out.println(cat.rest());
        System.out.println("Кот сейчас: " + cat.getStatus());
    }
}
