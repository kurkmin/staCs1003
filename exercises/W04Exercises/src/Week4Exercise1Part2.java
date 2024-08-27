import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Week4Exercise1Part2 {
    public static int countWords(String fileName, String userWord) {
        try {
            Scanner reader = new Scanner(new File(fileName));
            int totalNumWords = 0;
            while (reader.hasNextLine()) {
                String content = reader.nextLine();
                if (!"".equals(content.trim())) {
                    String[] eachLineWords = content.split("\\s");
                    for (String word: eachLineWords) {
                        if (word.equals(userWord)) {
                            totalNumWords += 1;
                        }
                    }

                }
            }
            reader.close();
            return totalNumWords;

        } catch (IOException e) {
            return -1;
        }
    }
}
