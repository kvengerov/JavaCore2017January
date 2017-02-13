package com.company.HW2.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stas on 12.02.2017.
 */
public class FirstForm {
    private JPanel rootPanel;
    private JButton GetRandom;
    private JTextField number;

    public FirstForm() {
        GetRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number.setText(String.valueOf(100 * Math.random()));
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
