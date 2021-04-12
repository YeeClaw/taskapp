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
        mainWindow.setSize(375, 900);

        // JButton newTask = new JButton("New Task :)");
        // panel.add(newTask);
        // newTask.addActionListener(e -> createTask(panel));

        // JTextField task1 = new JTextField();
        // task1.setColumns(20);
        // panel.add(task1);

        JTextArea task1 = new JTextArea();
        task1.setColumns(20);
        panel.add(task1);


        // turn file data into a string
        Scanner fileScan = new Scanner(file);

        String line = "";
        while (fileScan.hasNextLine()) {
            // String line(i) = fileScan.nextLine();
            line += fileScan.nextLine() + "\n";
        }   
        
        // String line = fileScan.nextLine();
        
        // String line1 = "- eat";
        // String line2 = "- sleep";
        // String line3 = "- kill some one";

        // String yumm = "hey girl heyyy";
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
    
    // System.out.println("Which game are you editing?");
//                 String fname = userScan.nextLine();
//                 File changedFile = new File(fname);
//                 String oldFile = "";
//                 String[] split = null;
//                 Scanner fileScan = new Scanner(changedFile);

// ArrayList<String> names = new ArrayList<String>();
//                     while (fileScan.hasNextLine()) {
//                         String line = fileScan.nextLine();
//                         split = line.split(",");
//                         names.add(split[0].toLowerCase());
//                         System.out.println(line);
//                     }

    // public void createTask(JPanel thing) {

    //     // JButton newButton = new JButton("complete");
    //     // thing.add(newButton);

    //     JTextField taskText = new JTextField();
    //     taskText.setColumns(20);
    //     thing.add(taskText);


    //     SwingUtilities.updateComponentTreeUI(thing);
    // }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


}