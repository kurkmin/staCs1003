import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Week4Exercise1Part3 {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new File(args[0]));
            int totalNumWords = 0;
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                if (!"".equals(content.trim())) {
                    String[] eachLineWords = content.split("\\s");
                    for (String word: eachLineWords) {
                        if (word.equals(args[1])) {
                            totalNumWords += 1;
                        }
                    }

                }
            }
            reader.close();
            System.out.println("the occurrences of " + args[1] + "in the file: " + totalNumWords);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
