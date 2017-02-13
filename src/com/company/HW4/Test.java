package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Stas on 13.02.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.println("Введите команду!");
           String command = reader.readLine();
           if(command.toLowerCase().equals("exit")){
             break;
           }
        }

    }
}
