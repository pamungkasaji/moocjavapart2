
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 100));
        humans.add(new Human("Merja", 1500));
        humans.add(new Human("Pertti", 80));

        humans.stream().forEach(System.out::println);
        System.out.println();
        // sorting the stream that is to be printed using the sorted method
        humans.stream().sorted().forEach(System.out::println);
        System.out.println();
        humans.stream().forEach(m -> System.out.println(m));
        System.out.println();
        // sorting a list with the sort-method of the Collections class
        Collections.sort(humans);
        humans.stream().forEach(m -> System.out.println(m));

    }
}
