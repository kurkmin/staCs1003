import java.io.*;
import java.util.Scanner;

public class Week4Exercise1Part1 {
    public static int countWords(String fileName) {
        try {
            Scanner reader = new Scanner(new File(fileName));
            int totalNumWords = 0;
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                if (!"".equals(content.trim())) {
                    String[] eachLineWords = content.split("\\s");
                    totalNumWords += eachLineWords.length;
                }
            }
            reader.close();
            return totalNumWords;

        } catch (IOException e) {
            return -1;
        }
    }
}