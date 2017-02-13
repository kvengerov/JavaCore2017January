package com.company.HW2;

/**
 * Created by Stas on 29.01.2017.
 */
public class Salarys {
    public static void main(String[] args) {
        String text = "Ваcилиса Егоровна заранботала 508800 рублей, Петя - 7563 рубля, а Cтас Пьеха - 3008800 рублей !!!!";
        text = text.trim();
        System.out.println(text);
        int firstValuta = text.indexOf(" рубл");//почему здесь пробел, потому что есть имена Рубен а может быть тогда и часть слова
        int lastValuta = text.lastIndexOf(" рубл");
        int salaryVasiya = Integer.parseInt(text.substring(text.lastIndexOf(" ", firstValuta - 1) + 1, firstValuta));
        int salarySasha = Integer.parseInt(text.substring(text.lastIndexOf(" ", lastValuta -1) + 1, lastValuta));
        System.out.println("Зарплата Cтаса и Василисы в сумме: " + (salarySasha + salaryVasiya));
    }

}

