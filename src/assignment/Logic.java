package assignment;
import java.util.Arrays;
import java.util.Comparator;

public class Logic {
    public int GetTextLength(String text) {
        return text.length();
    }

    public String GetLongestWord(String text, String currentLongestWord) {
        String longest = Arrays.stream(text.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        if (longest.length() > currentLongestWord.length()) {
            return longest;
        }
        return currentLongestWord;
    }

    public boolean ShouldStop(String text) {
        return text.equalsIgnoreCase("stop");
    }

    public int TotalWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }
}
