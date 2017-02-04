package com.company.lesson3.Cat;

public class Cat {
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    private Double lostWeight;

    private Double amountFeed;
    private Double amountDrink;

    public Cat() {
        //weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }
    public void weight(double kg){
        weight = kg;
    }


//    public void meow() {
//        weight--;
//        System.out.println("Meow");
//    }

    public void eaten(Double amountEat) {
        amountFeed = amountEat;
        weight = weight + amountEat;

    }

    public void play() {
        weight--;
        System.out.println("I'm playing! Meow!");
    }

//    public void feed(Double amount) {
//
//        //передача количества выпитого из локальной переменной amount в классовую переменную amountFeed
//        amountFeed = amount;
//        weight = weight + amount;
//    }
//
//    public void drink(Double amount) {
//
//        //передача количества выпитого из локальной переменной amount в классовую переменную amountDrink
//        amountDrink = amount;
//        weight = weight + amount;
//    }

    //метод подсчета количества съеденного и выпитого, для этого были созданны новые переменные
    // amountFeed и amountDrink

    public Double totalAmount() {
//        Double totalAmount = amountFeed + amountDrink;
        Double totalAmount = amountFeed;
        return totalAmount;
    }

    public Double getWeight() {
        return weight;
    }

//    public String getStatus() {
//        if (weight < minWeight) {
//            return "Поздравляем ваш кот стал мумией!";
//        } else if (weight > maxWeight) {
//            return "Ма-ма-а-а, он взорвался!!!";
//        } else if (weight > originWeight) {
//            return "Спит. Z-z-z-z!";
//        } else {
//            return "Играет. Вуху-у-у-у!";
//        }
//    }

    //метод rest уменьшает вес кота, когда тот ходит в туалет. создана локальная переменная lostWeight.
    // "облегчение" высчитывается рандомно.

    public String rest() {
        lostWeight = 1000.0 * Math.random();
        weight = weight - lostWeight;
        String text = String.format("Кот стал легче на %.2f и теперь весит %.2f \n", lostWeight, weight);
        return text;
    }

//    так вот сделай метод changeWeight() в которых происходят проверки на мертвоту, ...
//    по условиям как в статусе, и только тогда все изменения по весу делать в этом методе,
//    тогда реализуя в этом методе все, ты нигде не забудешь проверки

    public String changeWeight() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Booom";
        } else if (weight > originWeight) {
            return "Sleep";
        } else {
            play();
            return "Play";
        }
    }
}
