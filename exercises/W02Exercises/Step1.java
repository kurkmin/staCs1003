import java.io.*;

public class Step1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test-short.txt"));
            String content;
            int numLines = 0;
            while ((content = reader.readLine()) != null) {
                System.out.println(content);
                numLines++;
            }
            reader.close();
            System.out.println("the number of lines: " + numLines);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}