package com.company.HW3;

/**
 * Created by Stas on 06.02.2017.
 */
public class Loader {
    public static void main(String[] args) {
       CatExmpl cat = new CatExmpl(1000);
       cat.setWeight(-1);


    }

    static void hello() { //ничего не возвращает ничего не принимает
        System.out.println("hello programmer!");
    }

    static double rundom() {
        return Math.random();
    }

    static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    static int sumReturn(int num1, int num2){
        return num1 + num2;
    }
}
