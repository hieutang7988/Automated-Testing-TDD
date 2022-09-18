import org.junit.Test;

import static org.junit.Assert.*;

public class testTest {
    @Test
    public void FizzBuzzTestCase1() {
        int number = 12;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void FizzBuzzTestCase2() {
        int number = 13;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void FizzBuzzTestCase3() {
        int number = 14;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String expectedResult = "14";
        String actualResult = fizzBuzz.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void FizzBuzzTestCase4() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void FizzBuzzTestCase5() {
        int number = 52;
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.toString();
        assertEquals(expectedResult, actualResult);
    }
}