package app.webparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalysis {

    private String[] splitWords;

    public void setSplitWords(String path) {
        try {
            String content = new Scanner(new File(path)).useDelimiter("\\Z").next().toUpperCase();
            this.splitWords = content.split("['\\s', '\\n', '\\r', '\\t', ',', '.', '!', '?', '\"', ';', ':', '[', ']', '(', ')']");
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map wordCount() {
        Map<String, Integer> occurrences = new HashMap<String, Integer>();

        for (String word : splitWords) {
            if (word.matches("^[a-zA-Z,а-яА-Я]+$")) {
                Integer oldCount = occurrences.get(word);
                if (oldCount == null) {
                    oldCount = 0;
                }
                occurrences.put(word, oldCount + 1);
            }
        }
        for (Map.Entry entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(occurrences.size());
        return occurrences;
    }

}
