package com.apcsa.taskapp; // Package declaration

// Imports
import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    public App() {

        // Constructor for default app settings
        setTitle("TaskApp");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel gui = new JPanel();
        gui.setLayout(null);
        add(gui);
    }

}
