package com.company.HW2.OOP;

import com.company.Main;

/**
 * Created by Stas on 06.02.2017.
 */
public class Carrot extends Pet implements Fly{
    public  Carrot (){
        setWeight((int) (100 + Math.random()*200));
    }

    @Override
    void voice() {
        System.out.println("Кеша хороший!");
    }

    @Override
    public void fly() {
        System.out.println("Кеша летает!");
    }
}
