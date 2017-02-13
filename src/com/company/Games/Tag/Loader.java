package com.company.Games.Tag;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Stas on 13.02.2017.
 */
public class Loader {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        Pole form = new Pole(7);
//        frame.setContentPane(form.getRootPanel());
//        frame.setTitle("TAG");
//        frame.setSize(600,600);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);

        Engine game = new Engine(4);
        game.printTag();
        System.out.println(game.checkWin());
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Введите число ;)");
            int num = Integer.parseInt(reader.nextLine());
            if(!game.canShift(num)){
                System.out.println("Некорректный ввод!");
                continue;
            }
            game.shiftArr(num);
            if(game.checkWin())
            {
                System.out.println("Вы выиграли!");
                break;
            }
            game.printTag();
        }while (true);
    }

}
