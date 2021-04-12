package com.apcsa.taskapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> todolist = new ArrayList<Task>();
    private String listName;
    
    public TodoList(ArrayList<Task> tasks, String listName)  {
        

    }

    public void fileWriter() throws IOException {
        File file = new File("");
        PrintWriter output = new PrintWriter(new FileWriter(file));

        // puts stuff into the file
        output.println("yuh");
    }
}
