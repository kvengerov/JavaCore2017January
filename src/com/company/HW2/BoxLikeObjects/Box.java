package com.company.HW2.BoxLikeObjects;

/**
 * Created by Stas on 29.01.2017.
 */
public class Box {
    private String name;
    private static int Count = 0;

    public Box(String name) {
        this.name = name;
        Count++;
    }

    public static int getCount() {
        return Count;
    }

    @Override
    public String toString() {
        return name;
    }

}
