package edu.sda.java.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    /**
     * TDD - test driven development
     *3 stages: RED, GREEN, REFACTOR
     *
     * 1. First most generic, not working code
     * 2. Write test to check scenario
     * 3. As scenario fails, fix the code
     * 4. To add new feature go to 2.
     */

    private StringCalculator calculator;
    @BeforeEach //Indicates that method should be run  before each test  in the class
    public void setup() {
        calculator = new StringCalculator();
    }
    @Test
    public void checkIfZeroWhenEmptyStringPassed() {
        //given: mając takie dane
            String entry = "";
        //when: zajdzie jakieś działanie
            int result = calculator.sum(entry);
        //then: otrzymamy taki wynik
            assertEquals(0,result, "Result not equal to zero");
    }

    @Test
    public void checkIfCalcReturnsOneNumberPassed() {
        //given
        String entry = "5";
        //when
        var result = calculator.sum(entry);
        //then
        assertEquals(5, result,"Invalid value");
    }
}
