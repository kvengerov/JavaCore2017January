package com.company.HW2.OOP;

/**
 * Created by Stas on 30.01.2017.
 */
public class Cat extends Pet {
    public Cat() {
        if(weight == 0)
        weight = 500 + (int)(Math.random() * 3000);
    }

    @Override
    void voice() {
        System.out.println("Meow!");
    }
    void run(){
        super.run();
        System.out.println("Cat!");
    }

}
