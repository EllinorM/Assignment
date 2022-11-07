package assignment;

import java.util.Arrays;
import java.util.Comparator;

public class Logic {

    int totalNumberOfWords = 0;
    int totalTextLength = 0;
    int totalNumberOfRows = 0;
    String currentLongestWord = "";

    public void GetTextLength(String text) {
        totalTextLength += text.length();
    }

    public void GetLongestWord(String text) {
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > currentLongestWord.length()) {
                currentLongestWord = words[i];
            }
        }
    }

    public boolean ShouldStop(String text) {
        return text.equalsIgnoreCase("stop");
    }

    public void TotalWords(String text) {
        String[] words = text.split(" ");
        totalNumberOfWords += words.length;
    }
    public void AddRowCount(){
        totalNumberOfRows++;
    }
}
