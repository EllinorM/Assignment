package assignment;

import java.util.Scanner;

public class ReadingResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();

        System.out.println("Write a story, when you´re done, write: stop");
        String text = scan.nextLine();

        while (!logic.ShouldStop(text)) {
            //Kollar så text inte är null och tom sträng
            if (text != null && !text.trim().isEmpty()) {
                logic.TotalWords(text);
                logic.GetTextLength(text);
                logic.GetLongestWord(text);
                logic.AddRowCount();
            }

            text = scan.nextLine();
        }

        System.out.println("Total words: " + logic.totalNumberOfWords);
        System.out.println("Total number of rows: " + logic.totalNumberOfRows);
        System.out.println("Total number of characters: " + logic.totalTextLength);
        System.out.println("Longest word: " + logic.currentLongestWord);
    }
}
