package com.company.CatAsMechanism;

import java.util.ArrayList;

/**
 * Created by Stas on 06.02.2017.
 */
public class Loader
{
    public static void main(String[] args) {
        Cat vaska = new Cat(5000+ 3500*Math.random());
        Cat murzik = new Cat(8900.0);
        Cat barsik = new Cat(7000.0);
        Cat shustrik = new Cat();
        Cat pushik = new Cat();
        Cat rizik = new Cat();
        Cat serik = new Cat();
        //Cat anomalik = new Cat(9999999.9);
        Cat normalik = new Cat(5000.0);
        Cat cat111 = new Cat();
        Cat cat222 = cat111.createClone();
        Cat cat333 = Cat.createClone(cat111);


        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(vaska);
        cats.add(murzik);
        cats.add(barsik);
        cats.add(shustrik);
        cats.add(pushik);
        cats.add(rizik);
        cats.add(serik); cats.add(rizik);
        cats.add(serik);
        //cats.add(anomalik);
        cats.add(normalik);
        int i = 1;
        System.out.println("Котов в наличи:");
        for(Cat cat: cats) {
            System.out.println("Cat№" + i + " " +cat.getStatus() + ", вес = " + cat.getWeight());
            i++;
        }
        //просто кормим котов, может некоторых и взорвем
        for(Cat cat: cats) {
            cat.feed(10000.0 * Math.random());
        }
        //жестококо это! )
        //замяукивем
        for (int j = 0; j < 4000; j++) {
            barsik.meow();
        }
        for (int j = 0; j < 200; j++) {
            //перекармливем
            vaska.feed(150.0 * Math.random());
        }

        // паказываем все параметры котов
        System.out.println("котики после еды - ");
        showCatParameters(cats);
        //все коты по очереди идут в туалет
        for(Cat cat: cats) {
            if(cat.getStatus().equals("Dead") && cat.getStatus().equals("Exploded"))
                cat.goToTheToilet();
        }
        // паказываем все параметры котов
        System.out.println("котики после туалета");
        showCatParameters(cats);
//вызов конструктора кошки
        Cat kitten = getKitten();
        cats.add(kitten);
        ArrayList<Cat> cats1 = new ArrayList<Cat>();
        // создание глубокой копии Vaski
        Cat clonVaski = vaska.createClone();
        Cat clonVaski1 = Cat.createClone(vaska);
        cats1.add(clonVaski );
        cats1.add(clonVaski1);
        cats1.add(vaska);

        System.out.println("коты с копиями и котенком");
        showCatParameters(cats1);
    }
    public static void showCatParameters(ArrayList<Cat> cats)
    {
        int i = 1;
        for(Cat cat: cats) {
            System.out.println("Cat№" + i + " " +cat.getStatus() + ", вес = " + cat.getWeight() + ", количество предложенной для съедения еды (грамм): - "
                    + cat.getFoodEated() + " колличество живих котов: " + cat.getCount() + " оригинальный вес и границы:" + cat.getMaxWeight()
                    + " " + cat.getMinWeight() + " " + cat.getOriginWeight());
            i++;
        }

    }
    //конструктор с котенком
    public static Cat getKitten()
    {
        return new Cat(100 + 100*Math.random());

    }

}

