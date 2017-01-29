package com.company.HW2.BoxLikeObjects;

import java.util.ArrayList;

/**
 * Created by Stas on 29.01.2017.
 */
public class Containery {
    private String name;
    private static int Count = 0;
    private int maxBoxes;
    private int boxCount;
    ArrayList<Box> boxes;

    public Containery(String name) {
        this.name = name;
        maxBoxes = 27;
        boxCount = 0;
        Count++;
        boxes = new ArrayList<Box>();
    }
    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    public static int getCount() {
        return Count;
    }

    public int getMaxBoxes() {
        return maxBoxes;
    }

    public int getBoxCount() {
        return boxCount;
    }

    public boolean putBox(Box box){

        if(boxCount < getMaxBoxes()) {
            boxes.add(box);
            boxCount++;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return  name;
    }

}
