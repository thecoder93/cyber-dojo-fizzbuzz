import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzTest {

    @Test
    void test_should_return_a_number() {
        int expected = 1;
        FizzBuzz number = new FizzBuzz();
        String actual = number.answer(expected);
        assertEquals(expected, actual);
    }
    
    @Test
        void test_should_return_fizz_for_three(){
        int expected = 3;
        FizzBuzz number = new FizzBuzz();
        String actual = number.answer(expected);
        assertEquals("Fizz", actual);
    }
    
       @Test
        void test_should_return_buzz_for_five(){
        int expected = 5;
        FizzBuzz number = new FizzBuzz();
        String actual = number.answer(expected);
        assertEquals("Buzz", actual);
    }
    
        @Test
        void test_should_return_fizz_for_multiple_of_three(){
        int expected = 5;
        FizzBuzz number = new FizzBuzz();
        String actual = number.answer(expected);
        assertEquals("Buzz", actual);
    }
}
