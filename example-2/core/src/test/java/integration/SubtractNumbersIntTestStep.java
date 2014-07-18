package integration;

import calculator.Subtractor;
import core.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dominic.clifton on 18/07/2014.
 */
public class SubtractNumbersIntTestStep {

    @Test
    public void subtractNumbers() {
        Calculator calculator = new Calculator();
        Subtractor subtractor = new Subtractor();
        calculator.setSubtractor(subtractor);

        assertEquals(100, calculator.subtractNumbers(300, 200));
    }
}
