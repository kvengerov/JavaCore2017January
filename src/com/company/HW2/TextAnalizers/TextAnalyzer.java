package com.company.HW2.TextAnalizers;

import sun.invoke.empty.Empty;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Stas on 30.01.2017.
 */
public class TextAnalyzer {
    ArrayList<String> words;
    Map<String, Integer> wordCounts;
    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public ArrayList<String> getWords() {

        String fragments[] = splitTextIntoFragments();
        ArrayList<String> words = new ArrayList<>();
        for (String fragment : fragments) {
            if (fragment.matches(".*[a-zA-Z].*")) {
                words.add(fragment);
            }
        }
        return words;
    }

    public void countWords() {
        words = getWords();
        wordCounts = new TreeMap<>();
        for (String word : words) {
            Integer count = wordCounts.get(word);
            wordCounts.put(word, count == null ? 1 : count + 1);
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return wordCounts.get(o2) - wordCounts.get(o1);
            }
        });
    }

    public String getMostFrequentWord() {
        countWords();
        return words.get(0);
    }

    public void showStatistic() {
        countWords();
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(wordCounts.size())
                .forEach(System.out::println);



        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        //entries.forEach(System.out::println);
        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
    }


    public void printWords() {
        for (String word : getWords()) {
            System.out.print("\"" + word + "\",");
        }
    }

    //========================================================

    private String[] splitTextIntoFragments() {
        return text.toLowerCase().split("[^a-z0-9\\-']");
    }

}
