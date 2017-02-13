package com.company;

/**
 * Created by Stas on 23.01.2017.
 */
public class AgesOfBrother {
    public static void main(String[] args) {
        int ageVasya = 100;
        int ageKolya = 13;
        int ageMisha = 150;

        int oldest = 0;
        int yongest = 0;
        int middle = 0;

        if(ageVasya <= ageKolya && ageVasya <= ageMisha){
            yongest =  + ageVasya;
            if(ageKolya <= ageMisha){
                middle = ageKolya;
                oldest = ageMisha;
            }else{
                middle = ageMisha;
                oldest = ageKolya;
            }
        }
        if(ageKolya <= ageVasya && ageKolya <= ageMisha){
            yongest = ageKolya;
            if(ageVasya <= ageMisha){
                middle = ageVasya;
                oldest = ageMisha;
            }else{
                middle = ageMisha;
                oldest = ageVasya;
            }
        }
        if(ageMisha <= ageKolya && ageMisha <= ageVasya){
            yongest = ageMisha;
            if(ageKolya <= ageVasya){
                middle = ageKolya;
                oldest = ageVasya;
            }else{
                middle = ageVasya;
                oldest = ageKolya;
            }
        }
        System.out.println("младший " + yongest);
        System.out.println("средний " + middle);
        System.out.println("старший " + oldest);

    }
}
