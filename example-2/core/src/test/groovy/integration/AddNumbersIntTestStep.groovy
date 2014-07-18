package integration

import calculator.Adder
import core.Calculator
import spock.lang.Specification

/**
 * Created by dominic.clifton on 18/07/2014.
 */
class AddNumbersIntTestStep extends Specification {

    void 'add numbers'() {
        given:
            Calculator core = new Calculator()
            core.adder = new Adder()

        expect:
            core.addNumbers(100, 200) == 300
    }
}
