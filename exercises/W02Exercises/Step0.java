import java.io.*;

public class Step0 {
    public static void main(String[] args) {
        // basic io
        try {
            // write a new file in the current directory
            PrintWriter writer = new PrintWriter("hello.txt");
            writer.println("hello");
            writer.close();
            // read the contents of the file
            BufferedReader reader = new BufferedReader(
                    new FileReader("hello.txt"));
            String contents = reader.readLine();
            System.out.println(contents);
            reader.close();
        } catch (IOException e) {
            System.out.println("cant find");
        }
    }
}
