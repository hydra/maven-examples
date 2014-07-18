package integration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by dominic.clifton on 18/07/2014.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddNumbersIntTestStep.class,
        SubtractNumbersIntTestStep.class
})
public class JavaCalculatorIntSuite {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Java Calculator Integration Test Setup");

    }

    @AfterClass public static void tearDownClass() {
        System.out.println("Java Calculator Integration Test Teardown");
    }
}
