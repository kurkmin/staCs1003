import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {

        // * task 1: create a List and iterate it
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Yellow");
        myArrayList.add("Red");
        myArrayList.add("Blue");

        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("BMW");
        myLinkedList.add("Mercedes");
        myLinkedList.add("Audi");

        // a. index iteration
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        // b. for-each loop iteration
        for (String str : myArrayList) {
            System.out.println(str);
        }

        for (String str : myLinkedList) {
            System.out.println(str);
        }

        // c. an iterator object iteration
        Iterator<String> myArrayListIterator = myArrayList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }
        Iterator<String> myLinkedListIterator = myLinkedList.iterator();
        while (myLinkedListIterator.hasNext()) {
            System.out.println(myLinkedListIterator.next());
        }

        // * task 2: create a set, which does not allow any duplication
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        // this won't be added due to duplication
        mySet.add(1);
        System.out.println(mySet);

        // * task 3: create a list to perform operations
        List<Integer> thirdList = new ArrayList<>();
        thirdList.add(2);
        thirdList.add(1);
        thirdList.add(5);
        System.out.println(thirdList);
        // sort in an ascending order
        Collections.sort(thirdList);
        System.out.println(thirdList);
        // sort in an descending order
        Collections.reverse(thirdList);
        System.out.println(thirdList);

        // * task 4: two sets of Strings representing different gorups of animals
        Set<String> mammals = new HashSet<>();
        mammals.add("monkey");
        mammals.add("human");
        Set<String> fish = new HashSet<>();
        fish.add("cod");
        fish.add("seabass");
        // it removes all the elements that are not in fish set
        // mammals.retainAll(fish);
        // it will add fish set to mammals set
        mammals.addAll(fish);
        mammals.removeAll(fish);
        System.out.println(mammals);

        // * task 5: create a map where country names and values are their capitals
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("Korea", "Seoul");
        myMap.put("United Kingdom", "London");
        // return a value assiged to "Korea" key
        System.out.println(myMap.get("Korea"));
        // return a set of keys in the set
        System.out.println(myMap.keySet());
        // return a set view of the mappings in the set
        // e.g. [United Kingdom=London, Korea=Seoul]
        System.out.println(myMap.entrySet());
        // return all the values in the set
        System.out.println(myMap.values());

        // !* task 6: Create a List of custom objects (e.g., Student with name and age).
        // Write a function to sort the list by age.
        // Concepts Covered: Custom Comparator or Comparable implementation.

        // a. Comparator (an interface used to order the objects of user-defined
        // classes)
        List<Student> sixthList = new ArrayList<>();
        Student student1 = new Student("Sumin", 27);
        Student student2 = new Student("Alicia", 26);
        Student student3 = new Student("Bob", 38);
        sixthList.add(student1);
        sixthList.add(student2);
        sixthList.add(student3);
        sixthList.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println(sixthList);

        // b. comparable
        // sixthList.sort(null);
        // System.out.println(sixthList);

        // // !* task 7 modify map in task 5 to add more info
        Map<String, String> myNewMap = new HashMap<String, String>();
        myNewMap.put("Korea", "capital: Seoul, population: 50m");
        myNewMap.put("United Kingdom", "capital: London, population: 70m");

        // a. default map iteration
        for (String value : myNewMap.values()) {
            System.out.println(value);
        }

        // b. Map.Entry (key-value pair)
        for (Map.Entry<String, String> entry : myNewMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // c. for each iteration
        myNewMap.forEach((k, v) -> System.out.println(v));

        // * task 8: advanced set operations
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Crippled America", "Trump");
        Book book2 = new Book("Tesla story", "Musk");
        books.add(book1);
        books.add(book2);
        // ! implement equals and hashcode

        // * task 9: HashSet vs TreeSet
        Set<String> myHashSet = new HashSet<>();
        Set<String> myTreeSet = new TreeSet<>();
        myHashSet.add("Hello");
        myTreeSet.add("Hello");
        myHashSet.add("Bonjour");
        myTreeSet.add("Bonjour");
        // HashSet: descending natural ordering
        System.out.println(myHashSet);
        // TreeSet: ascending natural ordering
        System.out.println(myTreeSet);
        // ! hashcode implementation / performance

        // * task 10: HashMap
        Map<String, String> newHashMap = new HashMap<>();
        Map<String, String> newTreeMap = new TreeMap<>();
        newHashMap.put("Korea", "Seoul");
        newTreeMap.put("Korea", "Seoul");
        newHashMap.put("United Kingdom", "London");
        newTreeMap.put("United Kingdom", "London");
        System.out.println(newHashMap);
        System.out.println(newTreeMap);
        // ! performance charactersitics and null handling
    }
}
