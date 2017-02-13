package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Stas on 12.02.2017.
 */
public class CarsParking {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cars = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Enter command: ");
            String command = reader.readLine().trim().toLowerCase();
            if (command.equals("exitall")) {
                if (cars.size() > 0) {
                    for (int i = cars.size() - 1; i >= 0; i--) {
                        System.out.println("Car " + cars.remove(i) + " left");
                    }
                } else
                    System.out.println("parking is empty!");
            } else if (command.equals("exitlast")) {
                if (cars.size() > 0)
                    System.out.println("Car " + cars.remove(cars.size() - 1) + " left");
                else
                    System.out.println("last car is absent, parking is empty!");
            } else if (cars.size() == 5)
                System.out.println("Parking is full!");
            else
                System.out.println("Car came in to parking - " + cars.add(command));
        }
    }
}
