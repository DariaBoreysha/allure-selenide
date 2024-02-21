import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodewarTest {

/*    private static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void init() {
        setup();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }*/

    @Test
    public void check123Test() {
        int a = 5;
        int b = 10;
        int c = a + b;
        assertEquals(15, c);
    }
}
