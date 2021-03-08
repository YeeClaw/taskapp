package com.apcsa.taskapp; // Package declaration

// Imports
import javax.swing.*;

public class Main extends JFrame{

    public static void main( String[] args) {

        // Creates the actual gui for TaskApp
        App app = new App();
        app.setVisible(true);
    }
}
