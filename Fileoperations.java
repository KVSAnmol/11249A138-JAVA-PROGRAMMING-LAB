import java.io.*;

public class Fileoperations {
    public static void main(String[] args) throws IOException {

        // Open and write to file
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Welcome to the java programming lab");
        fw.close();

        System.out.println("Data written successfully.");

        // Open and read the file
        FileReader fr = new FileReader("sample.txt");

        int ch;
        System.out.println("File contents:");

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // Close the file
        fr.close();
    }
}