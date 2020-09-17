package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {

    private String file;
    private Map<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.file = file;
    }

    public boolean load(){
        try {
            Scanner scanner = new Scanner(Paths.get(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                add(parts[0], parts[1]);
            }
            return true;
        } catch (IOException e){
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

    public boolean save(){
        try {
            PrintWriter fileWriter = new PrintWriter (file);
            List<String> saved = new ArrayList<>();
            dictionary.keySet().forEach(k -> {
                if(saved.contains(k)){
                    return;
                }
                fileWriter.println(k + ":" + dictionary.get(k));
                saved.add(k);
                saved.add(dictionary.get(k));
            });

            fileWriter.close();
            return true;
        } catch (IOException e){
            System.out.println("error: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation){
        if(!dictionary.containsKey(words)){
            dictionary.put(words, translation);
        }
    }

    public String translate(String word){
        String translation = dictionary.get(word);
        if (translation == null){
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    translation = entry.getKey();
                }
            }
        }
        return translation;
    }

    public void delete(String word){
        if (dictionary.remove(word) == null){
            dictionary.values().removeIf(e -> e.equals(word));
        }
    }
}
