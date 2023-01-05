package A.skill.com;

import java.io.FileReader;
import java.io.FileWriter;

public class fileOperation {
    public static void main(String[] args) {
        // create a file in desktop
        try{
            String f1 = "C:\\Users\\A M D\\Desktop\\zzz.txt";
            FileWriter fr = new FileWriter(f1);
            try {
                // this is write in txt file
                fr.write("Java program is the best");

            } finally {
                fr.close(); // for closing the file for security.

            }
            System.out.println("Successfully write in file...");

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
