package week06d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {
        WordEraser wordEraser = new WordEraser();
        String original = "alma körte barack alma szilva körte birsalma";
        String result = "körte barack szilva körte birsalma";
        Assertions.assertEquals(result, wordEraser.eraseWord(original, "alma"));
    }

}
