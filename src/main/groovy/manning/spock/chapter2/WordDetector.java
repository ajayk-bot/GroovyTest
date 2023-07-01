package manning.spock.chapter2;

import java.util.*;
import java.util.Map.Entry;

/**
 * A sample class that takes a block of text and counts the occurences of words
 *
 * @author Kostis
 */
public class WordDetector {
    private Map<String, Integer> countPerWord = new HashMap<>();

    public void parseText(String text) {
        System.out.println("Called parseText method");
        countPerWord.clear();
        feedText(text);
    }

    public WordDetector feedText(String text) {
        String[] words = text.split("[\\s,:]"); //Code used only for illustration purposes
        for (String word : words) {
            System.out.println(word);
            recordCount(word);
        }
        return this;
    }


    private void recordCount(String word) {
        if (!countPerWord.containsKey(word)) {
            countPerWord.put(word, 0);
        }
        int now = countPerWord.get(word);
        countPerWord.put(word, now + 1);
    }

    public int wordsFound() {
        return countPerWord.size();
    }

    public Collection<String> duplicatesFound() {
        List<String> result = new ArrayList<>();

        for (Entry<String, Integer> entry : countPerWord.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    //self written method to practise

    public boolean hasDuplicateWords(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String[] words = input.split("\\s+"); // Split the input string into words

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.add(word.toLowerCase())) {
                // If the word already exists in the set, it's a duplicate
                return true;
            }
        }

        return false;
    }


}
