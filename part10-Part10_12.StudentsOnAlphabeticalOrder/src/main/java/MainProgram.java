import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("wdag"));
        students.add(new Student("etdg"));
        students.add(new Student("ghfb"));

        students.stream().forEach(System.out::println);
        System.out.println();
        // sorting the stream that is to be printed using the sorted method
        students.stream().sorted().forEach(System.out::println);
        System.out.println();
        students.stream().forEach(m -> System.out.println(m));
        System.out.println();
        // sorting a list with the sort-method of the Collections class
        Collections.sort(students);
        students.stream().forEach(m -> System.out.println(m));
    }
}
