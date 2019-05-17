import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void When_FizzBuzz_Is_Passed_A_Number_It_Returns_That_Number() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.fizz(1));
        assertEquals("2", fizzbuzz.fizz(2));
    }

    @Test
    public void When_FizzBuzz_Is_Passed_A_Number_That_Is_A_Multiple_Of_5_It_Returns_Buzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("fizz", fizzbuzz.fizz(3));
        assertEquals("fizz", fizzbuzz.fizz(6));
    }
}