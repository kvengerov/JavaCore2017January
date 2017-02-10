package com.company.HW3;

/**
 * Created by Stas on 06.02.2017.
 */
public class CatExmpl {
    private double weight;

    public CatExmpl(double weight) {
        this.weight = weight;
    }

    public CatExmpl(){
        changeWeight();
    }

    private void changeWeight(){
        this.weight = Math.random();
    }




    public void setWeight(double weight) {
        if(weight > 0)
        this.weight = weight;
        else
            System.out.println("Вы не можете присвоить такой вес!");
    }

    public double getWeight() {
        return weight;
    }
}
