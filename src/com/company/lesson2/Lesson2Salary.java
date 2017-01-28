package com.company.lesson2;

public class Lesson2Salary {
    public static void main(String[] args) {

        String name = "Виталий заработал 30 рублей, Гена заработал 50 рублей, Дмитрий - 35 рублей.";

        System.out.println(name);

        int firstMan1 = name.indexOf("заработал");
        int firstMan2 = name.indexOf("руб");
        String text1 = name.substring(firstMan1 + 9, firstMan2).trim();
        System.out.println(text1);

        int lastMan1 = name.lastIndexOf("-");
        int lastMan2 = name.lastIndexOf("руб");
        String text2 = name.substring(lastMan1 + 2, lastMan2).trim();
        System.out.println(text2);

        System.out.println (Integer.parseInt(text1) + Integer.parseInt(text2));

    }
}
