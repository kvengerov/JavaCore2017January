package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Stas on 12.02.2017.
 */
public class Medicine {
    public static void main(String[] args) throws IOException {

        TreeSet<String> medicines = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Please, type new item: ");
            String command = reader.readLine().trim().toLowerCase();
            if (command.equals("list")) {
                for (String item : medicines) {
                    System.out.println(item);
                }
            } else {
                medicines.add(command);
                System.out.println("Medicine is added!");
            }
        }

    }
}
