package com.company;

/**
 * Created by Stas on 23.01.2017.
 */
public class ObjectType {
    public static  void f (Object... args){
        for (Object o: args) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // write your code here
        f(1,2.4,"now!",4,5);
    }

}
