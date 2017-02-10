package com.company.HW2.OOP;

/**
 * Created by Stas on 30.01.2017.
 */
abstract public class Pet implements Comparable<Pet> {
    protected int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract void voice();

    void run(){
        System.out.println("What running?");
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Pet pet) {
            if(this.getWeight() < pet.getWeight())
                return +1;
            else if (this.getWeight() > pet.getWeight())
                return  -1;
            else
                return 0;
    }
}
