package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Stas on 12.02.2017.
 */
public class PhoneBook {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> phoneNums = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Please, type phone number or phone owners name: ");
            String command = reader.readLine().trim();
            if (command.toUpperCase().equals("LIST")) {
                if (phoneNums.size() > 0) {
                    Set<Map.Entry<String, String>> sortedSet = new TreeSet<>(new Comparator<Map.Entry<String, String>>() {
                        @Override
                        public int compare(Map.Entry<String, String> lhs, Map.Entry<String, String> rhs) {
                            if (lhs.getValue().compareTo(rhs.getValue())==0){
                                return lhs.getKey().compareTo(rhs.getKey());
                            }
                            return lhs.getValue().compareTo(rhs.getValue());
                        }
                    });
                    sortedSet.addAll(phoneNums.entrySet());

                    for (Map.Entry<String, String> entry : sortedSet) {
                        System.out.println(String.format("%s owner of the phone with the number: %s", entry.getValue(), entry.getKey()));
                    }
//                    for (String item : phoneNums) {
//                        System.out.println(phoneNums.get(item) + " owner of the phone with the number: " + item);
//                    }
                } else
                    System.out.println("Any phone is apsent!");
            } else if (command.toUpperCase().equals("EXIT")){
                break;
            }
            else {
                boolean isName = isName(command);
                boolean isPhoneNumber = isPhoneNumber(command);
                if (isPhoneNumber) {
                    String com = phoneNums.get(command);
                    if (com != null)
                        System.out.println(com + " owner of the phone with the number: " + command);
                    else {
                        System.out.println("Enter phone owner please,  - ");
                        com = reader.readLine().trim();
                        while (!isName(com)) {
                            System.out.println("You entered no Name, please type from 2 to 20 characters beginning with a capital letter:");
                            com = reader.readLine().trim();
                        }
                        phoneNums.put(command, com);
                    }
                } else if (isName) {
                    int counter = 0;
                    for (Map.Entry<String, String> e : phoneNums.entrySet()) {
                        if (command.equals(e.getValue())) {
                            System.out.println(e.getValue() + " owner of the phone with the number: " + e.getKey());
                            counter++;
                        }
                    }
                    System.out.println("The phonebook has the following " + counter + " people with the name " + command);
                    if (counter == 0) {
                        System.out.println("Please, type phone number name for " + command);
                        String newNumb = reader.readLine().trim();
                        while (!isPhoneNumber(newNumb) || phoneNums.get(newNumb) != null) {
                            if(!isPhoneNumber(newNumb)) {
                                System.out.println("You entered no phone number , enter the number of the pattern 10 digits:");
                            }else{
                                System.out.println("This number already exists! Please another number for " + command);
                            }
                            newNumb = reader.readLine().trim();
                        }
                        phoneNums.put(newNumb, command);
                    }
                } else
                    System.out.println("You have entered an incorrect data!");

            }
        }
    }

    public static boolean isPhoneNumber(String testString) {
        return testString.matches("[\\d]{10}");

    }

    public static boolean isName(String testString) {
        return testString.matches("([A-Z][a-z]{1,19})|([А-ЯЁ][ёа-я]{1,19})");
    }


}

