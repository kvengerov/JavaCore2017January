package com.company.ObjectModelCRUD.GUI;

import com.company.ObjectModelCRUD.model.Resume;
import com.company.ObjectModelCRUD.storage.SortedResumeStorage;
import com.company.ObjectModelCRUD.storage.Storage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stas on 13.02.2017.
 */
public class EditResume {
    private final static Storage ARRAY_STORAGE = new SortedResumeStorage();

    private JPanel rootPanel;
    private JList resumeList;
    private JButton save;
    private JButton delete;
    private JButton edit;
    private JTextField uuid;

    public EditResume() {
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resume resume = new Resume(uuid.getText());
                ARRAY_STORAGE.save(resume);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void updateList(){

    }




}
