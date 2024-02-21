import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Selenide;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodewarTest {

    private static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void init() {
        setup();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    @Test
    public void check123Test() {
        int a = 5;
        int b = 10;
        int c = a + b;
        assertEquals(15, c);
    }
}
