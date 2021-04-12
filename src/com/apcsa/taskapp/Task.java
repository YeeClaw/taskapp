package com.apcsa.taskapp;

import javax.swing.*;


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
        SwingUtilities.updateComponentTreeUI(container);

        return null;
    }
}