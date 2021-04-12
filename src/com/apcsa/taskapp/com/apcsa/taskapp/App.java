package com.apcsa.taskapp; // Package declaration

// Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;

public class App extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    JTextField taskText;
    File file = new File("TaskData.txt");

    public App() {

        // Basic settings
        setTitle("TaskApp");
        setSize(500, 500);
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
        manageButton.addActionListener(e -> {
            try {
                taskWindow();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });
    }

    public void taskWindow() throws FileNotFoundException {

        JFrame mainWindow = new JFrame("Task Manager");
        mainWindow.setVisible(true);
        mainWindow.setSize(720, 1280);
        JPanel panel = new JPanel();
        mainWindow.add(panel);
        mainWindow.setSize(375, 250);

        JTextArea task1 = new JTextArea();
        task1.setColumns(20);
        panel.add(task1);


        // turn file data into a string
        Scanner fileScan = new Scanner(file);

        String line = "";
        while (fileScan.hasNextLine()) {
            line += fileScan.nextLine() + "\n";
        }   
        
        System.out.print(line);
        task1.setText(line);

        JButton save = new JButton("Save :)");
        panel.add(save);

        save.addActionListener(e -> {
            try {
                saveFile(task1);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });

    }

    public void saveFile(JTextArea task1) throws FileNotFoundException {

        String text = task1.getText();
        writeToFile(text);

    }
    
    public void writeToFile(String text) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(file);
        writer.print(text);
        writer.close();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {}
}