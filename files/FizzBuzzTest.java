import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzTest {

    @Test
    void test_should_return_a_number() {
        int expected = 1;
        FizzBuzz number = new FizzBuzz();
        int actual = number.answer(expected);
        assertEquals(expected, actual);
    }
    
    
}
