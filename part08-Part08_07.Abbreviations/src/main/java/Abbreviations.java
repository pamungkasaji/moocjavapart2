
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Jere
 */
public class Abbreviations {

    private Map<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return abbreviations.get(abbreviation);
    }
}
