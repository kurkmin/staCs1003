// The Comparable interface is used to define how a class is to be sorted. It is
// not to be confused with the Comparator interface, which is implemented in a
// separate class. The Comparable interface is implemented in the class to be
// sorted.
public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // b. comparable (an interface used to order the objects of user-defined
    // classes)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

}
