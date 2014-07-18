package integration;

import calculator.Subtractor;
import core.Calculator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categories.IntegrationTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by dominic.clifton on 18/07/2014.
 */
@Category(IntegrationTest.class)
public class SubtractNumbersTest {

    @Test
    public void subtractNumbers() {
        Calculator calculator = new Calculator();
        Subtractor subtractor = new Subtractor();
        calculator.setSubtractor(subtractor);

        assertEquals(100, calculator.subtractNumbers(300, 200));
    }
}
