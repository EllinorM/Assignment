package assignment;


import java.util.Scanner;

public class ReadingResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic logic = new Logic();
        int totalNumberOfWords = 0;
        int totalTextLength = 0;
        int totalNumberOfRows = 0;

        String longestWord = "";
        System.out.println("Write a story, when you´re done, write: stop");
        String text = scan.nextLine();
        while (!logic.ShouldStop(text)) {
            totalNumberOfWords += logic.TotalWords(text);
            totalTextLength += logic.GetTextLength(text);
            longestWord = logic.GetLongestWord(text, longestWord);
            totalNumberOfRows++;

            text = scan.nextLine();
        }

        System.out.println("Total words: " + totalNumberOfWords);
        System.out.println("Total number of rows: " + totalNumberOfRows);
        System.out.println("Total number of characters: " + totalTextLength);
        System.out.println("Longest word: " + longestWord);
    }
}
