package com.company;

/**
 * Created by Stas on 23.01.2017.
 */
public class CountBlacks {

    public static void main(String[] args) {
        int countBlacks = 10;
        for (int i = 0; i < countBlacks; i++) {
            System.out.println("Негритят за столом - " + (countBlacks-i) + ", негритят ушло - " + i);
        }
    }

}
