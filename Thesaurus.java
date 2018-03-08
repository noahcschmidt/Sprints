import java.util.HashMap;
import java.util.Map;

public class Thesaurus {
    private Map<String, String> words;

    private Thesaurus() {
       words = new HashMap<>();
       words.put("Sleepy", "Tired");
       words.put("Hugry", "Ravenous");
       words.put("Happy", "Joyful");
       words.put("Dr. Perkins", "An awesome lady.");
    }


    public String findSyn(String input) {
        return words.get(input);
    }

}
