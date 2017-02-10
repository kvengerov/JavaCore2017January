package com.company.HW2.OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Stas on 30.01.2017.
 */
public class Loader {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(3);
            switch (random) {
                case 0:
                    pets.add(new Cat());
                    break;
                case 1:
                    pets.add(new Dog());
                    break;
                case 2:
                    pets.add(new Carrot());
                    break;
                default:
                    pets.add(null);
                    break;
            }
        }
        Collections.sort(pets);
        for (Pet pet: pets) {
            pet.voice();
            System.out.println(pet.getWeight());
            if(pet instanceof Cat){
                System.out.println("котик найден");
            }

        }

    }

}
