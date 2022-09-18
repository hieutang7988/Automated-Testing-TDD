import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void converter1() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(77);
        String expectResult = "sevenseven";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void converter2() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(6);
        String expectResult = "Fizz";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void converter3() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(25);
        String expectResult = "Buzz";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void converter4() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(15);
        String expectResult = "FizzBuzz";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void converter5() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(31);
        String expectResult = "Fizz";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }

    @org.junit.jupiter.api.Test
    void converter6() {
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(151);
        String expectResult = "Buzz";
        String actualResult = fizzBuzzTranslate.converter();
        Assertions.assertEquals(expectResult, actualResult);
    }
}