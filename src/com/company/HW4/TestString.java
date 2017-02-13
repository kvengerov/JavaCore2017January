package com.company.HW4;

/**
 * Created by Stas on 12.02.2017.
 */
public class TestString {
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "abc";
        System.out.println(text1 + " "+ text2);
        System.out.println(text1 == text2);
        text1 += "";
        System.out.println(text1 + " "+ text2);
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));

    }
}
