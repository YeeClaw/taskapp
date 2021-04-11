package com.apcsa.taskapp;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Task {
    private String taskname;

    public Task (String taskname) {
        this.taskname = taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public JComponent toComponent() {
        JPanel container = new JPanel();
        JButton newButton = new JButton("complete");

        JTextField taskText = new JTextField();
        taskText.setColumns(20);
        container.add(taskText);

        container.add(newButton);
        SwingUtilities.updateComponentTreeUI(thing);
        // return 
    }
}