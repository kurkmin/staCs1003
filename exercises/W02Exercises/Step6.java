import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Step6 {
    // records the information relating to the fruit the user asks for
    public static void csv(String fruits, File fileName) {
        try {
            fileName.exists();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        try {

            Scanner reader = new Scanner(fileName);
            Map<String, String> myMap = new HashMap<String, String>();
            while (reader.hasNextLine()) {
                String[] contents = reader.nextLine().split("\\s");
                myMap.put(contents[0], contents[1] + " " + contents[2] + " " +
                        contents[3]);
            }
            reader.close();
            PrintWriter writer = new PrintWriter("newFile.txt");
            if (myMap.containsKey(fruits)) {
                writer.println(myMap.get(fruits));
                System.out.println("Recorded in the new file!");
            } else {
                System.out.println("it does not have the one you are looking for!");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    // it copies the contents of input file and pastes to a new file
    public static void text(File fileName) {
        try {
            Scanner reader = new Scanner(fileName);
            PrintWriter writer = new PrintWriter("newHello.txt");
            while (reader.hasNextLine()) {
                String contents = reader.nextLine();
                writer.println(contents);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        File fileName = new File(args[0]);
        if (!fileName.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }
        try {
            text(fileName);
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
        // System.out.println("Type the name of fruits to see the corresponding
        // information: ");
        // Scanner reader = new Scanner(System.in);
        // String fruits = reader.nextLine();
        // reader.close();
        // csv(fruits, fileName);

    }
}
