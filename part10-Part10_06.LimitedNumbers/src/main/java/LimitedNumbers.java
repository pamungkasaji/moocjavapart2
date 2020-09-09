
import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input < 0){
                break;
            }
            inputs.add(input);
        }
        inputs.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(System.out::println);
                //.forEach(number -> System.out.println(number));
    }
}
