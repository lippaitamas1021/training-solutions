package exam02;

import org.junit.jupiter.api.Test;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoReaderTest {

    @Test
    public void testCreate() {
        InputStream inputStream = LottoReader.class.getResourceAsStream("/otos.csv");
        LottoReader lottoReader = new LottoReader(inputStream);
        assertEquals(190, lottoReader.getNumbers(1));
        assertEquals(148, lottoReader.getNumbers(5));
        assertEquals(185, lottoReader.getNumbers(22));
        assertEquals(172, lottoReader.getNumbers(90));
    }
}
