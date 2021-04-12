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
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
        JButton timerButton = new JButton("Timer");
        menu.add(timerButton);

        // Open window for task manager
        manageButton.addActionListener(e -> {
            try {
                taskWindow();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });

        timerButton.addActionListener(e -> {
            try {
                timerWindow();
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

    public void timerWindow() throws FileNotFoundException {

        JFrame newWindow = new JFrame("Timer");
        newWindow.setVisible(true);
        newWindow.setSize(720, 1280);

        JPanel timerPanel = new JPanel();
        newWindow.add(timerPanel);
        newWindow.setSize(375, 250);

        JTextField setTime = new JTextField();
        setTime.setColumns(5);
        timerPanel.add(setTime);

        JButton setTheTime = new JButton("set");
        timerPanel.add(setTheTime);

        setTheTime.addActionListener(e -> {
            timer(timerPanel, setTime);
        });

    }

    public void timer(JPanel timerPanel, JTextField setTime){
        
        String time = setTime.getText();

        JLabel label = new JLabel(String.valueOf(time));
        timerPanel.add(label);

        SwingUtilities.updateComponentTreeUI(timerPanel);

        //right now it just prints the time inputed, you just need to figure out how to make the timer part work
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {}
}