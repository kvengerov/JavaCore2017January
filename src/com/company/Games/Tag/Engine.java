package com.company.Games.Tag;

/**
 * Created by Stas on 13.02.2017.
 */
public class Engine {
    private int maxElem;
    private int [][] tag;
    private int iIndex;
    private int jIndex;

    public int[][] getTag() {
        return tag;
    }

    public int getMaxElem() {
        return maxElem;
    }

    public Engine(int tagEdge) {
        int tagPole = tagEdge*tagEdge;
        maxElem = tagPole;
        tag = new int[tagEdge][tagEdge];
        int[] tags = new int[tagPole];
        int numCounter = 0 ;
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                int randNum = 0;
                do{
                    randNum = 1 + (int)(Math.random()*tagPole);
                }while (elementExist(randNum, tags));
                tags[numCounter++] = randNum;
                tag[i][j] = randNum;

            }

        }
    }
    public boolean elementExist(int elem, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem)
                return true;
        }
        return false;
    }
    public  void printTag(){
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++){
                if (tag[i][j] == maxElem) {
                    if(tag[i][j] < 10)
                        System.out.print("  ");
                    else
                        System.out.print("   ");
                    iIndex = i;
                    jIndex = j;
                }else {
                    if (tag[i][j] < 10)
                        System.out.print(tag[i][j] + "  ");
                    else
                        System.out.print(tag[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public  void shiftArr(int elem){
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                if(tag[i][j] == elem){
                    tag[i][j] = maxElem;
                    tag[iIndex][jIndex] = elem;
                }
            }
        }

    }
    public boolean canShift(int elem){
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                if(tag[i][j] == elem){
                    int iShift = Math.abs(iIndex - i);
                    int jShift = Math.abs(jIndex - j);
                    if(iShift == jShift)
                    {
                        return false;
                    } else if (iShift > 1 || jShift > 1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public  boolean checkWin() {
        int lastIndex = -1;
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                if(tag[i][j] <= lastIndex)
                    return false;
                else
                    lastIndex = tag[i][j];
            }
        }
        return true;
    }

}
