package com.company.Games.Tag;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stas on 13.02.2017.
 */
public class Pole extends JFrame {
    private JPanel rootPanel;
    private int [][] tag;
    private Engine game;
    private int maxElem;
    private int turnes;

    public JPanel getRootPanel() {
        return rootPanel;
    }



    public void setTag(int[][] tag){
        this.tag = tag;
    }

    public Pole(int edge)  {
        turnes = 0;
        game = new  Engine(edge);
        tag = game.getTag();
        maxElem = game.getMaxElem();
        game.printTag();
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        for (int i = 0; i < tag.length; i++) {
            for (int j = 0; j < tag[i].length; j++) {
                c.gridy = i;
                JButton button = new JButton(String.valueOf(tag[i][j]));
                button.setPreferredSize(new Dimension(50,50));
                if(tag[i][j] == maxElem)
                    button.setText("");

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(!button.getText().equals("")) {
                            int num = Integer.parseInt(button.getText());
                            if (game.canShift(num)) {
                                game.shiftArr(num);
                                turnes++;
                                rePaint(num);
                                System.out.println("------------------------");
                                if (game.checkWin()) {
                                    System.out.println("You win!");
                                    JOptionPane.showMessageDialog(rootPanel,"You win from " + turnes  + " moves!");
                                }
                                game.printTag();
                            }
                        }
                    }

                });

                rootPanel.add(button, c);
            }
        }

    }

    private void rePaint(int num){
        JButton button1 = null;
        Component[] component = rootPanel.getComponents();
        for (int i = 0; i < component.length; i++) {
            if (component[i] instanceof JButton)
            {
                button1 = (JButton)component[i];
                button1.setEnabled(true);
                if(button1.getText().equals(""))
                    break;
            }
        }
        Component[] components = rootPanel.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JButton)
            {
                JButton button = (JButton)components[i];
                button.setEnabled(true);
                if(button.getText().equals(String.valueOf(num)))
                    button.setText("");
            }
        }
        button1.setText(String.valueOf(num));

    }

}
