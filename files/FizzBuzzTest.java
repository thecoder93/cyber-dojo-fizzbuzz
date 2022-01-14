import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class FizzBuzzTest {
    
    private FizzBuzz number;
    
    @BeforeEach 
    void init() {
        number = new FizzBuzz();
    }

    @Test
    void test_should_return_a_number() {
        int expected = 1;
        String actual = number.answer(expected);
        assertEquals("1", actual);
    }
    
    @Test
        void test_should_return_fizz_for_three(){
        int expected = 3;
        String actual = number.answer(expected);
        assertEquals("Fizz", actual);
    }
    
       @Test
        void test_should_return_buzz_for_five(){
        int expected = 5;
        String actual = number.answer(expected);
        assertEquals("Buzz", actual);
    }
    
    @Test
    void test_should_return_fizz_or_buzz_or_number(){
        for(int i=0; i<=100; i++){
            System.out.println(number.answer(i));
        }
    }
}
