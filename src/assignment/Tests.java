package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void wordLength() {
        //Arrange
        Logic logic = new Logic();
        String testData = "Padel";
        int expected = 5;

        //Act
       logic.GetTextLength(testData);

        //Assert
        assertEquals(expected, logic.totalTextLength);
    }

    @Test
    public void longestWord() {
        //Arrange
        Logic logic = new Logic();
        String testData = "Hej jag heter Ellinor och bor i Örebro!";
        String expected = "Ellinor";

        //Act
        logic.GetLongestWord(testData);

        //Assert
        assertEquals(expected, logic.currentLongestWord);
    }

    @Test
    public void inputEqualsStop() {
        //Arrange
        Logic logic = new Logic();
        String testData = "STOP";

        //Act
        boolean actual = logic.ShouldStop(testData);

        //Assert
        assertTrue(actual);
    }

    @Test
    public void wordQuantity() {
        //Arrange
        Logic logic = new Logic();
        String testData = "Hej jag är 36 år!";
        int expected = 5;

        //Act
        logic.TotalWords(testData);

        //Assert
        assertEquals(expected, logic.totalNumberOfWords);
    }
}
