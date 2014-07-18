package integration

import calculator.Adder
import core.Calculator
import spock.lang.Specification
import test.categories.IntegrationTest

/**
 * Created by dominic.clifton on 18/07/2014.
 */
@org.junit.experimental.categories.Category(IntegrationTest)
class AddNumbersSpec extends Specification {

    void 'add numbers'() {
        given:
            Calculator core = new Calculator()
            core.adder = new Adder()

        expect:
            core.addNumbers(100, 200) == 300
    }
}
