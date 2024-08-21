import java.io.*;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new File("test-short.txt"));
            int totalNumWords = 0;
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                if (!"".equals(content.trim())) {
                    String[] eachLineWords = content.split("\\s");
                    totalNumWords += eachLineWords.length;
                }
            }
            reader.close();
            System.out.println("the number of words: " + totalNumWords);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
