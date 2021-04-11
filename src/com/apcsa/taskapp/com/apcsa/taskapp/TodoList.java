import java.util.ArrayList;
import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TodoList {
    private ArrayList<Task> todolist = new ArrayList<Task>();
    private String listName;
    
    public TodoList(ArrayList<Task> tasks, String listName)  {
        
        // for(int i=0; i<length; i++ ) {
        //     myArray[i] = s.nextInt();
        //  }
    }

    public void fileWriter() {
        File file = new File(file);
        Printwriter output = new PrintWriter(new FileWriter(file));

        // puts stuff into the file
        output.println("yuh");
    }
}
