package view;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailListReader {
    private List<String> list = new ArrayList<String>();
     public MailListReader(String fileName) throws FileNotFoundException, IOException {
        Scanner reader = new Scanner(new File(fileName));

        String pattern = "^.+@.+\\..+$";
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.matches(pattern)) {
                list.add(line);
            }
        }
     }

     public List<String> getList() {
         return this.list;
     }
}
