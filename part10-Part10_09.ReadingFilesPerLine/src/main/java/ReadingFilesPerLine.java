
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        String fileName = "file.txt";
        List<String> lineList = read(fileName);
        lineList.stream()
                .forEach(line -> System.out.println(line));
    }

    public static List<String> read(String file){
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }

//    public static List<String> read(String file) {
//        List<String> fileAsStream = new ArrayList<>();
//        try {
//            fileAsStream = Files.lines(Paths.get(file)).collect(Collectors.toList());
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        return fileAsStream;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//    }
}
