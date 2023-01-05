package A.skill.com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {

        // copy contain from one file to another
        String f1 = "C:\\Users\\A M D\\Desktop\\input.txt";
        FileReader fr = new FileReader(f1);

        String f2 = "C:\\Users\\A M D\\Desktop\\output.txt";
        FileWriter fw = new FileWriter(f2);
        int temp;
        while ((temp = fr.read()) != -1) {
            fw.write(temp);
        }
        System.out.println("File copy Successfully...");
        fw.close();
        fr.close();

    }
}