
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        String file = "literacy.csv";
        List<String> lines = print(file);
    }

    private static List<String> print(String file) {
        List<String> linesInFile = new ArrayList<>();
        try{
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .sorted((l1,l2) -> {
                        double diff = Double.parseDouble(l1[5]) - Double.parseDouble(l2[5]);
                        if (diff < 0){
                            return -1;
                        } else if (diff > 0){
                            return 1;
                        } else {
                            return 0;
                        }
                    })
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].replaceAll("[ (%)]", "") + ", " + line[5] ));
                    //.collect(Collectors.toList());
                    //.forEach(line -> linesInFile.add(line));
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return linesInFile;
    }


//    public static void main(String[] args) {
//        try {
//            //row input format:
//            //Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
//            //row desired output format:
//            //Niger (2015), female, 11.01572
//            Files.lines(Paths.get("literacy.csv")).map(x -> x.split(","))
//                    //.sorted((x, y) -> x[5].compareTo(y[5])) this works but is bad
//                    .sorted((x, y) -> { return Double.valueOf(x[5]) < Double.valueOf(y[5]) ? -1 : 1;})
//                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].replaceAll("[^a-zA-Z]", "") + ", " + row[5]));
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
}
