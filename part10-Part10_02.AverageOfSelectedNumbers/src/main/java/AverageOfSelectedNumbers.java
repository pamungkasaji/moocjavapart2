
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputNumbers = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputNumbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")){
            System.out.println(printNegative(inputNumbers));
        } else {
            System.out.println(printPositive(inputNumbers));
        }
    }

    static double printNegative(ArrayList<String> inputNumbers){
        return inputNumbers.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
    }

    static double printPositive(ArrayList<String> inputNumbers){
        return inputNumbers.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
    }
}
