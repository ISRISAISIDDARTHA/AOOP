import java.util.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a sample text. This text is just a sample";
        text = text.toLowerCase();
        String[] words = text.split("\\W+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : uniqueWords) {
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }
            wordFrequency.put(word, count);
        }
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}