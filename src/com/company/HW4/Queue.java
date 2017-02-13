package com.company.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Stas on 12.02.2017.
 */
public class Queue {
    public static void main(String[] args) throws IOException {
        //очередь FIFO queue dequeue
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> pacients = new ArrayList<>();
        for (; ; ) {
            System.out.println("Пожалуйста представтесь...");
            String name = reader.readLine();
            pacients.add(name);
            if (pacients.size() > 5) {
                String nextPacient = pacients.remove(0);
                System.out.println("Следуюбщий пациент:" + nextPacient);
            }

        }
    }
}
