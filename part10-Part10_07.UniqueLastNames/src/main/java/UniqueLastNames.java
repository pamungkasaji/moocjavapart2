
import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        processInput(scanner);
    }

    private static void processInput(Scanner scanner) {
        ArrayList<Person> people = new ArrayList<>();

        while (true){
            System.out.println("Continue personal information input? \"quit\" ends:");
            String input = scanner.nextLine();

            if (input.equals("quit")){
                break;
            }

            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Input the year of birth: ");
            int year = Integer.parseInt(scanner.nextLine());

            people.add(new Person(firstName, lastName, year));
        }

        printUniqueLastNames(people);
    }

    private static void printUniqueLastNames(ArrayList<Person> people) {
        people.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));
    }


//    public static void main(String[] args) {
//        ArrayList<Person> persons = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Continue personal information input? \"quit\" ends:");
//            String continueQ = "quit";
//            if(scanner.hasNextLine()){continueQ = scanner.nextLine();}
//
//            if (continueQ.equals("quit")) {
//                break;
//            }
//
//            System.out.print("Input first name: ");
//            String firstName = "NaN";
//            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
//            System.out.print("Input last name: ");
//            String lastName = "NaN";
//            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
//            System.out.print("Input the year of birth: ");
//            int birthYear = 0;
//            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}
//
//            persons.add(new Person(firstName, lastName, birthYear));
//            System.out.println("");
//        }
//        persons.stream().map(person -> person.getLastName()).distinct().sorted().forEach(System.out::println);
//    }
}
