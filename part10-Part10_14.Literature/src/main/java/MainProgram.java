
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = read(scanner);
        print(books);
    }

    private static List<Book> read(Scanner scanner) {
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            String age = scanner.nextLine();
            books.add(new Book(name, Integer.parseInt(age)));
            System.out.println("");
        }
        return books;
    }

    private static void print(List<Book> books) {
        System.out.println("\n"+books.size() + " books in total.\n\nBooks:");
        Comparator<Book> bookComparator = Comparator
                .comparing(Book::getAgeRecommended)
                .thenComparing(Book::getName);
        Collections.sort(books, bookComparator);
        books.stream().forEach(System.out::println);
    }
}
