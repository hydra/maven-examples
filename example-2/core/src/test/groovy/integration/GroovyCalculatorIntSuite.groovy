package integration

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.junit.runners.Suite
/**
 * Created by dominic.clifton on 18/07/2014.
 */

/*
 .class is needed on SubtractNumbersIntTestStep below otherwise a compiler error occurs when building using gmavenplus.
 the problem seems to be because the SubtractNumbersIntTestStep is a java class in the same package as the test.

 */
@RunWith(Suite)
@Suite.SuiteClasses([
        AddNumbersIntTestStep,
        SubtractNumbersIntTestStep.class
])
class GroovyCalculatorIntSuite {

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Groovy Calculator Integration Test Setup");

    }

    @AfterClass public static void tearDownClass() {
        System.out.println("Groovy Calculator Integration Test Teardown");
    }
}
