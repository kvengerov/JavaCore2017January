package com.company.HW2;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Stas on 29.01.2017.
 */
public class CountWordsInText {
    public static void main(String[] args) {
        String text = "My name is Dima. I am a student of the second year  of study. I study at the university. " +
                "My hobby is music. When I have free time I usually go to the biggest music shop in my town and buy " +
                "CDs with my favourite music. I have a big collection of CDs at home, but I can not resist the temptation " +
                "of buying a new CD. That what I like to buy most of all.\n" +
                "\n" +
                "But when it comes to buying new clothes, I am really at a loss. I do not follow fashion very much. " +
                "That's why I almost always have problems with finding the clothes that suit me. When I need new clothes," +
                " I usually go to a shop with my fried or relatives. Some of them are fond of fashion and may advise me the " +
                "clothes that are becoming and suit me best.\n" +
                "\n" +
                "As for food, I like to go to a supermarket and buy there everything my family needs. " +
                "I often go shopping with my mother. She buys healthy food for our family fruits and vegetables," +
                " fish, honey, cheese and turkey. As for me, I buy what I most of all: biscuits, candied fruit jelly, " +
                "shrimps and sweets. I buy them not only for myself but also for the whole family. " +
                "That's what I like shopping? for! I, can buy things that I like and it raises my mood. 12 is a number email@mail.ru drag-and-drop";

        //String[] textArr = new Scanner(System.in).nextLine().split(" ");
        String[] textArr =  text.split("\\s+");
        System.out.println(Arrays.toString(textArr));
        System.out.println(textArr.length);
        //String szDelemiters = "\"(),+-=<>?!@#$%^&*~'./\\";
        StringTokenizer st = new StringTokenizer(text);
        int countWords = st.countTokens();
        int counter = 0;
        while(st.hasMoreTokens())
        {
            if(counter%6 == 0)
                System.out.println();
            else
            System.out.print(st.nextToken() + "    ");
            counter++;
        }
        System.out.println("\n" +countWords);



    }

}
