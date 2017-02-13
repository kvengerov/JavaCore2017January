package com.company.CatAsMechanism;

/**
 * Created by Stas on 06.02.2017.
 */
public class Cat
{
    private  static int catCount = 0;
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double foodEated;

    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
    }
    public Cat(Double weight){
        minWeight = 100.0;
        maxWeight = 9000.0;
        this.weight = weight;
        originWeight = weight;
        if(isAlive())
            catCount++;
        foodEated = 0.0;
    }
    public Cat(Cat cat)
    {
        minWeight = cat.minWeight;
        maxWeight = cat.minWeight;
        weight = cat.weight;
        originWeight = cat.originWeight;
        foodEated = cat.foodEated;
        if(cat.isAlive())
            catCount++;
    }


    public Double getOriginWeight() {
        return originWeight;
    }
    public Double getMinWeight() {
        return minWeight;
    }
    public Double getMaxWeight() {
        return maxWeight;
    }


    //предотвращает создание копии мертвого кота
    public static Cat createClone (Cat donor)  {
        Cat cat = new Cat(donor);
        return cat;
    }
    public Cat createClone ()
    {
        return Cat.createClone(this);
    }

    private void changeWeight(Double weight)
    {
        //кот не есть и не мяучит если спит или мертв
        if(isAwake())
        {
            this.weight += weight;
            if(!isAlive())
                catCount--;
        }
    }
    public boolean isAlive()
    {
        return !(this.weight < minWeight || this.weight > maxWeight);
    }
    public boolean isAwake()
    {
        return !(this.weight < minWeight || this.weight > maxWeight || weight > originWeight);
    }

    public void meow()
    {
            changeWeight(-1.0);
        if(isAwake()) {
            System.out.println("Meow");
        }

    }

    public void feed(Double amount)
    {
        changeWeight(amount);

        foodEated += amount; //количество предложенной для сьедения еды

    }

    public void drink(Double amount)
    {
        changeWeight(amount);
    }

    public void goToTheToilet()
    {
        changeWeight(-300.0 * Math.random());
    }

    public static Integer getCount() {return catCount;}

    public Double getWeight()
    {
        return weight;
    }

    public Double getFoodEated(){return foodEated;}

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
