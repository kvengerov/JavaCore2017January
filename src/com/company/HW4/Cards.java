package com.company.HW4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Stas on 12.02.2017.
 */
public class Cards {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        //J=Jack , Q = Queen, K=King, A = Ace
        String[] cardNum ={"6","7","8","9","10","J","Q","K","A"};
        //H=Hearts, D= Diamonds, S=Spades, C = Clubs
        String[] cardSuit = {"H","D","S","C"};
        for (;;){
            for (String aCardSuit : cardSuit) {
                for (String aCardNum : cardNum) {
                    cards.add(aCardSuit + aCardNum);
                }
            }
            if (cards.size()==36) break;
        }
        Collections.shuffle(cards);
        for (String card: cards
                ) {
            System.out.println(card);
        }
    }

}
