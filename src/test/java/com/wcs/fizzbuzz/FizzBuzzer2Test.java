package com.wcs.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzer2Test {

    private FizzBuzzer2 fizzBuzzer = new FizzBuzzer2();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(3));
    }
    @Test
    public void executeShouldReturnFizzIfContains3() {
        assertEquals("fizz", fizzBuzzer.execute(311));
    }

    @Test
    public void executeShouldReturnFizzIfContains5() {
        assertEquals("buzz", fizzBuzzer.execute(151));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("7", fizzBuzzer.execute(7));
    }

}
