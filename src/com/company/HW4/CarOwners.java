package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stas on 12.02.2017.
 */
public class CarOwners {
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> cars = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Please, type new car number: ");
            String command = reader.readLine().trim().toUpperCase();
            if (command.equals("LIST")) {
                if (cars.size() > 0) {
                    for (String item : cars.keySet()) {
                        System.out.println(cars.get(item) + " owner of the car with the number: " + item);
                    }
                } else
                    System.out.println("Any car is apsent!");
            } else if (isCarNumber(command)) {
                String com = cars.get(command);
                if (com != null)
                    System.out.println(com + " owner of the car with the number: " + command);
                else {
                    System.out.println("Enter car owner please,  - ");
                    com = reader.readLine().trim();
                    cars.put(command, com);
                }
            } else if(command.equals("EXIT")){
                break;
            }else
                System.out.println("You have entered an incorrect number!");
        }

    }
    //A345XA99
    //A345XA34
    //Y234TY22
    private static Pattern pattern = Pattern.compile("[АВЕКМНОРСТУХDABEKMHOPCTYX][\\d]{3}[АВЕКМНОРСТУХDABEKMHOPCTYX]{2}([\\d]{2,3})");

    public static boolean isCarNumber(String testString) {
        Matcher matcher = pattern.matcher(testString);
        if(matcher.matches()) {
            int region = Integer.parseInt(matcher.group(1));
            if(region > 0 && region < 100 || region == 197 || region == 150 || region == 163 || region == 177) {
                return true;
            }
        }
        return false;
    }

}

