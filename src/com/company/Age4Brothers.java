package com.company;

/**
 * Created by Stas on 23.01.2017.
 */
public class Age4Brothers {

    public static void main(String[] args) {
        int minAge = 5; //alt + ctrl + l  to jcc
        int maxAge = 15;
        //30 32 32 35
        for (int i = minAge; i < maxAge; i++) {
            for (int j = minAge; j < maxAge; j++) {
                for (int k = minAge; k < maxAge; k++) {
                    for (int l = minAge; l < maxAge; l++) {
                        int sum123 = i + j + k;
                        int sum234 = j + k + l;
                        int sum341 = k + l + i;
                        int sum412 = l + i + j;
                        if(sum123 == 30 && sum234 == 32 && sum341 == 32 && sum412 == 35)
                        {
                            System.out.println("1 Брат "  + i);
                            System.out.println("2 Брат "  + j);
                            System.out.println("3 Брат "  + k);
                            System.out.println("4 Брат "  + l);
                            break;
                        }

                    }
                }
            }
        }

    }
}
