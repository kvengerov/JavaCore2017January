package com.company.HW4;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stas on 12.02.2017.
 */
public class SortStream {
    public static void main(String[] args) {
        TreeMap<Integer, String> random = new TreeMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            random.put((int)(Math.random() * 100), String.valueOf((int) (Math.random() * 100)));
        }

        System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));

        Map<Integer, String> sortedMap =
                random.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map: " + Arrays.toString(sortedMap.entrySet().toArray()));
    }
}
