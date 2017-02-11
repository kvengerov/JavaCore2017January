package com.company.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.exit;

public class Garage {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> cars = new ArrayList<>();
        for (;;){
            System.out.println("Введите номер машины: ");
            String numberOfCars = reader.readLine();
            cars.add(numberOfCars);

            if(cars.size() > 4){
                System.out.println("Гараж заполнен. Нет места для парковки.");
                System.out.println(cars);

                System.out.println("Введите exit для выезда одной машины из гаража. \nВведите exitall для выезда всех машин из гаража. \nВведите close для закрытия программы");
                String clearCar = reader.readLine();
                String clearCarLowerCase = clearCar.toLowerCase();
                switch (clearCarLowerCase){
                    case "exit":
                        String nameCar = cars.remove(cars.size()-1);
                        System.out.println("Машина " + nameCar + " выехала.");
                        System.out.println(cars);
                        break;
                    case "exitall":
                        for (int i = -4; i < cars.size(); i++) {
                            String nameAllCar = cars.remove(cars.size()-1);
                            System.out.println("Машина " + nameAllCar + " выехала.");
                        }
                        System.out.println(cars);
                        System.out.println("Гараж пуст. Все места свободны.");
                        break;
                    case "close":
                        System.out.println("Завершение программы.");
                        exit(0);
                        break;
                }
            }
        }
    }
}
