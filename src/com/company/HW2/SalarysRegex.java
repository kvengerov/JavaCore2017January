package com.company.HW2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stas on 29.01.2017.
 */
public class SalarysRegex {
    public static void main(String[] args) {
        String text = "Ваcилиса Егоровна заранботала 508800 рублей, Петя - 7563 рубля, а Cтас Пьеха - 3008800 рублей !!";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        int summ = 0;
        while (m.find()) {
            System.out.println(m.group(0));
            summ += Integer.parseInt(m.group(0));
        }
        System.out.println("Общая сумма заработка: " + summ );
    }
}
