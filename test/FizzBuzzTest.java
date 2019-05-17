import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void When_FizzBuzz_Is_Passed_A_Number_It_Returns_That_Number() {
        assertEquals("1", fizzbuzz.fizz(1));
        assertEquals("2", fizzbuzz.fizz(2));
    }

    @Test
    public void When_FizzBuzz_Is_Passed_A_Number_That_Is_A_Multiple_Of_3_It_Returns_Buzz() {
        assertEquals("fizz", fizzbuzz.fizz(3));
        assertEquals("fizz", fizzbuzz.fizz(6));
    }

    @Test
    public void When_FizzBuzz_Is_Passed_A_Number_That_Is_A_Multiple_Of_5_It_Returns_Buzz() {
        assertEquals("buzz", fizzbuzz.fizz(5));
        assertEquals("buzz", fizzbuzz.fizz(10));
    }
}