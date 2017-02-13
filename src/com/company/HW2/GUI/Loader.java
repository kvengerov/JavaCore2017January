package com.company.HW2.GUI;

import javax.swing.*;


/**
 * Created by Stas on 30.01.2017.
 */
public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FirstForm form = new FirstForm();
        frame.setContentPane(form.getRootPanel());
        frame.setTitle("Rundom Number");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
