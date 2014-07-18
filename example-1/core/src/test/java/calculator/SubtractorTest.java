package calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dominic.clifton on 18/07/2014.
 */
public class SubtractorTest {
    private Subtractor subtractor;

    @Before
    public void setup() {
        subtractor = new Subtractor();
    }

    @Test
    public void createInstance() {
        assertNotNull(subtractor);
    }

    @Test
    public void subtract() {
        assertEquals(1, subtractor.subtract(3, 2));
    }
}
