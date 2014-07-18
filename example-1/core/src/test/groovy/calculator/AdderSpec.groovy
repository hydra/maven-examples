package calculator

import spock.lang.Specification

/**
 * Created by dominic.clifton on 18/07/2014.
 */
class AdderSpec extends Specification {

    Adder adder

    void setup() {
        adder = new Adder()
    }

    void 'create instance'() {
        expect:
            adder
    }

    void 'add'() {
        expect:
            adder.add(1, 2) == 3
    }
}
