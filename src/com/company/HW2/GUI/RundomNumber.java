package com.company.HW2.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Stas on 30.01.2017.
 */
public class RundomNumber {
    private JPanel rootPanel;
    private JButton rundomNumb;
    private JTextField number;



    public RundomNumber() {
        rundomNumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.setText(String.valueOf(Math.round(100*Math.random())));
            }
        });
    }
    public JPanel getRootPanel() {
        return rootPanel;
    }




}
