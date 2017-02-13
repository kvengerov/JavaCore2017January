package com.company.ObjectModelCRUD.GUI;



import javax.swing.*;

/**
 * Created by Stas on 13.02.2017.
 */
public class Loader {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        JFrame frame = new JFrame();
        EditResume form = new EditResume();
        frame.setContentPane(form.getRootPanel());
        frame.setTitle("TAG");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
