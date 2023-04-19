package edu.sda.java.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator calculator;

    @BeforeAll
    public static void mainSetup() {
        /**
         * method to run once for all tests before them
         * I.E property entry data set
         */
    }

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

    @Test
    public void checkIfCalcReturnsSumOfTwoPassedNumbers() {
        //given
        String entry = "3,4";
        //when
        var result = calculator.sum(entry);
        //then
        assertEquals(7,result,"Result is 7");
    }

    @Test
    public void testUnknownAmountOfNumbers() {
        //given
        String entry = "1,2,3,4,5";
        //when
        var result = calculator.sum(entry);
        //then
        assertEquals(15, result, "Unknown number of Numbers is accepted, result is 15");
    }

    @Test
    public void testSeparatingNumbersWithNewLinesAndCommas() {
        //given
        String entry = "1\n2,3,4";
        //when
        var result = calculator.sum(entry);
        //then
        assertEquals(10, result,"New lines are accepted as separator, result is 10");
    }

    @Test
    public void checkIfCalculatorAcceptDelimiters() {
        //given
        String entries = "//;\n1;2";
        //when
        var result = calculator.sum(entries);
        //then
        assertEquals(3,result,"Different delimiters accepted, result is 3");
    }
    @Test
    public void testPassingNegativeNumbers() {
        //given
        String entries = "-5";
        //when
        var result = calculator.sum(entries);
        //then
        assertEquals("Negatives not allowed: -5", result,"Returns message and entries");
    }

    @AfterEach // run after each test
    public void destroy() {
        calculator.hashCode(); //may be useful to return to previous app state
    }

    @AfterAll
    public static void finalCleanup() {
        /**
         * run once after all test
         */
    }
}


/**
 * TDD - test driven development
 *3 stages: RED, GREEN, REFACTOR
 *
 * 1. First most generic, not working code
 * 2. Write test to check scenario
 * 3. As scenario fails, fix the code
 * 4. To add new feature go to 2.
 */
/**
 * Co mamy wiedzieć o testach?
 * - Jak odpalać testy?
 * - Anotacja @Test żeby metoda była testem
 * - Sprawdzamy jakimś assertem (assert.equals sprawdza każda pojedynczą wartość,
 *   zawartość tabel)
 * - Piszemy testy z podziałem: given, when, then
 * - Podejście tdd (najpierw test, potem kod właściwy ktory będzie nam zwracał
 *   zaliczony test)
 */
