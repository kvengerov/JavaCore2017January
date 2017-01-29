package com.company.HW2.BoxLikeObjects;

import java.util.ArrayList;

/**
 * Created by Stas on 29.01.2017.
 */
public class SpaceShip {
    private static int count = 0;
    private String name;
    private int containerCount;
    private int containerMax;
    ArrayList<Containery> containers;

    public SpaceShip(String name) {
        this.name = name;
        containerCount = 0;
        containerMax = 12;
        count++;
        containers = new ArrayList<Containery>();
    }


    public int getContainerMax() {
        return containerMax;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public static int getCount() {
        return count;
    }

    public boolean putContainery(Containery containery) {
        if (containerCount < getContainerMax()) {
            containers.add(containery);
            containerCount++;
            return true;
        } else
            return false;
    }

    public boolean putBox(Box box) {
        if (containerCount > 0) {
            if (containers.get(containerCount - 1).putBox(box))
                return true;
            else {
                if (containerCount < containerMax) {
                    putContainery(new Containery("Контейнер " + (Containery.getCount() + 1)));
                    putBox(box);
                    return true;
                } else
                    return false;
            }
        } else {
            if (putContainery(new Containery("Контейнер " + (Containery.getCount() + 1)))) {
                putBox(box);
                return true;
            } else
                return false;
        }
    }

    public ArrayList<Containery> getContainers() {
        return containers;
    }

    @Override
    public String toString() {
        return name;
    }

}
