package core

import spock.lang.Specification

/**
 * Created by dominic.clifton on 18/07/2014.
 */
class CalculatorSpec extends Specification {
    void 'create instance'() {
        expect:
            new Calculator()
    }
}
