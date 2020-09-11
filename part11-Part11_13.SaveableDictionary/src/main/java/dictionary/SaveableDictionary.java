package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {

    private Map<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation){
        if(!dictionary.containsKey(words)){
            dictionary.put(words, translation);
        }
    }

    public String translate(String word){

    }
}
