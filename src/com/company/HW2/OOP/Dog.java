package com.company.HW2.OOP;

/**
 * Created by Stas on 30.01.2017.
 */
public class Dog extends Pet implements Swim {
    public  Dog (){
        setWeight((int) (1000 + Math.random()*5000));
    }


    @Override
    void voice() {
        System.out.println("Uff Uff");
    }

    void run(){
        super.run();
        System.out.println("Dog!");
    }

    @Override
    public void swim() {
        System.out.println("Собачка плывет");

    }
}
