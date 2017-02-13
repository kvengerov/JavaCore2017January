package com.company;



/**
 * Created by Stas on 23.01.2017.
 */
public class StaticTest {
     //System.out.println("its non static"); выводить нельзя

    public StaticTest() {
        System.out.println("its consructor");
    }
    {
        System.out.println("its non static");
    }
    static {
        System.out.println("its static");
    }


}
