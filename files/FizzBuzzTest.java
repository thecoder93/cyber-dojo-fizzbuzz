import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzTest {

    @Test
    void test_should_return_a_number() {
        String expected = "1";
        FizzBuzz number = new FizzBuzz();
        String actual = number.answer(expected);
        assertEquals(expected, actual);
    }
    
}
