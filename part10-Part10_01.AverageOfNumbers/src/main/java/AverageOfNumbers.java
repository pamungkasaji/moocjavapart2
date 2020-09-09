
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputNumbers = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputNumbers.add(inputNumbers);
        }

        double average = inputNumbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
