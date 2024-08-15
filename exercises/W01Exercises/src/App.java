import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        // * task 1: create a List and iterate it
        List<String> myList = new ArrayList<>();
        myList.add("Yellow");
        myList.add("Red");
        myList.add("Blue");

        // a. index iteration
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // b. for-each loop iteration
        for (String str : myList) {
            System.out.println(str);
        }

        // c. an iterator object iteration
        Iterator<String> myListIterator = myList.iterator();
        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }
    }
}
