package ninja.javafx.smartcsv.preferences;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class CharsetHelperTest {

    @Test
    public void getCharsetName_known_charset() {
        String result = CharsetHelper.getCharsetName("UTF-16");
        assertEquals(StandardCharsets.UTF_16.name(), result);
    }

    @Test
    public void getCharsetName_unknown_charset() {
        String result = CharsetHelper.getCharsetName("foobar");
        assertEquals(StandardCharsets.UTF_8.name(), result);
    }

    @Test
    public void getCharsetName_null_charset() {
        String result = CharsetHelper.getCharsetName(null);
        assertEquals(StandardCharsets.UTF_8.name(), result);
    }

}
