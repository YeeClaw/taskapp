package com.apcsa.taskapp; // Package declaration

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    JTextField taskText;

    public App() {

        // Basic settings
        setTitle("TaskApp");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel menu = new JPanel();
        add(menu);

        // Create button that leads to the task manager
        JButton manageButton = new JButton("Task Manager");
        manageButton.setBackground(Color.PINK);
        menu.add(manageButton);

        // Create button that leads to contact manager
        JButton contactButton = new JButton("Contacts");
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
        mainWindow.setSize(375, 900);

        JButton newTask = new JButton("New Task :)");
        panel.add(newTask);

        JButton save = new JButton("Save :)");
        panel.add(save);



        newTask.addActionListener(e -> createTask(panel));
    }

    public void createTask(JPanel thing) {

        // JButton newButton = new JButton("complete");
        // thing.add(newButton);

        JTextField taskText = new JTextField();
        taskText.setColumns(20);
        thing.add(taskText);


        SwingUtilities.updateComponentTreeUI(thing);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


}