import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Scanner;

public class Step4 {

    public static void step4(String fruits, String fileName) {
        try {
            Scanner reader = new Scanner(new File(fileName));
            Map<String, String> myMap = new HashMap<String, String>();
            while (reader.hasNextLine()) {
                String[] contents = reader.nextLine().split("\\s");
                myMap.put(contents[0], contents[1] + " " + contents[2] + " " +
                        contents[3]);
            }
            reader.close();
            if (myMap.containsKey(fruits)) {
                System.out.println(myMap.get(fruits));
            } else {
                System.out.println("it does not have the one you are looking for!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Type the name of fruits to see the corresponding information: ");
        Scanner reader = new Scanner(System.in);
        String fruits = reader.nextLine();
        reader.close();
        step4(fruits, args[0]);
    }
}
