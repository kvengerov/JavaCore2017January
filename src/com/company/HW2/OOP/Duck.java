package com.company.HW2.OOP;

/**
 * Created by Stas on 06.02.2017.
 */
public class Duck extends Pet implements Swim,Fly{


    public Duck() {
        if(weight == 0)
            weight = 500 + (int)(Math.random() * 3000);
    }

    @Override
    void voice() {
        System.out.println("Кря кря!");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит!");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет!");
    }
}
