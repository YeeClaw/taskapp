package com.apcsa.taskapp; // Package declaration

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    public App() {

        // Basic settings
        setTitle("TaskApp");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel menu = new JPanel();
        add(menu);

        // Create button that leads to the task manager
        JButton manageButton = new JButton("Task Manager :)");
        manageButton.setBackground(Color.PINK);
        menu.add(manageButton);

        // Create button that leads to contact manager
        JButton contactButton = new JButton("Contacts :)))))))))");
        menu.add(contactButton);

        // Open window for task manager
        manageButton.addActionListener(e -> taskWindow());
    }

    public void taskWindow() {

        JFrame mainWindow = new JFrame("Task Manager");
        mainWindow.setVisible(true);
        mainWindow.setSize(720, 1280);
        JPanel panel = new JPanel();
        mainWindow.add(panel);

        JButton newTask = new JButton("New Task :)");
        panel.add(newTask);
        // thing.setBounds(100, 200, 10, 20);

        newTask.addActionListener(e -> createTask(panel));
    }


    public void createTask(JPanel thing) {

        JButton newButton = new JButton("complete");
        newButton.setLayout(null);
        // newButton.setBounds(100, 100, 50, 10);
        newButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        newButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        thing.add(newButton);
        SwingUtilities.updateComponentTreeUI(thing);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}