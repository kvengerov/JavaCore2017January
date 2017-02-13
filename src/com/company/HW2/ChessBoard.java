package com.company.HW2;

/**
 * Created by Stas on 29.01.2017.
 */
public class ChessBoard {
    public static void main(String[] args) {

        int boardSize = 8;
        int whiteCell = 9856;
        int blackCell = 9724;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1)
                        System.out.print((char) whiteCell + " ");
                    else
                        System.out.print((char) blackCell + " ");
                } else {
                    if (j % 2 == 1)
                        System.out.print((char) blackCell + " ");
                    else
                        System.out.print((char) whiteCell + " ");
                }
            }
            System.out.println();
        }
    }
}
