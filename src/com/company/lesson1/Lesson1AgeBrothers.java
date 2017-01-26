package com.company.lesson1;

public class Lesson1AgeBrothers {
    public static void main(String[] args) {
        int ageVasya = 30;
        int ageMisha = 20;
        int ageVadim = 2;

        if (ageVasya > ageMisha && ageVasya > ageVadim && ageMisha < ageVasya && ageMisha > ageVadim) {
            System.out.println("Самый старший: Вася " + ageVasya + "\nСредний: Миша " + ageMisha + "\nСамый младший: Вадим " + ageVadim);
        }
        else if (ageVadim > ageMisha && ageVadim > ageVasya && ageMisha < ageVadim && ageMisha > ageVasya){
            System.out.println("Самый старший: Вадим " + ageVadim + "\nСредний: Миша " + ageMisha + "\nСамый младший: Вася " + ageVasya);
        }
        else if (ageMisha > ageVasya && ageMisha > ageVadim && ageVasya < ageMisha && ageMisha > ageVadim){
            System.out.println("Самый старший: Миша " + ageMisha + "\nСредний: Вадим " + ageVadim + "\nСамый младший: Вася " + ageVasya);
        }
        else {
            System.out.println("Самый старший: Вадим " + ageVadim + "\nСредний: Вася " + ageVasya + "\nСамый младший: Миша " + ageMisha);
        }
    }

}
