package com.company.lesson2;

public class Lesson2Char {
    public static void main(String[] args) {

        char ch = 32;
        char alfA = 'а';
        char alfAa = 'А';

        for (int i = 0; i < ch; i++) {
            System.out.print((char) ('а' + i) + " = ");
            System.out.print((int) (alfA + i) + " ");
            System.out.print((char) ('А' + i) + " = ");
            System.out.println((int) (alfAa + i));
        }
    }
}
